public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[40] = 100;
            arr[40] = 100/0 ;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException exception){
            System.out.println("Arithmetic exception");
        }

        catch (Exception exception){
            System.out.println("Some other exception");
        }
        System.out.println("out of try-catch");




    }
}