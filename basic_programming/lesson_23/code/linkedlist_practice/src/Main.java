import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Jack", "Andrew", "Michael", "John", "Klara");
        System.out.println(removesNamesLength4(list));//[Andrew, Michael, Klara]

        //[Andrew, Michael, Klara]
    }

    // Есть список с именами Jack, Andrew, Michael, Klara, John. Написать метод,
    // который вернет список, в котором не содержатся имена исходного списка длиной 4
    //[Jack, Andrew, Michael,John, Klara]  -> [Andrew, Michael, Klara]

    /*
    1-Создать лист имен. Добавить туда имена либо с помощью метода add  либо используя возможности Arrays.asList
    , List.of()
    2-написать метод удаляющий имена длиной 4.
    public static List<String> removesNamesLength4(List<String>list)
    3. создаем новый лист,в который записываем результат.
    3. Пишем цикл for в котором если длина элемента массива = 4 то не записываем этот элемент в новый лист
    4. возвращаем новый список с отфильтрованными элементами
    5. в методе main выводим наш список
     */
    public static List<String> removesNamesLength4(List<String> list) {
        List<String> result = new LinkedList<>();

        for (String s : list) {
            if (s.length() != 4) {
                result.add(s);
            }
        }
        return result;
    }



    /* Есть два списка одинаковой длины с целыми  числами. Написать метод, который возвращает список с
    элементами Yes  или No, где значение на i-ом месте зависит от того, равны ли элементы двух списков под
    номером i.
    Например, [1,2,3,4] и [5,2,3,8] -> [No,Yes,Yes,No]
    public static List<String> yesOrNo(List<Integer>list1,List<Integer>list2)
     */
}
