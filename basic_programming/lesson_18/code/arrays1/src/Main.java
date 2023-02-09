import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       /*
       Задача 1
Написать метод, который находит количество четных элементов в массиве целых чисел. Метод должен принимать массив целых чисел в качестве параметра и
возвращать это число.
public static int countEven( int[] numbers)
пример: {1,2,4,5,8}-> результат 3, т.к. в массиве 3 числа четные
*/
        int[] arr;
        arr=new int[5];
        int[] arr1= new int[] {2,4};

        int[] ints = new int[]{1,2,4,5,8};
//int[] ints24 = {1,2,4,5,8};

        //       System.out.println("number of even elements in our array is "+countEven(ints));
//countEven(new int[]{1,2,4,5,8});

/*
Задача 2
Дан массив целых чисел. Написать метод, возвращающий разность между наибольшим и наименьшим элементами
массива.
public static int countDif(int[] ints)
пример: {4,2,5,8} -> результат 6, т.к. 8 (максимальный)- 2(минимальный)=6
        */
        int[]array ={5,0,1,3};

        int result = countDif(array);
        //       System.out.println("max-min= "+result);

        // For-Each Loop
        //for( type iteration-var:array)
        //        statement(s)

        //   int[] nums = {1,2,3,4,5,6,7,8,9,10};

        //   int sum =0;

        //   for (int i=0;i<10;i++){
        //        sum=sum+nums[i];
        //   }

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for(int x: nums){
            sum+=x;
            //           System.out.println("x= "+x);
        }
        //       System.out.println("Sum of elements is "+sum);
/*
x= 1
x= 2
x= 3
x= 4
x= 5
x= 6
x= 7
x= 8
x= 9
x= 10
Sum of elements is 55
 */
        //break with for each

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,5};

        int sum1 = 0;
        for(int x: nums){
            sum1+=x;
            //         System.out.println("x= "+x);

            if(x==5) break;
        }
        //       System.out.println("Sum of elements with break is "+sum1);

        findElt(numbers,5);
        //  findElt(numbers,34);


        //The for-each loop is read only
        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10,5};
        System.out.println("numbers1 before:");
        for(int x :numbers1){
            System.out.print(x+" ");
            x = x*10;
        }
        System.out.println();
        System.out.println("numbers1 after: ");
        for(int x :numbers1){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("For loop with index");
// for loop with index
        System.out.println("numbers1 before:");
        for(int index=0;index<numbers1.length;index++){
            System.out.print(numbers[index]+" ");
            numbers1[index] = numbers1[index]*10;
        }
        System.out.println();
        System.out.println("numbers1 after: ");
        for(int index=0;index<numbers1.length;index++){
            System.out.print(numbers1[index]+" ");
        }
        System.out.println();

        //Strings to char array

        char[] chars= "string".toCharArray();
        for(char ch :chars){
            System.out.println("["+ch+"]");
        }
// int[] numbers1 = {1,2,3,4,5,6,7,8,9,10,5};
        System.out.println("array numbers1 is "+ numbers1);
        //  output   array numbers1 is [I@7ba4f24f

        System.out.println("array numbers1 is "+ Arrays.toString(numbers1));
        // array numbers1 is [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 50]

//Multidimensional arrays

        //    int[][] table = new int[2][3];
        //    table[0][0]=10;

        //table[0]  table[1]
        int[][] table ={ {1,2,3} ,  {4,5,6}};

        //table[0]= {1,2,3}
        // table[0][0] =1
        // table[0][1] =2
        // table[0][2] =3

        //table[1]={4,5,6}
        // table[1][0] =4
        // table[1][1] =5
        // table[1][2] =6



        for(int i=0;i<2;i++){

            for(int j = 0;j<3;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();

        }
        /*
         1 2 3
         4 5 6
         */
        System.out.println(Arrays.toString(table));



    }

    public static int countEven( int[] numbers){
        int counter = 0;

        for(int index = 0;index<numbers.length;index++)
        {
            if(numbers[index] % 2 ==0){
                counter++;
            }
        }
        return counter;
    }

    /*
Задача 2
Дан массив целых чисел. Написать метод, возвращающий разность между наибольшим и наименьшим элементами
массива.
public static int countDif(int[] ints)
пример: {4,2,5,8} -> результат 6, т.к. 8 (максимальный)- 2(минимальный)=6
        */

    public static int countDif(int[] ints){
        int max = ints[0];
        int min = ints[0];

        for(int index =1;index<ints.length;index++){
            if(ints[index]>max){
                max=ints[index];
            }
            else if (ints[index]<min){
                min = ints[index];
            }
        }
        return max-min;
    }

    //for-each to find a value
    //int[] numbers = {1,2,3,4,5,6,7,8,9,10}; value = 5
    public static void findElt(int[] ints,int value){
        //    boolean found =false;

        for(int x : ints){
            if(x == value){
                System.out.println("Value found!");
                //         found = true;
                break;
            }
        }
        //    if(found)
        //        System.out.println("Value found!");
    }
}