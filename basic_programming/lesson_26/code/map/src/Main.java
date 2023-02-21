
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Map
        /*
        key(ключ)   value(значение)
        smith :      123-456
        john :      48-586
        mary :      2737484
        coca-cola   1234-567
        coca-colaHR 1234-567
        jim :       123098

        1           red
        2           blue
        3           brown


        0      red
        1      yellow

        45         red
        1          blue
        32         green



         */

        Map map = new HashMap();
        //  Map<K,V> map = new HashMap<K,V>();
        HashMap<Integer, String> ourMap = new HashMap<>();

        //добавление элементов в мапу. Метод put
        ourMap.put(10, "Red");
        ourMap.put(5, "Green");
        ourMap.put(20, "Yellow");

        System.out.println(ourMap);

        // {20=Yellow, 5=Green, 10=Red}

        ourMap.put(null, "Black");
        System.out.println(ourMap);

        // получить элемент по ключу. метод get
        System.out.println("element with key=5 is " + ourMap.get(5));

        String result = ourMap.get(5);
        System.out.println(result);

        // получить значение или вернуть заранее определенное нами значение по умолчанию   getOrDefault()

        System.out.println(ourMap.getOrDefault(17, "Pink"));
        System.out.println(ourMap.getOrDefault(20, "Pink"));

        //проверить существование в мапе ключа  containsKey()
        System.out.println(ourMap.containsKey(10));
        System.out.println(ourMap.containsKey(18));

        // проверить наличие значения в мапе  containsValue()

        boolean hasValue = ourMap.containsValue("Green");
        System.out.println(hasValue);

        hasValue = ourMap.containsValue("Brown");
        System.out.println(hasValue);

        hasValue = ourMap.containsValue("green");
        System.out.println(hasValue);

        System.out.println(ourMap);
        ourMap.remove(null);
// перебор по ключам мапы в цикле
        System.out.println("Our map values in the loop:");
        for (int key : ourMap.keySet()) {
            System.out.println(ourMap.get(key));
        }
        /*
Our map values in the loop:
Yellow
Green
Red
         */

        for (int key : ourMap.keySet()) {
            System.out.println("key is " + key + " and value is " + ourMap.get(key));
        }
// перебор по значениям в цикле
        System.out.println("Our map values by values in the loop:");
        for (String value : ourMap.values()) {
            System.out.println(value);
        }
        //удаление элемента по ключу remove()
        System.out.println("ourMap before remove " + ourMap);
        ourMap.remove(5);
        System.out.println("ourMap after remove " + ourMap);

        /*
ourMap before remove {20=Yellow, 5=Green, 10=Red}
ourMap after remove {20=Yellow, 10=Red}
         */


        // удаление всех значенией clear()

        // заменить значение по ключу replace()

        ourMap.put(20, "Brown");
        System.out.println(ourMap);

        ourMap.replace(20, "Orange");
        System.out.println(ourMap);

        /*
{20=Brown, 10=Red}
{20=Orange, 10=Red}

         */

        ourMap.put(80, "White");
        ourMap.put(81, null);

        ourMap.replace(90, "Purple");
        System.out.println(ourMap);

        // получить количество элементов в мапе. Метод size()
        int entryCount = ourMap.size();
        System.out.println("map size is " + entryCount);

        // проверить пустая ли мапа. Метод isEmpty()
        System.out.println("is our map empty? " + ourMap.isEmpty());
        ourMap.clear();
        System.out.println("is our map empty? " + ourMap.isEmpty());
        System.out.println(ourMap);
/*
map size is 4
is our map empty? false
is our map empty? true
{}
 */
        //TreeMap example
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Value1");
        treeMap.put(1, "Value2");
        treeMap.put(100, "Value1");
        treeMap.put(23, "Value1");
        treeMap.put(5, "Value1");

        System.out.println(treeMap);
//{1=Value1, 2=Value1, 5=Value1, 23=Value1, 100=Value1}
    }


}
