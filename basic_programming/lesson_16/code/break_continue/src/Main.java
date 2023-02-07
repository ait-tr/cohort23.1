import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //   System.out.println(sumOfN(10));
        //output 30

        //      multiplicationTable();
        //   multiplicationTableAsTable();
     /*output
   1	2	3	4	5	6	7	8	9	10
2	4	6	8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
4	8	12	16	20	24	28	32	36	40
5	10	15	20	25	30	35	40	45	50
6	12	18	24	30	36	42	48	54	60
7	14	21	28	35	42	49	56	63	70
8	16	24	32	40	48	56	64	72	80
9	18	27	36	45	54	63	72	81	90
10	20	30	40	50	60	70	80	90	100	*/


        //BREAK statement

        for (int i = 100; i >= 10; i--) {
            System.out.println("i: " + i);

            if (i == 95) {
                break;
            }
        }
        System.out.println("We are out of loop");

        /*
i: 100
i: 99
i: 98
i: 97
i: 96
i: 95
We are out of loop
         */

        //CONTINUE Statement
        for (int i = 0; i <= 10; i++) {

            if (i == 4) {
                //     break;
                continue;
            }
            if (i == 10) {
                continue;
            }

            System.out.print(i + " ");
            //  System.out.println("\nHello World");
        }
        //0 1 2 3 5 6 7 8 9 10
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String str;

     /*   for(;;){
            System.out.println("Enter any word or 'exit' to end the program ");
            str = scanner.nextLine();

            if(str.equalsIgnoreCase("exit"))
                break;
        }
        System.out.println("you entered 'exit'");*/

        // Break inside nested loops
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print(" Inner loop count: ");
            int j = 0;
            while (j < 100) {

                if (j == 10) {
                    break;
                }


                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println("Completed");

        /*
        Outer loop count: 0
 Inner loop count: 0 1 2 3 4 5 6 7 8 9
Outer loop count: 1
 Inner loop count: 0 1 2 3 4 5 6 7 8 9
Outer loop count: 2
 Inner loop count: 0 1 2 3 4 5 6 7 8 9
Completed
         */

        /*
        Outer loop count: 0
 Inner loop count: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
Outer loop count: 1
 Inner loop count: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
Outer loop count: 2
 Inner loop count: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
Completed
         */


        {
            int i = 0;
            i = i + 1;
        }

        //break label;

        for (int i = 1; i < 4; i++) {

            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("i is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        //this is never reached
                        System.out.println("it will not print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for loop");

        done:
        for(int i=0;i<10;i++) {

            for(int j=0;j<10;j++){

                for(int k =0;k<10;k++){
                    System.out.print(k+" ");

                    if(k==5) break done;
                }

                System.out.println("After k loop");//never reached
            }
            System.out.println("After j loop");//never reached
        }
        System.out.println("After i loop");

        for(int j=0;j<3;j++) {
            System.out.println("outer j is "+j);
            for (int i = 0; i <= 5; i++) {

                if (i == 3) {
                    continue;
                }
                System.out.println("example with continue " + i + " ");
            }
        }

        // задача. Написать метод, выводящий  на экран треугольник, состоящий из цифр до числа n
        /*
        1
        12
        123
        1234
        12345
        123456
         */

        printTriangle(6);

    }
    public  static void printTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }





    /*1.С помощью цикла For написать метод, возвращаюший сумму всех четных целых чисел
        от 1 до заданного числа n
*/
    public static int sumOfN(int n){
        int sum =0;
        for(int i=1;i<=n;i++){

            if(i%2==0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //Вывести на экран таблицу умножения

    public static void multiplicationTable(){
        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=10;j++){
                System.out.println(i+"*"+j+" = "+j*i);
            }
            System.out.println("***********************************");

        }

    }

    public static void multiplicationTableAsTable(){
        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=10;j++){
                //     break;
                System.out.print(j*i+"\t");
            }
            System.out.println();

        }

    }





}