import java.util.Arrays;

public class Main {
    /*
    Сортировка пузырьком (Bubble Sort)
    - Алгоритм просматривает массив и сравнивает каждую пару соседних элементов.
    Когда встречается пара, расположенная не по порядку, происходит замена двух
    элементов местами

    Первый проход
    6 3 0 5 -> 3 6 0 5 ->3 0 6 5 -> 3 0 5 6

    Второй проход
    3 0 5 6 -> 0 3 5 6

    Третий проход
    0 3 5 6 -> 0 3 5 6

     */
    public static void main(String[] args) {
        int[] ints = {6,1,9,0,-3,456,345};
        System.out.println(Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
/*
[6, 1, 9, 0, -3, 456, 345]
[-3, 0, 1, 6, 9, 345, 456]
 */
    }
//[6 3 0 5]  length=4
    public static void bubbleSort (int[] array){
        boolean sorted = false;
        int temp;

        //0 3 5 6
        while(!sorted){
            sorted = true;
            for( int i = 0;i < array.length - 1;i++){//i=2
                if ( array[i] > array[i+1]){ // 3>0?
                    temp = array[i];//3
                    array[i] = array[i+1]; //0
                    array[i+1] = temp; // 3
                    sorted = false;
                    //array[0] = 3, array[1] = 0 , array[2] =6
                    //3 6 0 5
                    //3 0 6 5
                    //3 0 5 6
                    //0 3 5 6
                }

            }
        }
    }
}
