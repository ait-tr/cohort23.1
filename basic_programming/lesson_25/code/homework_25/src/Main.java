package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("aa","bbbb","c","ddd"));
        System.out.println(findShortestOrLongest(strings));
//bbbb
        List<String> strings1 = new ArrayList<>(List.of("a","bbbb","c","ddd"));
        System.out.println(findShortestOrLongest(strings1));
//a



    }
    /*
    Есть лист стрингов, в котором длины всех элементов различны и он не пустой.
Написать метод, возврашающий элемент(строку), который встречается раньше в листе: самый короткий или самый длинный.

Пример: ["aa" "bbb" "cccc" "d" ] ->ответ cccc так как сссс самое длинное слово и встречается раньше самого короткого слова d
["aa" "d" "bbb" "cccc" ] ->ответ d, так как здесь d самое короткое слово и оно встречается раньше самого длинного

public static String findShortestOrLongest(Listlist)
     */
    public static String findShortestOrLongest(List<String> list){
        String minLengthElement = list.get(0);
        int indexMinElement = 0;

        String maxLengthElement = list.get(0);
        int indexMaxElement = 0;

        for(int i=0; i<list.size();i++){
            if(list.get(i).length() < minLengthElement.length()){
                minLengthElement = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length()>maxLengthElement.length()) {
                maxLengthElement = list.get(i);
                indexMaxElement = i;
            }
        }
        if(indexMinElement < indexMaxElement)
            return minLengthElement;

        return maxLengthElement;
    }
}