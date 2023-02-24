import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,234);
        map.put(2,234);
        map.put(3,234);

        System.out.println(map.getOrDefault(1,0));
        System.out.println(map.getOrDefault(4,1));
        System.out.println(map.get(5));

        System.out.println(map);

        Map<Integer,String>map1 = new HashMap<>();
        Map<Integer,String>map2 = new HashMap<>();

        map1.put(1,"Red");
        map1.put(2,"Brown");
        map1.put(3,"Yellow");

        System.out.println("map1: "+map1);

        map2.put(4,"Blue");
        map2.put(5,"White");
        map2.put(6,"Orange");

        System.out.println("map2: "+map2);


        System.out.println(copyMap(map1,map2));
        /*
map1: {1=Red, 2=Brown, 3=Yellow}
map2: {4=Blue, 5=White, 6=Orange}
{1=Red, 2=Brown, 3=Yellow, 4=Blue, 5=White, 6=Orange}
         */

        /*
        1- Написать метод, копирующий все элементы из одной мапы в другую мапу
        2.Написать метод, проверяющий содержит ли мапа какие-либо элементы или она пустая
        3. Написать, метод проверяющий содержит ли мапа данный ключ
        4. Написать, метод проверяющий содержит ли мапа данное значение
        5. Написать метод, выводящий на экран все ключи мапы
        6. Написать метод, выводящий на экран все значения мапы
        7** Написать метод, который принимает список имен и их анаграмм и имя, по которому  он выдает
            список всех анаграмм этого имени, включая само имя. В решении использовать HashMap
            [vani,amari, ivan, petr,terp,navi, maria],ivan -> vani,ivan,navi
            public static List<String> anagramsList(List<Strings> strings, String name)
         */
        System.out.println(map2);
        System.out.println(isEmptyOur(map2));
        System.out.println(map2.isEmpty());
        map2.clear();
        System.out.println(isEmptyOur(map2));
        System.out.println(map2.isEmpty());
        System.out.println(map2);

        System.out.println(ourContainsKey(map1,1));
        System.out.println(ourContainsKey(map1,4));
        map1.containsKey(1);
        System.out.println("---------------------------------------");
        System.out.println(ourContainsValue(map1,"Yellow"));
        System.out.println(map1.containsValue("Black"));

        printKeys(map1);
        printValues(map1);
        map1.keySet();
        map1.values();


    }

    //1- Написать метод, копирующий все элементы из одной мапы в другую мапу
    public static Map<Integer,String> copyMap(Map<Integer,String>map1, Map<Integer,String>map2){
        map2.putAll(map1);

        return map2;
    }

    //2.Написать метод, проверяющий содержит ли мапа какие-либо элементы или она пустая
    public static boolean isEmptyOur(Map<Integer,String>map){

        return map.isEmpty();
    }

    //3. Написать, метод проверяющий содержит ли мапа данный ключ
    public static boolean ourContainsKey(Map<Integer,String>map,int key){

        return map.containsKey(key);
    }

    public static void ourContainsKey2(Map<Integer,String>map,int key){

        if(map.containsKey(key)){
            System.out.println("Yes! "+map.get(key));
        }
        else {
            System.out.println("Does not exist");
        }
    }

    //4. Написать, метод проверяющий содержит ли мапа данное значение
    public static boolean ourContainsValue(Map<Integer,String>map ,String colour ){

        return map.containsValue(colour);
    }

    // 5. Написать метод, выводящий на экран все ключи мапы
    public static void  printKeys(Map<Integer,String>map){
        //  Set keySet =  map.keySet();
        //     System.out.println("Keys are: "+keySet);
        System.out.println(map.keySet());
    }

    //6. Написать метод, выводящий на экран все значения мапы
    public static void printValues(Map<Integer,String>map){
        System.out.println(map.values());
    }

}