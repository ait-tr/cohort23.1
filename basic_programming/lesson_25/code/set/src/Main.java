
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //SET -множество
        // HashSet

        //HashSet methods
        //add
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Yellow");
        hashSet.add("Green");
        hashSet.add("Blue");

        System.out.println(hashSet);

        boolean isAdded = hashSet.add("Brown");
        System.out.println("element is added "+isAdded);

        isAdded = hashSet.add("Brown");
        System.out.println("element is added "+isAdded);

        System.out.println(hashSet);

        //forEach
        for(String str:hashSet){
            System.out.println(str);
        }

        //remove- removes element
        hashSet.remove("Brown");
        System.out.println(hashSet);
//[Yellow, Blue, Green]

        //clear - removes all elements
        //  hashSet.clear();

        // size of set
        System.out.println(hashSet.size());

        //isEmpty()- checks if the set is empty
        System.out.println(hashSet.isEmpty());

        //false

        // contains()   - checks if set contains a given element
        boolean containsBlue = hashSet.contains("Blue");
        System.out.println(containsBlue);


        //addAll - adds all elements from another set  (union)
        Set<Integer>setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer>setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        setB.addAll(setA);
        System.out.println(setB);


        //removeAll -removes all elements in the set which are also  present in another set
        //  (difference)

        Set<String>stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");

        Set<String>stringSet2 = new HashSet<>();
        stringSet2.add("three");
        stringSet.removeAll(stringSet2);
        System.out.println("The difference between the sets is "+stringSet);

        //retainAll - retains all elements present in another set
        //(intersection)

        Set<String>stringSet3 = new HashSet<>();
        stringSet3.add("one");
        stringSet3.add("two");
        stringSet3.add("three");

        Set<String>stringSet4 = new HashSet<>();
        stringSet4.add("three");
        stringSet4.add("fourth");

        stringSet3.retainAll(stringSet4);
        System.out.println("Intersection between two sets is "+stringSet3);
//Intersection between two sets is [three]
        List<String> str = new ArrayList<>();
        str.add("1");
        Set hSet = new HashSet();
        Set hSet1 = new HashSet(str);

        //TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(17);
        //  Set.of(2,5,6,7,8);

        System.out.println(treeSet);

        Set<Integer> treeSet1 = Set.of(5,1,7,0);

        //LinkedHashSet
    }


}
