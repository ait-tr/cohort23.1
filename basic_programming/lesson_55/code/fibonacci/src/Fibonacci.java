public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(0));//0
        System.out.println(fib(1));//1
        System.out.println(fib(2));//1
        System.out.println(fib(3));//2
        System.out.println(fib(4));//3
        System.out.println(fib(5));//5

        System.out.println("via array");
    //    System.out.println(fibViaArray(0));//0
    //    System.out.println(fibViaArray(1));//1
    //    System.out.println(fibViaArray(2));//1
        System.out.println(fibViaArray(3));//2
    //    System.out.println(fibViaArray(4));//3
    //    System.out.println(fibViaArray(5));//5

        System.out.println("recursion");

        System.out.println(fibRecursive(0));//0
        System.out.println(fibRecursive(1));//1
        System.out.println(fibRecursive(2));//1
        System.out.println(fibRecursive(3));//2
        System.out.println(fibRecursive(4));//3
        System.out.println(fibRecursive(5));//5
    }
   // 0  1  2  3
  //  0, 1, 1, 2, 3,5,8,13,21,34,55,
    /*

    current = 1
    next = 2
    sum = current +next=3

     2 step
    current =next = 2
    next = sum = 3
    sum = current + next = 5

    3 step
     */

    public static long fib(int n){ // n=2
        int current = 0;
        int next = 1;

        for (int i = 0;i<n;i++){ //1
            System.out.println("current ="+current);
            System.out.println("next ="+next);
           // System.out.println("newFib ="+newFib);
            int newFib = current + next;// newFib = 1+1=2
            System.out.println("newFib ="+newFib);
            current = next;// current = 1
            next = newFib; // next = 2

        }
        return current;
    }
    //  0  1  2  3
    //  0, 1, 1, 2, 3,5,8,13,21,34,55,
    public static long fibViaArray(int n){//3
        long[] cache = new long[n + 1];//4
      //  long[] cache = new long[n];

        if (n < 2)
            return n;

        cache[0] = 0;
        cache[1] = 1;

        for ( int i = 2;i<cache.length;i++){
            cache[i] = cache[i - 2] + cache[i - 1];
            System.out.println("cache[i-2]= "+cache[i-2]);
            System.out.println("cache[i-1]= "+cache[i-1]);
            System.out.println("cache[i]= "+cache[i]);
        }
        return cache[n];
    }
    /*
    via array
cache[i-2]= 0
cache[i-1]= 1
cache[i]= 1
1
     */

    public static int fibRecursive(int n){//2
        if(n <= 1)
            return n;

        return fibRecursive(n -1)+fibRecursive(n - 2);//1+0

    }
}
