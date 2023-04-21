import java.util.ArrayList;
import java.util.List;

public class Main {

    // Тараканьи бега.
    /*  есть 10 тараканов. Они должны пробежать 10 см. Каждый таракан пробегает за 100 до 150 милисекунд.
        Тараканы бегут одновременно.
        Составить таблицу пробега тараканов, в которой указано имя таракана и его результат
     */
    public static void main(String[] args) throws InterruptedException {
        List<Score> scores = new ArrayList<>();

        List<Tarakan>tarakans = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for ( int i = 0; i<10;i++){
            Tarakan tarakan = new Tarakan(100,150,10,startTime,"Tarakan"+i,scores);
            tarakans.add(tarakan);
        }

        for(Tarakan tarakan : tarakans){
            tarakan.start();
        }

        for(Tarakan tarakan:tarakans){
            tarakan.join();
        }

        System.out.println(scores);
    }
}
