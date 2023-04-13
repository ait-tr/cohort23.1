import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("The                        weather today is great"));
        System.out.println(countCharacters("aaaabbdcccc"));
    }
    /*
    Переписать первую задачу из вчерашнего задания с использованием StringBuilder:
    Есть текстовый файл. Написать метод, читающий файл и возвращающий строку,
    состоящую из строчек этого файла.
    Write a method to read a text file into a String using StringBuilder class
    */

    public static String readIntoString(String filename)throws IOException{
        StringBuilder sb = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;

            while ((line = br.readLine()) != null){
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        }
        return new String(sb);
    }

/*
Написать метод, возвращающий слова в строке в обратном порядке.
Использовать StringBuilder. Слова разделяются пробелом. Пример:
"The weather today is great" -> "great is today weather The "
Write a method to reverse words in a String. Use StringBuilder
     */
    public static String reverseWords(String string){
        String[] words = string.trim().split(" ");

       // Collections.reverse(Arrays.asList(words));
        StringBuilder res = new StringBuilder();

        for(int i = words.length-1;i>=0;i--){
            if(!words[i].isEmpty())
            res = res.append(words[i]).append(" ");
        }
        return new String(res).trim();
    }

    /*
    Есть строка, состоящая только из маленьких букв. Используя StringBuilder написать метод,подсчитывающий количество
повторений буквы и возвращающий новую строку такого вида: aaaabbccccd -> 4a2b4cd
Write a method to convert a string of lowercase letters into a string counting the number of these letters for each letter
aaaabbdcccc -> 4a2b4cd Это задача со звездочкой, не обязательная
     */

    public static  String countCharacters(String str){
        if(str.length() == 0)
            return "";

        int count = 1;
        StringBuilder sb = new StringBuilder();
//aaaabbccccd
        for( int i = 1; i<str.length();i++){
            if(str.charAt(i-1) != str.charAt(i)){
                if(count > 1){
                    sb.append(count).append(str.charAt(i-1));
                    count = 1;
                } else {
                    sb.append(str.charAt(i-1));
                }
            } else {
                count++;
            }

        }
        if( count == 1)
            sb.append(str.charAt(str.length() -1 ));
        else
            sb.append(count).append(str.charAt(str.length() - 1));

        return sb.toString();
    }

}
