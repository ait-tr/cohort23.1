public class Main {
    public static void main(String[] args) {
        CounterMethod counterMethod = new CounterMethod();

        Thread ourThread1 = new Thread(new CountThreadMethod(counterMethod));
        Thread ourThread2 = new Thread(new CountThreadMethod(counterMethod));
        Thread ourThread3 = new Thread(new CountThreadMethod(counterMethod));
        Thread ourThread4 = new Thread(new CountThreadMethod(counterMethod));
        Thread ourThread5 = new Thread(new CountThreadMethod(counterMethod));


        ourThread1.setName("Thread1");
        ourThread2.setName("Thread2");
        ourThread3.setName("Thread3");
        ourThread4.setName("Thread4");
        ourThread5.setName("Thread5");

        ourThread1.start();
        ourThread2.start();
        ourThread3.start();
        ourThread4.start();
        ourThread5.start();
    }
}
