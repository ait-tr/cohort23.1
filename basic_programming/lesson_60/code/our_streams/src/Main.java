import java.util.*;
import java.util.stream.*;

public class Main {
    // способы создания стримов
    /*
    Stream.empty() - пустой стрим
    list.stream() - стрим из списка
    map.entrySet().stream() - стрим из мапы
    Arrays.stream(array) - стрим из массива
    Stream.of(1,2,3,4,5) - стрим из элементов

    В потоке есть промежуточные (intermediate) элементы и терминальные (terminal).
    Промежуточные - обрабатывают поступающие элементы из потока  и возвращают тоже стрим.
                    Промежуточных элементов может быть много.
    Теримнальные - обрабатывают поступающие к ним  элементы    и завершают работу потока.
                    Терминальный оператор может быть только один

    Промежуточные операторы - "ленивые", т.е. обработка не начинается пока не будет вызван терминальный
    оператор
    Экземпляр стрима можно использовать только один раз.


    Промежуточные операторы

     */
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,3); // генерирует  поток с шагом 1 упорядоченных элементов от
        // первого до последнего , не включая последний.

        LongStream longStream = LongStream.rangeClosed(1,3); //генерирует  поток с шагом 1 упорядоченных элементов от
        // первого до последнего ,  включая последний.

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);//поток из случайных чисел

        // метод forEach является терминальным и  используется для перебора элементов в стриме.
        // Действие совершается для каждого элемента стрима
     //   Stream<String> names = Stream.of ("Jack","John","Bill","Jill","Barbara","Helen");
     //   names.forEach(s-> System.out.println(s));
     //   names.forEach(System.out::println);

        // промежуточные операторы

        //метод filter() -  принимает условие в виде предикаты и возвращает поток из тех элементов,
       // которые удовлетворяют этому условию

        Stream<String> names1 = Stream.of ("Jack","John","Bill","Jill","Barbara","Helen");

   //     names1.filter(s->s.length() == 4).forEach(s-> System.out.println(s));

        Person person = new Person("Jack",45);
        Person person1 = new Person("John",35);
        Person person2 = new Person("Helen",25);
        Person person3 = new Person("Barbara",15);
        List<Person> names = List.of(person,person1,person2,person3);
        names.stream()
                .filter(p->p.getAge()<30)
                .forEach(p-> System.out.println(p.getName()));

        // 2. метод map() -  служит для преобразования одного обьекта в другой. принимает Function
        System.out.println("printing names only");
        names.stream()
                .map(p->p.getName())
              //  .map(Person::getName)
                .forEach(name-> System.out.println(name));
              //  .forEach(System.out::println);

        //3. flatMap - при работе например  с массивом, списком и т.д. стримов, преобразует
       // их в один стрим
        //[stream1, stream2, stream3] -> stream
       // map преобразует вот так :  [stream1, stream2, stream3] -> Stream of (stream1, stream2, stream3)


        //flatMapToInt
        System.out.println("for flatMap:");
        Stream.of(2,3,1) // стрим целых чисел
                .flatMapToInt(num -> IntStream.range(0,num))  // стримы целых чисел в диапазоне до num
                .forEach(System.out::print);  //010120

        // map
        System.out.println();
        System.out.println("for map:");
        Stream.of(2,3,1) // стрим целых чисел
                .map(num -> IntStream.range(0,num))  // стримы целых чисел в диапазоне до num
                .forEach(System.out::print);  //010120

        // сортировка sorted()
        System.out.println("Sorted");
        List<String> namesSort = new ArrayList<>();
        Collections.addAll(namesSort,"Jack","Ann","Bill","Harry","Barbara");

        namesSort.stream()
                .filter(name -> name.length()<7)
                .sorted()
                .forEach(System.out::println);

        /*
Ann
Bill
Harry
Jack

         */

// distinct () -  возвращает не повторяющиеся элементы
        namesSort.add("Ann");
        namesSort.add("Jack");
        System.out.println(namesSort);
        namesSort.stream()
                .distinct()
                .forEach(name-> System.out.println(name));
// skip(long n)  используется для пропуска n элементов. Возвращает стрим, в котором пропушены первые n  элементов
// limit (long n) - выбирает первые n  элементов из потока

namesSort.stream()
        .skip(1)
        .limit(2)
        .forEach(name-> System.out.println(name));

// терминальные операции
        // count - возвращает количество элементов в потоке
        long count = namesSort.stream().count();
        System.out.println(count);

        // findFirst, findAny - извлекает из стрима первый элемент, findAny -  извлекает случайный элемент
        Optional<String> first = namesSort.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = namesSort.stream().findAny();
        System.out.println(any.get());

        // allMatch, anyMatch, noneMatch
        // allMatch - true  если все элементы потока удовлетворяют условию
        // aтяMatch - true  если хотя бы элемент потока удовлетворяют условию
        // allMatch - true  если ни один из  элементов потока не  удовлетворяют условию

        namesSort.stream().anyMatch(name -> name.length()==4);
        namesSort.stream().allMatch(name -> name.length()<40);
        namesSort.stream().noneMatch(name -> name.equals("Evgeny"));

        //method collect
        List<String> namesFiltered = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toList());
        System.out.println(namesFiltered);


        Set<String> namesToSet = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toSet());
        System.out.println(namesToSet);



    }
    //

}
