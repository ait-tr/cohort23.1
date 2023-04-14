public class Main {

    public static void main(String[] args) {


        //1.конкатинировать строки a  и в
        StringConcate stringConcate = (a, b) -> Integer.toString(a)+b;
        System.out.println("concate strings");
        System.out.println(stringConcate.concat(10,24));

        // если длина строки = 3 вернуть true

        Checkable checkable = s -> s.length() == 3;
        System.out.println("check if length 3");
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        //вывести на экран строку s  в виде !s!
        Printable printable = s -> System.out.println("!"+s+"!");
        System.out.println("printing !s!");
        printable.print("abc");

        //написать лямбда выражение такое, что если длина строки = 4,
        // то вернуть четыре звездочки иначе вернуть
        // строку без изменений
        Transformable transformable = s -> s.length() == 4 ? s = "****" : s;
        System.out.println("Transformable");
        System.out.println(transformable.modify("ab"));
        System.out.println(transformable.modify("abcd"));

        // написать лямбда выражение такое, что будет печататься
        // "Hello World"
        Producable producable = () -> "Hello World";
        System.out.println("Producable");
       // System.out.println("Hello World");
        System.out.println(producable.produce());



    }
}
