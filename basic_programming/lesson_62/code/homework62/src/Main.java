import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ann",25,"Street1");
        Person person2 = new Person("Jack",37,"Street2");
        Person person3 = new Person("Kate",25,"Street3");
        Person person4 = new Person("John",37,"Street4");
        Person person5 = new Person("Peter",67,"Street5");
        Person person6 = new Person("Peter1",17,"Street5");
        List<Person>names = new ArrayList<>();
        names.add(person1);
        names.add(person2);
        names.add(person3);
        names.add(person4);
        names.add(person5);
        names.add(person6);

        System.out.println(getListByAge(names));
        /*
        {67=[Person{name='Peter', age=67, address='Street5'}],
        37=[Person{name='Jack', age=37, address='Street2'}, Person{name='John', age=37, address='Street4'}],
        25=[Person{name='Ann', age=25, address='Street1'}, Person{name='Kate', age=25, address='Street3'}]}
         */

        // 67 ->[Peter]
        //37 -> [Jack,John]
        //25 -> [Ann, Kate]
       // getListByAge(names).
        getListByAge(names).forEach((k,v) -> System.out.println(k+ "->"+v.stream()
                                                .map(Person::getName).collect(Collectors.toList())));

        System.out.println("total age of persons older than 17 is "+countAge(names));
        System.out.println("total age of persons older than 17 is "+countAgeReduce(names));

        System.out.println(isLegalAge(names));
        //in Germany Ann and Jack and Kate and John and Peter are of legal age
    }

    /*
     **
     * Задача1
     * Есть класс Person с полями
     * String name
     * int age
     * String address
     * <p>
     * Используя стримы, написать метод, принимающий список персонов и
     * возвращающий мапу, где возраст является ключом, а список персонов этого
     * возраста значением
     */
    public static Map<Integer, List<Person>> getListByAge(List<Person> input){
        return input.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }
    /*
     * Задача2
     * Используя тот же класс Person, написать метод, принимающий список
     * персонов и возвращающий общий возраст тех, кто старше 17 лет.
     */
    public static int countAge (List<Person> input){
        return input
                .stream()
                .filter(p->p.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static int countAgeReduce (List<Person>input){

        return input
                .stream()
                .filter(s -> s.getAge() > 17)
                .map(Person::getAge)
                .reduce(0,Integer::sum);

                //, a+b
                // 2 5 3 4 1

        /*
total age of persons older than 17 is 191
total age of persons older than 17 is 191
         */
    }

    /*
     * Задача 3
     * Написать метод, принимающий список персонов и возвращающий имена тех,
     * кто является совершеннолетним в Германии (старше 18 лет).
     * Должна быть возвращена примерно следующая строка:
     * in Germany Jack and John are of legal age
     * (имена по вашему выбору, это пример)
     */
    public static String isLegalAge(List<Person>input){
        return input
                .stream()
                .filter(p->p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ","in Germany "," are of legal age"));

    }

}
