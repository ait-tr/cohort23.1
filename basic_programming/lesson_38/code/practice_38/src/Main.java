public class Main {

    // Создать класс Rectangle, содержащий методы для вычисления площади и периметра прямоугольника.
    // Методы должны возвращать  периметр и площадь прямоугольника для длины и ширины передаваемых в качестве
    // параметров в конструктор.
    // Площадь прямоугольника = длина*ширина
    // Периметр = 2*(длина + ширина)
    // Создать несколько прямоугольников и вывести  на экран площадь и периметр для каждого

    /*
    1.Создать класс Rectangle, в котором создать поля  int length, int width, обьявить их приватными.
    2.Создать конструктор, содержащий оба поля ширина и длина.
    3.создать геттеры для полей
    4. создать методы для вычисления площади и для вычисления периметра
    5.Создать несколько прямоугольников и вывести  на экран площадь и периметр для каждого
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(6,8);
        System.out.println("For length "+rectangle1.getLength()+" and width "+rectangle1.getWidth() );
        System.out.println("Area: "+rectangle1.getArea()+ " Perimeter is "+rectangle1.getPerimeter());

        System.out.println();
        System.out.println("For length "+rectangle2.getLength()+" and width "+rectangle2.getWidth() );
        System.out.println("Area: "+rectangle2.getArea()+ " Perimeter is "+rectangle2.getPerimeter());

        /*
For length 4 and width 5
Area: 20 Perimeter is 18

For length 6 and width 8
Area: 48 Perimeter is 28
         */
    }
    // {3,1,8}-> 8
    //Создать класс MaxElementInArray, содержащий метод, который находит максимальный элемент массива и возвращает его:
   /*
   1-создать класс MaxElementInArray, содержащую имя массива
   private int[] ints
   2. Создать конструктор , принимающий массив
   public MaxElementInArray( int[] ints ){
              this.ints = ints;}
   3.написать метод, находящий максимальный элемент массива
   4.В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray для этого массива
   и вывести на экран значение максимального элемента этого  массива          

    */
}
