public class MyThread implements Runnable{
    String name;

    MyThread (String name){
        this.name = name;
    }
    //точка входа в новый поток
    @Override
    public void run() {
        System.out.println(name +" starts");
    try {
        for (int counter = 0; counter < 10; counter++) {
          //  Thread.sleep(400);
            Thread.sleep(0);
            System.out.println("in thread " + name + " counter is " + counter);
        }
    }
    catch (InterruptedException e){
        System.out.println(name +" interrupted");
    }
        System.out.println(name + "terminates");
    }
}
