
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String>names = new ArrayList<>(List.of("John","Jim","Mary","John","Ann","Jim"));

        System.out.println(removeDuplicates(names));
        //[Ann, John, Jim, Mary]

        List<String>names1 = new ArrayList<>(List.of("John","Jim","Mary","John","Ann","Jim","Jim","Jim"));
        System.out.println("List of duplicates");
        System.out.println(getDuplicates(names1));
        //List of duplicates
        //[John, Jim]

        //[Ann, John, Jim, Mary]

    }

    //1.Есть список с именами. Некоторые из них повторяются.
    // с использованием множеств написать метод, который
    // вернет список без повторяющихся элементов
    //Пример: ["John","Jim","Mary","John","Ann","Jim"]-> ["John","Jim","Mary","Ann"]
    public static List<String> removeDuplicates(List<String>input){
        Set<String> set = new HashSet<>(input);

        //   List<String> res = new ArrayList<>(set);

        return new ArrayList<>(set);
    }
    //2. Есть список с именами. Некоторые из них повторяются.
    // С использованием множеств написать метод, который вернет список из повторяющихся элементов
    // исходного списка
    //  Пример: ["John","Jim","Mary","John","Ann","Jim"]-> ["John","Jim"]
    public static List<String> getDuplicates(List<String>input){
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String s : input){
            if(!set.add(s) && !duplicates.contains(s))
            {duplicates.add(s);}
        }
        return duplicates;

    }

    //Homework
    // С помошью множеств написать метод, проверяющий что в слове все буквы уникальные (не повторяютя). Строка состоит только
    // из букв английского алфавита
    // public static boolean isUnique (String word)
    //Hello -> false
    //World -> true
}
