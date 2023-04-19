import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Address address3 = new Address("Street3",3);
        Address address4 = new Address("Street4",4);

        Person person1 = new Person("Person1",16,address1);
        Person person2 = new Person("Person2",35,address2);
        Person person3 = new Person("Person3",47,address3);
        Person person4 = new Person("Person4",13,address4);

        List<Person> persons = Arrays.asList(person1,person2,person3,person4);
        System.out.println(getAddresses(persons));
        //[Address{street='Street2', houseNumber=2},
        // Address{street='Street3', houseNumber=3}]

        String string = "aaa ffff aa bbbb a bb aaa gggggggggggggg";
        System.out.println(countWords(string,"a"));



    }

    /**
     * Задача1
     * Есть класс person.Address с полями
     * String street
     * int houseNumber
     * <p>
     * и класс person.Person с полями
     * String name
     * int age
     * person.Address address
     * <p>
     * Используя стримы, написать метод, принимающий список
     * персонов и возвращающий список адресов тех, кто старше 17 лет.
     * List\<person.Address>getAddresses(List\<person.Person> input)
     */

   public static List<Address> getAddresses(List<Person> input){
        return input.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Задача2
     * Используя стримы написать метод, принимающий строку, состоящую из слов,
     * разделенных пробелом и букву и возвращающий количество слов, начинающихся с этой буквы.
     * long countWords (String input, String letter)
     * <p>
     * пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 ,
     * т.к. слово, начинающееся на a встречается 4 раза
     */

   public static long countWords (String input, String letter){
   long counter = Stream.of(input.split(" "))
               .filter(word ->word.startsWith(letter))
               .count();
       return counter;
   }


}
