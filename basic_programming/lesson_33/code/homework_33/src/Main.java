
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException  {

        start();

    }

    /*
Написать метод, который при вводе с клавиатуры дня недели
отвечает на вопрос является ли этот день выходным.
(Если выходной то true, если рабочий то false ).
Использовать enum для представления дней недели
 */

    public static void start() throws IOException{
        DayOfWeek dayOfWeek = readDayOfWeek();
        System.out.println("It is "+ isDayOff(dayOfWeek));
    }

   /* private static DayOfWeek readDayOfWeek() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter day of week");
        String day = br.readLine();

        DayOfWeek enumDay = DayOfWeek.valueOf(day.toUpperCase());//превращает строку
        // в константу типа DayOfWeek в том случае если соответствующее название есть в списке констант энума.
        // а если нет бросает IllegalArgumentException

        return enumDay;
    }*/

    private static DayOfWeek readDayOfWeek() throws IOException{
        DayOfWeek enumDay=null;
        boolean flag;

        do {
            flag =false;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter day of week");
            String day = br.readLine();

            try {
                enumDay = DayOfWeek.valueOf(day.toUpperCase());//превращает строку
                // в константу типа DayOfWeek в том случае если соответствующее название есть в списке констант энума.
                // а если нет бросает IllegalArgumentException
            }catch (IllegalArgumentException e){
                System.out.println("Please enter valid day of week");
                flag=true;
            }
        }while(flag);
        return enumDay;
    }

    private static boolean isDayOff(DayOfWeek day){
        switch (day){
            case SATURDAY:
            case SUNDAY: return true;
            default: return false;
        }
    }

}

