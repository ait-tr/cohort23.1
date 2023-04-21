public class CountThread implements Runnable{

    Counter count;

    CountThread(Counter count){
        this.count = count;
    }

    public void run() {
        synchronized (count) {
            count.counter = 1;

            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + count.counter);
                count.counter++;

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
