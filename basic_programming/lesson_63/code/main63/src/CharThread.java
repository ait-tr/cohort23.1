public class CharThread extends Thread{

    private final char symbol;

    public CharThread(char symbol){
        this.symbol = symbol;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " is starting");

        for( int i = 0; i<100; i++){
            System.out.println(symbol);

        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println(Thread.currentThread().getName()+ " is ending");
    }
}
