import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("Bill",23,"Address"),
                                             new Person("Jack",63,"Address"),
                                             new Person("Ann",27,"Address"),
                                             new Person("Harry",20,"Address"));

        persons.stream()
                .sorted(new PersonComparatorAge())
                .forEach(person -> System.out.println(person.getName()));

        // min() и max() - возвращают соответственно минимальное или максимальное значение.
        // ,принимают компаратор и возвращают ответ обернутый в Optional
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8);

        Optional<Integer> min = ints.stream().min(Integer::compare);
        Optional<Integer> max = ints.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());

        // метод reduce()
        OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println(reduce.getAsInt());
        // reduced = 1+2+3

        int reduce1 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reduce1);
        // reduced = 10 +1+2+3
// collect() method



        // collect elements in one string with Collectors.joining
        //joining()
        String collect = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining());
        System.out.println(collect);

        // joining( delimeter)
        String collect1 = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining(":"));
        System.out.println(collect1);

        //joining (delimeter,prefix,suffix)
        String collect2 = Stream.of("h", "e", "l", "l", "o")
                .collect(Collectors.joining(":","< "," >"));
        System.out.println(collect2);

        /*
        hello
        h:e:l:l:o
        < h:e:l:l:o >
         */

        //группировка элементов в соответствии с заданным критерием метод groupingBy
        Food product = new Food("bread",4);
        Food product1 = new Food("sugar",4);
        Food product2 = new Food("orange",10);
        Food product3 = new Food("salt",10);

        List<Food> products =new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product);

        Map<Integer,List<Food>>groupFood = products.stream().collect(Collectors.groupingBy(Food::getPrice));
        System.out.println(groupFood);
//{4=[sugar, bread], 10=[orange, salt]}

        // разделение элементов стрима на группы в соответствии с заданным критерием метод partitioningBy()

        Map<Boolean,List<Food>> mapDivided = products.stream()
                .collect(Collectors.partitioningBy(p->p.getPrice()>9));
        System.out.println(mapDivided);

        //подсчет среднего значения цифровых элементов
        Double price = products.stream().collect(Collectors.averagingInt(Food::getPrice));
        System.out.println(price);

        int sum = products.stream().collect(Collectors.summingInt(Food::getPrice));
        System.out.println(sum);

        // Parallel streams  Параллельные потоки
        //  создаются с помощью методов parallelStream() или parallel()
       // products.parallelStream()

        List<String> names = Arrays.asList("Jack","Tom","Jill","Kate");
        System.out.println(names);
        System.out.println("Stream:");
        names.stream().filter(n->n.length() == 4).forEach(System.out::println);

        System.out.println();
        System.out.println("Parallel stream:");
        names.parallelStream().filter(n->n.length() == 4).forEach(System.out::println);



    }
}
