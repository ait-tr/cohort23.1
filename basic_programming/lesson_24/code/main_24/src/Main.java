import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        //   System.out.println(ints.set(23,1));

        int[] array = {1,2,3};
        System.out.println(array[0]);
        System.out.println(ints.get(0));

        List<String> names = new LinkedList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Mary");
        names.add("Andrew");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);


//посчитать сумму значений элементов листа целых чисел
        List<Integer>numbers = List.of(9,8,5);

        int sum =0;

        for(int i =0;i<3;i++){
            //  System.out.println("Hello");
            sum =sum+numbers.get(i);
            System.out.println(i);
        }
        System.out.println("enhanced For");
        for(int number : numbers){
            System.out.println(number);
        }



    }
}