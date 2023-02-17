

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> ints2 = new ArrayList<>(List.of(5, 2, 3, 8));
        List<Integer> ints3 = new ArrayList<>(List.of(92, 21, 36, 8));
        List<Integer> ints4 = new ArrayList<>(List.of(51, 20, 31, 8));

        //    yesOrNoFoRDebugger(ints1,ints2);

        yesOrNo(ints1,ints2);

        List<String>strings=yesOrNo(ints1,ints2);
        System.out.println("List strings ="+ strings);

        System.out.println(yesOrNo(ints1, ints2));
        //[No, Yes, Yes, No]

        System.out.println("yes or no with ints3 and ints4"+yesOrNo(ints3,ints4));

        //    System.out.println(joinTwoLists(ints1, ints2));

        //   yesOrNoFoRDebugger(ints1,ints2);
    }

    //Задача 1
//Есть два списка одинаковой длины с целыми числами. Написать метод, который возвращает список с элементами Yes или No, где значение на i-ом месте зависит от того, равны ли элементы двух списков под номером i.
//Например, [1,2,3,4] и [5,2,3,8] -> [No,Yes,Yes,No]
    public static List<String> yesOrNo(List<Integer> list1, List<Integer> list2) {
        List<String> resultYesNo = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                resultYesNo.add("Yes");
            } else {
                resultYesNo.add("No");
            }
        }
        return resultYesNo;
    }

    //   Задача 2 Написать метод, обьединяющий два списка целых чисел в один.
    public static List<Integer> joinTwoLists(List<Integer> list1, List<Integer> list2) {

        list1.addAll(list2);

        return list1;
        //  return list1.addAll(list2);
    }

    public static List<String> yesOrNoFoRDebugger(List<Integer> list1, List<Integer> list2) {
        List<String> result = new LinkedList<>();
        for (int i : list2) {
            if (list1.get(i) == list2.get(i)) {
                result.add("Yes");
            } else {
                result.add("No");
            }


        }
        return result;

    }
}
