public class Main {
    public static void main(String[] args) {

        //    printEven();
        //    printTriangle(6);

    /*    for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print(" Inner loop count: ");
            int j = 0;
            while (j < 100) {

                j++;
             //   System.out.println("I am still running and j is still "+j);

                if (j == 10) {
                //    break;
                    continue;
                }


                System.out.print(j + " ");
            //    j++;
            }
            System.out.println();
        }
        System.out.println("Completed");*/

// Continue with label    label:
  /*      outerloop:
        for (int i=1;i<10;i++){
            System.out.print("\nOuter loop pass "+ i+" , inner loop: ");

            for(int j=0;j<10;j++){
                if(j==5) {
                    continue outerloop;
                }

                System.out.print(j);
            }
        }*/
        /*
Outer loop pass 1 , inner loop: 01234
Outer loop pass 2 , inner loop: 01234
Outer loop pass 3 , inner loop: 01234
Outer loop pass 4 , inner loop: 01234
Outer loop pass 5 , inner loop: 01234
Outer loop pass 6 , inner loop: 01234
Outer loop pass 7 , inner loop: 01234
Outer loop pass 8 , inner loop: 01234
Outer loop pass 9 , inner loop: 01234
         */


        //ARRAYS
        int a = 10;
        // type[] array-name = new type[size]
        int[] number = new int[10];

        number[0]=23;
        number[1]=2;

        for (int i = 0;i<10;i++){
            number[i]=i;
            number[i]=i*i;
        }
        System.out.println("number[5]= "+number[5]);

        String[] strings = new String[4];
        strings[0]="Apple";
        strings[1]="Orange";
        strings[2]="Pineapple";
        strings[3]= "Banana";

        System.out.println("strings[1] is "+strings[1]);
        System.out.println("strings[2] is "+strings[2]);
        System.out.println("strings[3] is "+strings[3]);

        /*
strings[1] is Orange
strings[2] is Pineapple
strings[3] is Banana
         */

        //  String[] names =new String[] {};
        String[] names = {"John","Jim","Mary","Ann"};
        int length =  names.length;
        System.out.println("Length of 'names' array is "+length);

        for (int i=0;i<names.length;i++){
            System.out.println("names["+i+"]: "+names[i]);
        }
        /*
names[0]: John
names[1]: Jim
names[2]: Mary
names[3]: Ann
         */
        //ArrayIndexOutOfBoundsException
        //   System.out.println(names[10]);

        //     for(int i=0;i<=names.length;i++){
        //         System.out.println(names[i]);
        //     }
        for (int i=0;i<names.length;i++){
            System.out.println("names["+i+"]: "+names[i]);
        }

        names[0]="Jill";

        for (int i=0;i<names.length;i++){
            System.out.println("names["+i+"]: "+names[i]);
        }

        /*
names[0]: Jill
names[1]: Jim
names[2]: Mary
names[3]: Ann
         */

        //adding elements to array

        //  String[] names = {"John","Jim","Mary","Ann"};
        String[] newNames = new String[names.length+2];

        for(int index =0; index<names.length; index++){
            newNames[index] = names[index];
        }
        //newNames = {"John","Jim","Mary","Ann","Evgeny","Dmitry"}
        newNames[newNames.length-2]="Evgeny";
        newNames[newNames.length-1]="Dmitry";

        System.out.println();
        System.out.println("Array 'newNames' after adding names");
        for (int i=0;i<newNames.length;i++){
            System.out.println("newNames["+i+"]: "+newNames[i]);
        }
        /*
newNames[0]: Jill
newNames[1]: Jim
newNames[2]: Mary
newNames[3]: Ann
newNames[4]: Evgeny
newNames[5]: Dmitry
         */
        System.out.println();
        System.out.println("Printing names after names=newNames");

        names=newNames;

        for (int i=0;i<names.length;i++){
            System.out.println("names["+i+"]: "+names[i]);
        }

        /*
names[0]: Jill
names[1]: Jim
names[2]: Mary
names[3]: Ann
names[4]: Evgeny
names[5]: Dmitry

         */

// Find max of the array
        int[] ints = {7,2,9,0,5};

        int max =ints[0];

        for (int i=0;i<ints.length;i++){
            if(ints[i]>max){
                max = ints[i];
            }
        }
        System.out.println("Max element is "+max);

        // Find min element
        int min = ints[0];
        for(int i=0;i<ints.length;i++){
            if(ints[i]<min){
                min = ints[i];
            }
        }
        System.out.println("Min elt is "+min);

        //Find sum of array elements

        //  int[] arr ={1,0,2,3,5,1};
        int[] arr ={1,0,2,3,5};

        int sum = 0;

        for(int index = 0;index<arr.length;index++){
            sum = sum + arr[index];
        }
        System.out.println("Sum of all array elements is "+sum);

        double average =(double) sum/arr.length;
        System.out.println(average);


    }

    /**Написать метод, выводящий на экран все четные числа в диапазоне от 1
     до 10 с использованием цикла for и оператора continue */
    public static void printEven(){
        for (int i=0;i<=10;i++){

            if( (i%2) != 0) continue;

            System.out.println(i);

        }
    }

  /*  *Задача 2()*
    Написать метод, выводящий на экран треугольник из 6 строк такого вида:
            1
            22
            333
            4444
            55555
            666666 */

    public static void printTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

}