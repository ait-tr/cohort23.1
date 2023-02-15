
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer [] ints = {1,2,3,4,5};
        Character[] chars = {'H','E','A'};
        //     printArray(ints);
        //    System.out.println();
        //    printArray(chars);

        int a =5;
        Integer b =5;
        Integer.parseInt("2");

        //LIST- список
        // ArrayList , LinkedList

        //ArrayList
        ArrayList<Integer> listInt = new ArrayList<>();
        List<Integer>listInt1 = new ArrayList<>();

        List<String> listNames = new ArrayList<>();
        List<Boolean> listBool = new ArrayList<>();

        //ArrayList methods:
        // add()- adds element at the end of the list
        listNames.add("John");
        listNames.add("Tom");
        listNames.add("Tim");
        listNames.add("Jack");

        System.out.println(listNames);

        // add(3,"Mary") This adds Mary at the fourth position
        listNames.add(3,"Mary");
        //arr[3]="Mary"
        System.out.println(listNames);

        //set(index,"Jim") - changes element's value at index
        listNames.set(2,"Jim");
        System.out.println(listNames);

        //remove() -removes element

        listNames.remove("Jim");// by name
        listNames.remove(0); // by index

        System.out.println(listNames);
        /*
[John, Tom, Tim, Jack]
[John, Tom, Tim, Mary, Jack]
[John, Tom, Jim, Mary, Jack]
*/
        // iterating  arraylist

        listNames.add("Gregor Clegane");
        listNames.add("Tyrion Lannister");

        for(String name:listNames){
            System.out.println(name);}

        //size() - arraylist size

        int size = listNames.size();
        System.out.println("listNames size is "+size);

        // get() - get element by index
        String lannister =  listNames.get(4);
        System.out.println(lannister);

        System.out.println("Get all elements by index");
        for (int index =0;index<listNames.size();index++){ //Gets all elements by index
            System.out.println(listNames.get(index));
        }

        // indexOf() - gives index by element's name or -1 if the element does not exist
        int indexMary = listNames.indexOf("Mary"); // finds index "Mary"
        System.out.println("Index Mary is "+indexMary);

        int indexNonExist =listNames.indexOf("Andrew");
        System.out.println("the name does not exist "+indexNonExist);

        //contains() - проверяет существует ли данный обьект в списке. Если да, возвращает
        // true  if not false
        boolean maryIsPresnt = listNames.contains("Mary");
        System.out.println(maryIsPresnt);


        //add elements to arraylist faster
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);

        System.out.println(integers);

        List<Integer>integers1 = List.of(1,2,3);
        List<String> strings = List.of("Mary","Andrew");

        listNames.add("Mary");
        listNames.add("Mary");
        listNames.add("Mary");
        System.out.println("listNames with Mary: "+listNames);
        Collections.replaceAll(listNames,"Mary","Andrew");
        System.out.println("ListNames with Andrew: "+listNames);

        /*
        listNames with Mary: [Tom, Mary, Jack, Gregor Clegane, Tyrion Lannister, Mary, Mary, Mary]
ListNames with Andrew: [Tom, Andrew, Jack, Gregor Clegane, Tyrion Lannister, Andrew, Andrew, Andrew]
         */

        // sort with Collections.sort() method
        Collections.sort(listNames);
        System.out.println("listNames sorted: "+listNames);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(0);
        Collections.sort(numbers);
        System.out.println(numbers);










        /*
 [John, Tom, Tim, Jack]
[John, Tom, Tim, Mary, Jack]
[John, Tom, Jim, Mary, Jack]

         */

        //

    }
    /*
    Классы обертки
    int -> Integer
    long -> Long
    boolean -> Boolean
     */
    int a =5;
    Integer b =5;
    //  Integer.

    // Generics
    public static <E> void printArray( E[] array){

        for(E element : array){
            System.out.print(element+" ");
        }




    }
}
