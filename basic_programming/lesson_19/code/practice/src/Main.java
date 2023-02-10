import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers ={1,2,3};
        //   int[] numbers1 ={1,2,3};
        int[] numbers1 ={2,2,3,1};
        System.out.println(areEqual(numbers,numbers1));


        int[][] table = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        int[][]table1 = new int[3][];
        table1[0]=new int[]{1,2,3};
        table1[1]=new int[]{2,5};
        table1[2]=new int[]{1,2,3,5};

        int length =table.length;
        System.out.println("Table length "+length);
        /*
Table length 3
Table[1] length 2
         */

        System.out.println("Table[1] length "+table[1].length);


        //for each with two dimensional arrays

      /*  int[][] table = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };*/
        int sum =0;
        for (int[] x:table){
            for(int y :x){
                System.out.println("Value is: "+y);
                sum+=y;
            }
        }
        System.out.println("sum of all elements is "+sum);



        // Написать метод, который проверяет есть ли заказаная машина в салоне.
        // пример:String [] salon =
        // {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        //название машины для поиска получаем с клавиатуры ( через Scanner)

        //1. создать метод public static  void findCar(String[]cars,String carToFind)
        //2.результат работы метода вывести на экран: carToFind is found  or not found
        //3. Алгоритм работы метода :
        // завести переменную хранящую длину массива
        // в цикле for  сравнивать (через if) каждый элемент массива с машиной, которую ищем
        // если нашли выводим на экран соответствующее уведомление если нет то пишет что такой машины нет.
        //4. Учесть правила сравнения стрингов ( через equals) и учесть возможность использования как больших  так
        // и маленьких букв
        // Arrays.toString(cars)
        //string.equals(string2)

        String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter  car brand");
        String carToFind = scanner.nextLine();

        findCar(salon,carToFind);



        int x =5;
        int y=6;

        int res=  sum(x,y);
        System.out.println(res);

    }

    static int sum(int a,int b){
        int sum =a+b;
        //  return 10;

        //   System.out.println(a+b);
        return sum;
    }

    // Написать метод, который проверяет есть ли заказаная машина в салоне.
    // пример:String [] salon =
    // {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
    //название машины для поиска получаем с клавиатуры ( через Scanner)

    //1. создать метод public static  void findCar(String[]cars,String carToFind)
    //2.результат работы метода вывести на экран: carToFind is found  or not found
    //3. Алгоритм работы метода :
    // завести переменную хранящую длину массива
    // в цикле for  сравнивать (через if) каждый элемент массива с машиной, которую ищем
    // если нашли выводим на экран соответствующее уведомление если нет то пишет что такой машины нет.
    //4. Учесть правила сравнения стрингов ( через equals) и учесть возможность использования как больших  так
    // и маленьких букв
    // Arrays.toString(cars)
    //string.equals(string2)
//{"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"}
    public static  void findCar(String[]cars,String carToFind){
        int length = cars.length;

        for(int i=0;i<length;i++){

            if(cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("this car is available");
                return;
            }

        }
        System.out.println("this car is not available. Take ");

        for(String car: cars)
            System.out.print(car+" ");


    }


    /*
 Написать метод, который проверяет равенство двух массивов целых чисел.
 public static boolean areEqual( int[] numbers,int[]numbers1)
 пример: {1,2,3} и {1,2,3} равны. {1,2,3} и {1,3,2} нет
  */
    public static boolean areEqual( int[] numbers,int[]numbers1){

        if(numbers.length != numbers1.length) {
            System.out.println("Lengths are different");
            return false;
        }

        for(int i=0;i<numbers.length;i++)
        {

            if(numbers[i] != numbers1[i])
            {
                return false;
            }
        }
        return true;
    }


}
