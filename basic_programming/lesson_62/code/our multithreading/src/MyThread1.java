public class MyThread1 extends Thread{

    MyThread1(String name){
        super(name);
    }

    public void run() {
        System.out.println(getName() +" starts");
        try {
            for (int counter = 0; counter < 10; counter++) {
                  Thread.sleep(400);
              //  Thread.sleep(0);
                System.out.println("in thread " + getName() + " counter is " + counter);
            }
        }
        catch (InterruptedException e){
            System.out.println(getName() +" interrupted");
        }
        System.out.println(getName() + "terminates");
    }
}
