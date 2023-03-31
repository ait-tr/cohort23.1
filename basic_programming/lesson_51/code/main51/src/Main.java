import our_static.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Wrapper classes  (классы-обертки)

    /*
    boolean  byte  short  char      int     long  float double
    Boolean  Byte  Short  Character Integer Long  Float Double
    List<Integer>list
    list.add(5)

     */
    public static void main(String[] args) {

//Для конвертации примитивного типа в класс обертку используется метод класса valueOf()
 // Создание обьекта через контструктор возможно, но не желательно, т.к. метод valueOf  более эффективен.
        Integer object = new Integer(1);

        System.out.println(object);

        Integer object1 = Integer.valueOf(1);

 // для превращения обьекта в примитив можно использовать соответствующие методы классов оберток intValue(),
 // doubleValue() и т.д.
     int num = object1.intValue();
        System.out.println(num);

   // Autoboxing and unboxing
        /*
        Boxing - это превращение примитивного значения в соответствующий обьект класса обертки.
        Т.к. это может происходить автоматически, то такой процесс называется Autoboxing
         */

        List<Integer>list = new ArrayList<>();
        list.add(1); // autoboxing

        Integer number = 2;// autoboxing

        Integer value = 5;
        Integer value1 = Integer.valueOf(5);

        for (Integer i =0;i<10;i++){ // так плохо
            System.out.println(i);
        }

        String str = "aaa";
        str = "bbb";
        int a =2;
        a=3;

 // immutable

        Integer x = new Integer(1);

        int num1 = getSquareValue(x);
        int num2 = x;
        System.out.println(num1);
        System.out.println(num2);

        Student student = new Student("Jill",24,"Street3");


    }

    public static int getSquareValue(int i){
        return i*i;
    }

    Student student = new Student("Jill",24,"Street3");

}
