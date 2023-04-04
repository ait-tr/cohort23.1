import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
/*
Дан массив строк (не пустой). Написать метод, возвращающий карту Map<String, Boolean> где вся строка
является ключем, а значением является true, если строка в массиве встречается больше одного раза и false,
 если только один раз.
Примеры:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false} wordMultiple([
" c", "b", "a"]) → {"a": ложь, "b": ложь, "c": ложь} wordMultiple(["c", "c", "c", "c
" ]) → {"с": правда}

Дан список имен, где повторяются некоторые имена. Написать метод, который по имени возвращает количество
вхождений этого имени в список.
Пример: nameToNumberOccurence (список, имя строки)
Vasia -> 3
 */

    public Map<String,Boolean> wordMultiple (String[] strings){
        Map<String,Boolean> result = new HashMap<>();

        for(String s :strings){
            if(result.containsKey(s)){
                result.put(s,true);
            }else {result.put(s,false);}
        }
        return result;

    }
    // ["Jack","John","Jack"]
    public int nameToNumberOccurence (List<String>list,String name){
        Map<String,Integer> result = new HashMap<>();

        for(String s : list){
            if (result.containsKey(s)){
             //   result.put(s,result.get(s)+1);
                int value = result.get(s);//1
                result.put(s,value+1);

            }else {result.put(s,1);}
        }
        return result.getOrDefault(name,0);
    }


}
