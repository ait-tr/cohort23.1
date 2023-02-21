
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> companyPhones = new HashMap<>();
        companyPhones.put("Coca-Cola", 123456);
        companyPhones.put("Danon", 78923456);
        companyPhones.put("Volvo", 98234456);
        companyPhones.put("Escobar", 1256);
        companyPhones.put("Siemens", 69543);

        System.out.println(companyPhones);

        for (String company : companyPhones.keySet()) {
            System.out.println("Company is " + company + " and phone number is " + companyPhones.get(company));
        }

        /*
{Coca-Cola=123456, Volvo=98234456, Siemens=69543, Escobar=1256, Danon=78923456}
Company is Coca-Cola and phone number is 123456
Company is Volvo and phone number is 98234456
Company is Siemens and phone number is 69543
Company is Escobar and phone number is 1256
Company is Danon and phone number is 78923456
         */

        int danonPhone = companyPhones.get("Danon");
        System.out.println("Danon phone is " + danonPhone);
        //Danon phone is 78923456

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(companyPhones);
        System.out.println(treeMap);

        System.out.println(companyPhones.containsKey("Escobar"));
        System.out.println(companyPhones.containsValue(78923456));
        System.out.println(companyPhones.containsValue(7892345));

        System.out.println("number as key in our map");
        System.out.println(companyPhones.containsKey(78923456));
        /*
true
true
false
         */

        companyPhones.remove("Escobar");
        System.out.println(companyPhones);

        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        //    mapAB.put("b","There");

        System.out.println(ab(mapAB));
//{a=Hi, ab=HiThere, b=There}
// {a=Hi}

    }

    //Дана Map<String,String>map написать метод, который вернет мапу, такую что если в исходной мапе
    // есть ключи "a" и "b", то нужно создать новый элемент с ключом "ab" и с суммой значений  от ключей a и b
    //в качестве значения. Если таких ключей нет, то ничего не менять
    //AB {"a":"Hi" , "b": "There"} -> {"a":"Hi", "ab":"HiThere", "b":"There"}
    //AB {"a":"Hi"} ->  {"a":"Hi"}
    //AB {b:There} -> {b:There}
    public static Map<String, String> ab(Map<String, String> mapAB) {

        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            String key = "ab";
            String value = mapAB.get("a").concat(mapAB.get("b"));

            mapAB.put(key, value);
        }
        return mapAB;
    }

// Есть массив строк. Не пустой.  Написать метод, возвращающий мапу Map<String, Boolean> где каждая строка
    // является ключом, а значением является  true  если строка в массиве встречается больше одного раза
    // и false если только один раз
    // Map<String,Boolean> mapStringBoolean( String[] strings

    /*
    [a,b,a,c,b] -> {a:true, b: true, c: false}
     [a,b,c,] -> {a:false, b: false, c: false}
     [c,c,c,] -> {c: true}
     */


}
