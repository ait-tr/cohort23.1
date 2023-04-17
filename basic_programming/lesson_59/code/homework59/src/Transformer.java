import java.util.function.Function;
import java.util.function.Predicate;

public class Transformer {

    public static void main(String[] args) {
        Transformer transformer = new Transformer();
        String input = "AAA BBBB dEF cDkls bBb";
        Predicate<String>predicate = s -> s.length() == 3;
        Function<String,String>function = s -> s.toLowerCase();
        // тоже самое через method reference:
       // Function<String,String>function = String::toLowerCase;

        System.out.println(transformer.transforming(input,predicate,function));

        // aaa BBBB def cDkls bbb
    }

    /* Написать метод, принимающий строку, содержащую слова разделенные пробелом и два функциональных интерфейса
    - function и predicate. Метод возвращает строку. Он должен предоставлять возможность
    реализации следующих действий:
1. при длине слова= 3, изменить все буквы этого слова на строчные и вернуть измененную строку
2. при длине слова= 4, изменить все буквы слова на заглавные и вернуть измененную строку
3. при длине слова= 5, изменить все буквы слова на звездочки и вернуть измененную строку
(т.е. должен работать таким образом при передаче в него соотвествующих лямбда выражений для каждого случая).
Протестировать.
Пример: есть строка AAA BBBB dEF cDkls bBb
Условие: если длина слова = 3 то заменить буквы этого слова на маленькие.
На выходе будет: aaa BBBB def cDkls bbb
    [AAA, BBBB, dEF, cDkls, bBb]
*/

    public String transforming (String input, Predicate<String> predicate, Function<String,String>function){
        String[] words = input.split(" ");

        for(int i = 0; i<words.length; i++){
            if(predicate.test(words[i])){
                words[i] = function.apply(words[i]);
            }
        }
        return String.join(" ",words);

    }



}
