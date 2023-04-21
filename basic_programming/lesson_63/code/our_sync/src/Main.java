public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread ourThread1 = new Thread(new CountThread(counter));
        Thread ourThread2 = new Thread(new CountThread(counter));
        Thread ourThread3 = new Thread(new CountThread(counter));
        Thread ourThread4 = new Thread(new CountThread(counter));
        Thread ourThread5 = new Thread(new CountThread(counter));

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
