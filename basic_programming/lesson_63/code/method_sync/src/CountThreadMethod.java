public class CountThreadMethod implements Runnable {
    CounterMethod counterMethod;

    CountThreadMethod(CounterMethod counterMethod){
        this.counterMethod = counterMethod;
    }

    public void run(){
        counterMethod.increment();
    }
}
