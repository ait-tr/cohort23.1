public class Main {

    // Multithreading
    //
    // Создание потока.

    /*
    Поток можно создать двумя способами - используя класс Thread  или интерфейс
    Runnable

    I. Interface Runnable
    Runnable  имеет единственный метод public void run()
    Написанный внутри этого метода  код можно запустить в новом потоке.
    Метод run  является полноценным методом ( в нем можно вызывать другие методы,
    использовать другие классы, создавать переменные) Его отличие заключается
    в том, что он представляет собой точку входа для нового параллельного потока
    в программе. Этот поток закончится  с окончанием исполнения метода run()

    После создания  класса реализующего интерфейс Runnable  создается обьект класса Thread использующий
    обьект Runnable -    Thread( Runnable ob)

    После создания поток не запустится автоматически.  Для этого нужно вызвать метод start() класса Thread
    Фактически, этот метод осуществляет вызов метода run()
    void start()

     */
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        //создание обьекта, реализующего интерфейс Runnable
      //  MyThread myThread = new MyThread("Thread1");

        //создание потока на этом обьекте
     //   Thread newThread = new Thread(myThread);
       // Thread newThread1 = new Thread(myThread,"Thread2");

        //запуск потока
     //   newThread.start();

        //создание через класс
        MyThread1 myThread1 = new MyThread1("Thread 1");
        myThread1.start();
        MyThread1 myThread1a = new MyThread1("Thread 1a");
        MyThread1 myThread1b = new MyThread1("Thread 1b");
        myThread1a.start();
        myThread1b.start();


        for (int i=0;i<100;i++){
            System.out.print("#");
            try{
                Thread.sleep(100);
              //  Thread.sleep(0);
            }
            catch(InterruptedException e){
                System.out.println("main thread interrupted");
            }
        }
        System.out.println("Main thread ends");
    }
    /*
    Main thread starts
#Thread1starts
###in thread Thread1 counter is 0
####in thread Thread1 counter is 1
####in thread Thread1 counter is 2
####in thread Thread1 counter is 3
###in thread Thread1 counter is 4
####in thread Thread1 counter is 5
####in thread Thread1 counter is 6
####in thread Thread1 counter is 7
###in thread Thread1 counter is 8
####in thread Thread1 counter is 9
Thread1terminates
##############################################################Main thread ends


II. Создание потока через класс Thread
-происходит через создание класса, расширяющего Thread  и переопределения метода run()

     */
}
