public class TestMethodReference {

    public static void main(String[] args) {
        int[] ints = {1,-50,-80,10,-3,9};
        System.out.println(sum(ints,TestMethodReference::isPositive));
      //  System.out.println(sum(ints,TestMethodReference::isOdd));

        TestMethodReference tmr = new TestMethodReference();
        tmr.sumNonStatic(ints,tmr::isOdd);
    }

    public static boolean isPositive(int num){
        return num > 0;
    }

    public  boolean isOdd (int num){
        return num%2 != 0;
    }

    public static int sum(int[] ints,Checkable checkable){
        int sum = 0;
        for(int num : ints ){
            if(checkable.check(num))
                sum+=num;
        }
        return sum;
    }

    public  int sumNonStatic(int[] ints,Checkable checkable){
        int sum = 0;
        for(int num : ints ){
            if(checkable.check(num))
                sum+=num;
        }
        return sum;
    }
}
