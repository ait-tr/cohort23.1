public class Main {

    public static void main(String[] args) {
        int[] ints = {1,3,6,8,9,14,28,32};
        System.out.println(binarySearch(1,ints));
        System.out.println(binarySearch(3,ints));
        System.out.println(binarySearch(6,ints));
        System.out.println(binarySearch(8,ints));
        System.out.println(binarySearch(9,ints));
        System.out.println(binarySearch(14,ints));
        System.out.println(binarySearch(28,ints));
        System.out.println(binarySearch(32,ints));
        System.out.println(binarySearch(47,ints));
    }

    /*
    f(x)= x+1;
    y=x+1
    f(x) = x^2 + x +4

    Логарифмы
    2^x =1024
    2^10 = 1024
    10 -это логарифм 1024
    log(1024) =10
    логарифм 1024 -это та степень , в которую надо возвести двойку чтобы получить 1024


    log(64)=6
    2^x = 64 =2^6


    4^x = 4
    2^2x = 2^2
    2x=2
    x=1

    Алгоритмы, типы алгоритмов
    Алгоритм - это конечная последовательность определенных действий, которые нужно
    совершить для того чтобы решить ту или иную проблему

    Основные типы алгоритмов:
    1. Brute Force - наиболее простой, лобовой подход решения
    2. Recursive Algorithm -
        рекурсия -это процесс вызова методом самого себя.
    3. Backtracking - выстраивание решения задачи пошагово, с возвратом на шаг назад
     в случае если искомое решение оказывается неудовлитворительным на определенном шаге
     и выстраиванием нового решения начиная с того шага, на который мы вернулись

     4. Searching algorithms - Алгоритмы поиска - осуществляют поиск элнмента, проверяя существует ли такой
        элемент или извлекая этот элемент из структуры дааных
       a). Последовательный поиск
        - Линейный поиск. Это простейший алгорити поиска, редко используемый из-за своей неэффективности.
            Это метод полного перебора, алгоритм ищет элемент в заданной структуре данных пока не достигнет конца
            структуры. При нахождении элемента возвращается его позиция в структуре данных. Если элемент не найден,
            возвращается -1
     */




    public static int linearSearch ( int[] arr, int element){

        for ( int index = 0;index<arr.length; index++){
            if ( arr[index] == element){
                return index;
            }
        }
        return -1;
    }
    /*
    b). Interval search -  такой поиск предназначен для поиска в отсортированных структурах данных. И в этом
        случае он гораздо эффективнее линейного поиска
       Binary search Бинарный поиск

     5. Sorting Algorithms -  алгоритмы сортировки
     как правило, сортируют данные по возрастанию  или убыванию

     6. Hashing Algorithms -  алгоритмы хеширования

     7. Divide and Conquer Algorithm -  Алгоритмы " разделяй и властвуй"
        Алгоритм разделяет задач у на отдельные подзадачи до того момента, пока эти подзадачи не станут настолько
        элементарными  что их можно будет решить и затем соединяет решения вместе чтобы получить общее решение

      8. Greedy - жадные алгоритмы. Решение принимается каждый раз оптимальное для конкретного шага алгоритма
      9. Dynamic Programming Algorithm - идея заключается в том, чтобы  оптимизировать решение, запоминая в программе
        ранее полученные вычисления для подзадач
      10. Randomized algorithms




     */

    //Binary search
    public static int binarySearch (int search, int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start <= end){

            int middle =(start + end)/2;

            if(search < array[middle]){
                end = middle -1;
            }

            if(search > array[middle]){
                start = middle +1;
            }

            if (search == array[middle]){
                return middle;
            }

        }
        return -1;
    }
    //  линейный поиск имеет сложность O(n),  бинарный поиск имеет сложность O(log n). т.е. у линейного поиска
    //  сложность выше.
    //

    // n = 32   32 -> 16 -> 8->4 ->2 -> 1  =  5 раз   log(32)= 5
    // O(n) = n - линейный поиск
  //   O(32) = 32
    // O(n)= log(n)
     // O(32)=log(32)=5 - бинарный



}
