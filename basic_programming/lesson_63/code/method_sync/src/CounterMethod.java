public class CounterMethod {

    int counter;
   synchronized void increment(){
        counter = 1;

        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + counter);
            counter++;

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
