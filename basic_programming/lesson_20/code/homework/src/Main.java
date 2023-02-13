import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        arr[0] = 2;
        arr[1] = 5;

        System.out.println("array length is " + arr.length);
        System.out.println(Arrays.toString(arr));

        // {1,3,5,7} length=4
        // int[] ints=arrToReverse();
        // for(int i =ints.length-1;i>=0;i--){
        //     System.out.print(ints[i]+" ");


        int[] ints = arrToReverse();
        // reverseAndPrintArray(arrToReverse());
        reverseAndPrintArray(ints);

        System.out.println( method1(2,"Hello",ints,4));

        int[][]ints2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(findSumOfSubArray(ints2,1));
    }



//}
    /*
Задача 1 Написать метод, который создает массив из всех нечетных чисел от 1 до 99.
Затем, в методе main вывести его на экран в обратном порядке.
public static int[] arrToReverse()
 */

    public static int[] arrToReverse(){
        //1. в пееременной a будет храниться значение длины маасива. Мы получаем его с помощью подсчета
        // встречающихся в цикле от 1 до 99 нечетных чисел
        int a = 0;
        for(int i = 1;i<=99;i++){
            if (i%2 != 0){
                a++;
            }
        }
        //2 записанное теперь в а количество всех нечетных чисел можно использовать в качестве длины
        // нового массива который будет содержать эти числа. т.е arr.length = a ;
        System.out.println("length of odd numbers array is "+a);

        //3. Создаем этот массив и с помощью цикла заполняем его ячейки нечетными числами.
        int[]arr = new int[a];

        for(int i=1,j=0;i<=99;i++){

            if (i%2 !=0){
                arr[j]=i;
                System.out.print(arr[j]+" ");
                j++;
            }
        }
        return arr;
    }

    public static void reverseAndPrintArray(int[]ints){
        System.out.println();
        for(int i =ints.length-1;i>=0;i--){
            System.out.print(ints[i]+" ");
        }

    }

    public static int method1(int x,String str,int[]ints,int y)
    {

        return 10;
    }

    /*  Задача 2 Есть двумерный массив целых чисел. Написать метод, находящий сумму всех значений заданного
    подмассива(элемента) этого массива.
      public static int findSumOfSubArray(int[][] ints, int n) где n -номер элемента массива ints

      int[][]ints2={
     ints2[0]  =  {1,2,3},
                  {4,5,6},
                  {7,8,9}
          };

      */
    public static int findSumOfSubArray(int[][] ints, int n){

        int sum=0;

        for(int i=0;i<ints[n].length;i++){
            sum +=ints[n][i];
        }
        return sum;
    }

}