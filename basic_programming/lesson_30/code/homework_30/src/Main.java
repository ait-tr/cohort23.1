
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String>names = List.of("vani", "ivan", "petr","terp","navi", "maria");

        System.out.println(anagramList("ivan",names));//[vani,ivan,navi]
        //   System.out.println(anagramList("petr",names));//[petr,terp]
        //   System.out.println(anagramList("maria",names));//[maria]
        //   System.out.println(anagramList("Nick",names));//"There is no such name in the list"

        /*
        key         value
        ainv:   [vani,ivan,navi]
        petr:   [petr,terp]
        maria:  [maria]
         */
        /*
[vani, ivan, navi]
[petr, terp]
[maria]
[No such name in the list]

         */

    }

    /*
    Написать метод, который принимает список имен и их анаграмм и имя, по которому
    он выдает список всех анаграмм этого имени, включая само имя
    [vani, ivan, petr,terp,navi, maria],ivan -> vani,ivan,navi
     */
    public static List<String> anagramList(String name,List<String>strings){
        Map<String,List<String>> anagrams = new HashMap<>();

        for(String s:strings){
            String sortedKey = sortAnagram(s);//ainv
            if(anagrams.containsKey(sortedKey)){
                List<String>value =  anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            }
            else {
                List<String> value = new ArrayList<>();
                value.add(s);//vani
                anagrams.put(sortedKey,value);
            }
            System.out.println(anagrams);

        }
        return anagrams.getOrDefault(sortAnagram(name),Arrays.asList("No such name in the list"));
    }


    // ivan -> ainv
    // vani -> ainv

    private static String sortAnagram(String str){
        char[] chars =  str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
