import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(isUnique("hello"));//false
        System.out.println(isUnique("world"));//true
/*
false
true
 */
    }
    // С помошью множеств  написать метод, проверяющий что в слове все буквы уникальные (не повторяютя).
    // Строка состоит только из букв английского алфавита
    // public static boolean isUnique (String word)
    //Hello -> false
    //World -> true

    public static boolean isUnique(String word) {
        HashSet<Character> testSet = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (!testSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
