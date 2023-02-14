import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args)  {
        Random random = new Random();

        int x =  random.nextInt(30);
        int y =  random.nextInt(100);

        //     System.out.println("random 30 "+x);
        //     System.out.println("random 100 "+y);

        String[]cars = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        //     findCar(cars,"opel");


        //Exceptions

        int num1, num2;

        num1 = 8;
        num2 = 0;
        //   num2 = 0;

        try {
            int res = num1 / num2;
            //       System.out.println(res);
        }catch(ArithmeticException exception){
            //        System.out.println("Do not divide by zero");
            //       System.out.println(exception.getMessage());
        }

        //NullPointerException
        //   String str = null;
        //   System.out.println(str.length());

        //NumberFormatException
        //  int num = Integer.parseInt("Hello");

        //ArrayIndexOutOfBoundsException
        //    int arr[] = new int[3];
        //    arr[40] = 10;

        //наиболее важные понятия :
        /*
        try - код, который может вызвать ошибку помещается в try block,  который передает управление программой
        в блок catch  в случае возникновения ошибки.

        catch - здесь пишется код, обрабатывающий ошибку есди она происходит. Этот блок выполняется только если
                ошибка происходит. Если есть catch  блок то должен быть выше и try

        finally - этот блок всегда выполняется

        throw - используется для того чтобы бросить исключение

        throws - используется в сигнатуре метода и указывает на то что метод может бросать исключение


        TRY-CATCH блок

        try{
        //команды, которые могут вызвать ошибку
        } catch(Exception e){
        //команды, которые выполнятся если ошибка произойдет
        }
         */

        int number1, number2;
        try {
            //      number1 = 0;
            //      number2 = 100 / number1;
            //      System.out.println(number2);
            //      System.out.println("This is the end of try block");
        }
        catch (ArithmeticException exception){
        /*
        этот блок выполняется только в случае арифметической ошибки
         */
            System.out.println("Do not divide a number by zero");
        }

        catch (Exception exception){
        /*
        это общий обработчик ошибок,т.е. он может обрабатывать все ошибки.
        Он выполнится если ошибка не обработана ни одним из предшествующих catch блоков
         */
            System.out.println("Exception occured");

        }
        System.out.println("Out of try-catch block now");

    /* CATCH blocks
    1.try может иметь много catch блоков
    2.Общий catch  может обрабатывать все исключения, но результат становится менее информативным
    3.Если ошибки не происходит в блоке try то все блоки catch  полностью игнорируются
    4. Для каждого определенного типа ошибки выполняется свой соответствующий catch блок
     */

        try {
            int[] arr = new int[10];
            //    arr[4] = 100 / 0;
            arr[40] = 100 / 0;
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


        //FINALLY block
        /*
         try{
        //команды, которые могут вызвать ошибку
        } catch(Exception e){
        //команды, которые выполнятся если ошибка произойдет
        }
        finally {
        //команды, которые будут выполнены
         */
        try {
            int num3 = 100 / 0;
            System.out.println(num3);
        }
        catch (ArithmeticException exception){
            System.out.println("do not divide by 0");
        }

        finally {
            System.out.println("I am finally block. I always execute");
        }
        System.out.println("out of try-catch-finally");

        System.out.println(method());
        /*
        I run even after return statement
        0
         */

        System.out.println("*******************************");
        try {
            //  int num = 100 / 3;
            //       int num = 100 / 0;
            //       System.out.println(num);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            //        System.out.println("finally block");
        }


        //    throw new ArithmeticException("dividing by 10 is not allowed");

        //    checkAgeAndWeight(5,25);

        try {
            throwsMethod(4);
        }catch (Exception exception){
            System.out.println(exception);
        }

        /*
        Homework
        1- Поймать ошибку, которая возникает при выполнении следующего кода
        int a = 40/0

        2- поймать ошибку возникающую при выполнении кода String s =null  ; String m = s.toLowerCase()

        3- int[] m = new int[2]
        m[8]=5
         */

    }

    /*
    1. finally  существует только вместе с try
    2. В finally помещаются те команды, которые должны всегда испольняться
    3. Блок finally  не обязателен
    4. Если исключение не происходит, то finally  исполняется вслед за try ,  а если происходит то сначала
    исполняется catch
    5. Finally  выполняется даже тогда, когда в try  присутствуют команды типа return, break, continue
     */

    public static int method(){
        try{
            return 0;
        }
        finally {
            System.out.println("I run even after return statement");
        }
    }



    //check age with exception
    public static void checkAgeAndWeight(int age, int weight){
        if(age<6 && weight<30){
            throw new ArithmeticException("you are not eligible for our school");
        }
        else{
            System.out.println("You are admitted");
        }
    }


    public static void throwsMethod(int n )throws IOException,ClassNotFoundException{
        if(n==1){
            throw new IOException("IOException occured");
        }else {
            throw new ClassNotFoundException("Class does not exist");
        }

    }







    public static  void findCar(String[]cars,String carToFind){
        Random random = new Random();
        int length = cars.length;

        for(int i=0;i<length;i++){

            if(cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("this car is available");
                return;
            }


        }
        int index = random.nextInt(cars.length);
        System.out.println("this car is not available. Take "+cars[index]);


        //    for(String car: cars)
        //        System.out.print(car+" ");
    }

}
