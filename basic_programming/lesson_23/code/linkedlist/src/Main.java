
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //Linkedlist
    public static void main(String[] args) {


        List<Integer> ints = new LinkedList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        //LinkedList methods
        // add element to LinkedList
        stringLinkedList.add("Jim");
        System.out.println(stringLinkedList);

        //addFirst -добавляет элемент в качестве первого элемента
        stringLinkedList.addFirst("John");

        //addLast - добавляет элемент последним в списке
        stringLinkedList.addLast("Carl");

        System.out.println(stringLinkedList);

        //add(index, "Steve") - добавляет элемент по индексу
        stringLinkedList.add(1,"Rick");
        System.out.println(stringLinkedList);

        stringLinkedList.add(0,"Megan");
        System.out.println(stringLinkedList);

        //Removing elements from LinkedList

        //removing first element
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println(stringLinkedList);

        //remove by index
        stringLinkedList.remove(1);
        stringLinkedList.remove("Jim");
        System.out.println(stringLinkedList);
/*
[Jim]
[John, Jim, Carl]
[John, Rick, Jim, Carl]
[Megan, John, Rick, Jim, Carl]
[John, Rick, Jim]
 */

        //addAll  adds all elements of the specified list to our list
        List<String>namesToAdd = new LinkedList<>();
        namesToAdd.add("Jack");
        namesToAdd.add("Klara");
        System.out.println(namesToAdd);

        stringLinkedList.addAll(namesToAdd);
        System.out.println(stringLinkedList);

        //adds all elements of the specified list to our list from specified index
        List<String> moreToAdd = List.of("Andrew","Tom");
        stringLinkedList.addAll(1,moreToAdd);
        System.out.println(stringLinkedList);

        //clear all elements of a list
        System.out.println("namesToAdd before clear: "+namesToAdd);
        namesToAdd.clear();
        System.out.println("namesToAdd sfter clear: "+namesToAdd);
/*
namesToAdd before clear: [Jack, Klara]
namesToAdd sfter clear: []
 */
        System.out.println(stringLinkedList);
        stringLinkedList.removeAll(moreToAdd);
        System.out.println("after list called 'more to remove' is removed"+stringLinkedList);

        /*
        [John, Andrew, Tom, Jack, Klara]
after list called 'more to remove' is removed[John, Jack, Klara]
         */

        //remove() removes 0 element
        stringLinkedList.remove();
        System.out.println(stringLinkedList);

        // [Jack, Klara]

        // contains(item)   checks if the given item is present in our list
        boolean isPresent = stringLinkedList.contains("Klara");
        System.out.println(isPresent);
//true
        isPresent = stringLinkedList.contains("AAAAA");
        System.out.println(isPresent);
// get element by index

        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(1));
        /*
Jack
Klara
         */

        stringLinkedList.add("Andrew");
        stringLinkedList.add("Michael");
        System.out.println(stringLinkedList);
        //[Jack, Klara, Andrew, Michael]

        System.out.println(stringLinkedList.getFirst());
        System.out.println(stringLinkedList.getLast());
        /*
 Jack
Michael
         */

        List<Integer> listInt = new LinkedList<>();
        LinkedList<Integer>listInt1 = new LinkedList<>();

        List<Integer>list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();


        //indexOf(element) returns index og the specified element
        int index = stringLinkedList.indexOf("Klara");
        System.out.println(index);
//1
        // lastIndexOf(element) returns index of the last occurrence of the specified element
        stringLinkedList.addLast("Klara");
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.lastIndexOf("Klara"));
        /*
[Jack, Klara, Andrew, Michael, Klara]
4
         */

        //Remove methods
        //remove() - removes the first element in the list
        //remove(int index) -removes the element by specified index
        //remove(name) - removes the specified element
        stringLinkedList.remove("Klara");
        System.out.println(stringLinkedList);
//[Jack, Andrew, Michael, Klara]

        //set()- updates the element at the specified index with the given value
        stringLinkedList.set(2,"Mary");
        System.out.println(stringLinkedList);

        //size()-returns the number of element in the list
        System.out.println(stringLinkedList.size());




    }
}