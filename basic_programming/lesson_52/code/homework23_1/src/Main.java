import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
      //  m.findMinOrMax()
    }

    /*
         //  2. Есть лист строк. Написать метод, возвращающий строку, которая встречается
         // в листе раньше - самую короткую или самую длинную. Лист не пустой и строки все разные.
         // bb a ff ddd  -> a
            //
         */
    public String findMinOrMax (List<String> strings) throws EmptyListException{

        if(strings.isEmpty())
            throw new EmptyListException();

        String shortest = strings.get(0);
        int indexShortest =0;
        String longest = strings.get(0);
        int indexLongest = 0;

        for (int i = 0;i < strings.size() ; i++){
            if(strings.get(i).length()<shortest.length()){
                shortest = strings.get(i);
                indexShortest = i;
            } else if (strings.get(i).length()>longest.length()){
                longest = strings.get(i);
                indexLongest = i;
            }
        }
        if(indexShortest<indexLongest) {
            return shortest;
        }

        return longest;
    }
}
