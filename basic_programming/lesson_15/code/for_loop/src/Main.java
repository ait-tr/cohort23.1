import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задача1
        //    printCubeOfNumbers(5);

        int n = 5;
        //     System.out.println("cube of "+n+" is "+returnCubeOfNumber(n));

        /*
        output
Number is 1 and cube of 1is 1
Number is 2 and cube of 2is 8
Number is 3 and cube of 3is 27
Number is 4 and cube of 4is 64
Number is 5 and cube of 5is 125
cube of 5 is 125
         */

        // FOR LOOP
    /*
    for ( initialisation;condition;increment/decrement){
    statement(s)}
     */
        int j =1;
        while(j<=10){
            //    System.out.println("The value of j is: "+j);
            j++;
        }

//Примеры использования for
        for (int i =1;i<=10;i++){
            //     System.out.println("The value of i is: "+i);
        }

        /*
The value of i is: 1
The value of i is: 2
The value of i is: 3
The value of i is: 4
The value of i is: 5
The value of i is: 6
The value of i is: 7
The value of i is: 8
The value of i is: 9
The value of i is: 10
         */

        for (int i=10; i>0; i--){
            //     System.out.println("The value of i is: "+i);
        }
/*
The value of i is: 10
The value of i is: 9
The value of i is: 8
The value of i is: 7
The value of i is: 6
The value of i is: 5
The value of i is: 4
The value of i is: 3
The value of i is: 2
The value of i is: 1

 */

        for(int i=0,y=10; i<y; i++,y--){
            //      System.out.println("i and y: "+i+" "+y);
        }
   /*
i and y: 0 10
i and y: 1 9
i and y: 2 8
i and y: 3 7
i and y: 4 6
         */
        Scanner scanner = new Scanner(System.in);

     /*   System.out.println("enter 'stop' to stop ");

        for (int i=1;!scanner.nextLine().equalsIgnoreCase("stop");i++)
            System.out.println("Pass "+i);*/


        int i =0;
        for(;i<10;){

            System.out.println(i);

            i++;
        }

        int i1;
        for(i=0;i<10;){

            System.out.println(i);
            i++;
        }

        for(int k=0;k<2;k++){
            System.out.println(k);
        }
        for(int k =0;k<2;k++);

        int m;
        for ( m =0;m<3;m++);


        //   for(;;){

        //   }

        // написать метод возвращающий сумму от 1 до 5
        //     System.out.println(sumOfFive());

        // цикл for считатющий сумму от 1 до 5 с пустым телом цикла
        int sum =0;

        for(int i2 = 1;i2<=5;sum += i2++);

        System.out.println("Sum is "+sum);

        ///sum +=i++;
        //sum = sum+i;

        //sum = sum +2
        //sum += 2

        // i++  ++i

        //Nested loop

        //    nestedFor(3,5);

        //Написать метод, выводящий на экран треугольник из звездочек состоящий из 6 строк такого вида:
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        starTriangle(6);





    }
    //дз 1
    public static void printCubeOfNumbers(int n){

        int i=1;

        while(i<=n){
            System.out.println("Number is "+i+" and cube of "+i+ "is "+(i*i*i));

            i++;
        }
        //     return;
    }

    //дз2. Метод, принимающий число и возвращающий его куб

    public static int returnCubeOfNumber(int n){
        return n*n*n;
    }

    // FOR LOOP
    /*
    for ( initialisation;condition;increment/decrement){
    statement(s)}
     */

    // написать метод возвращающий сумму от 1 до 5
    public static int sumOfFive(){
        int sum =0;
        for (int i = 1;i<=5;i++){
            sum = sum+i;
        }
        return sum;
    }

    //Nested For example
    public static void nestedFor(int num1, int num2){ //num1=3; num2 = 5
        for(int i=1;i<=num1;i++) {

            for (int j =1;j<num2;j++){
                System.out.print(j+" ");
            }
        }
    }
    //output 1 2 3 4 1 2 3 4 1 2 3 4

    // i=1
    // j 1,2,3,4

    //i=2
    // j 1,2,3,4

    //i=3
    // j 1,2,3,4

    //Написать метод, выводящий на экран треугольник из звездочек
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */

    public static void starTriangle(int numberOfLines){
        for (int i=1;i<=numberOfLines;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}