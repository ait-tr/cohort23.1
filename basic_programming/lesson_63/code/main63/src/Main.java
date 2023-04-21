public class Main {
    /*
    Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков (Например,
    один поток печатает # а второй *).
    В конце работы на экран должно выводиться "end of main"            */
    public static void main(String[] args){ //throws InterruptedException {

        Thread hashThread = new CharThread('#');
        Thread starThread = new CharThread('*');

        hashThread.setName("HashThread");
        starThread.setName("StarThread");

        hashThread.start();
        starThread.start();

        try {
            hashThread.join();
            System.out.println("HashThread joining");
            starThread.join();
            System.out.println("StarThread joining");
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        // цикл выполняется пока не закончат работу оба потока hashThread and starThread . Тогда метод isAlive
       // возвращает false,  цикл заканчивается и печатается  end of main  из строки 24
     //   do{
        //    System.out.println(".");
        //    Thread.sleep(10);
     //   }while ( hashThread.isAlive() || starThread.isAlive());

        System.out.println("end of main");

      //  hashThread.setPriority(-1);
        System.out.println("HashThread priority is now "+hashThread.getPriority());
        System.out.println(starThread.getPriority());
        System.out.println("Main thread priority is "+Thread.currentThread().getPriority());


    }

    /*
    Способы определения момента окончания работы потока:
    1. метод isAlive()
    boolean isAlive()

    2. метод void join() - заставляет поток, из которого вызван join ( main thread)
    ждать на этом месте пока не закончится поток, от которого вызван join (  в нашем случае hashThread или
    starThread

    Приоритеты потоков
    приоритеты потоков могут меняться  с помощью метода void setPriority(int level)

    //Cинхронизация Synchronization




     */

}
