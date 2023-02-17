
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>ints = List.of(1,2,9,8,7);
        //  withoutElementsMoreThanN(ints,7);
        System.out.println(withoutElementsMoreThanN(ints,7));
        System.out.println(withoutElementsMoreThanN(ints,2));
        System.out.println(withoutElementsMoreThanN(ints,0));

    }

    //1.Есть список целых чисел. Написать метод , который вернет список без элементов больше заданного числа
    // [4,1,8,9] если заданное число 8, то результат [4,1,8]
    //public static List<Integer> withoutElementsMoreThanN(List<Integer>input,int n)
    //алгоритм метода:
    //1. Создать новый лист целых чисел
    //2.Цикл For. В нем сравнить  через  if значение каждого элемента листа с числом n.
    //3.Если оно меньше либо равно n то добавить этот элемент в новый лист
    //После окончания цикла возврашаем новый лист
    public static List<Integer> withoutElementsMoreThanN(List<Integer>input, int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for(int number:input){
            if (number <= n) {
                withoutMoreThan.add(number);
            }
        }
        return withoutMoreThan;
    }

    //2.Есть лист стрингов, в котором длины всех стрингов различны и он не пустой.
    // Написать метод, возврашающий элемент(строку), который встречается раньше в
    // листе: самый короткий или самый длинный

    //List<String>=["aa" "bbb" "cccc" "d" ] -> cccc
    //List<String>=["aa" "d" "bbb" "cccc" ] -> d
}
