import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        LocalDate date = LocalDate.of(2023,01,01);

        List<LocalDate> dates = new LinkedList<>();
        Collections.addAll(dates,
                LocalDate.now(),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(20),
                LocalDate.now().plusWeeks(6),
                LocalDate.now().plusYears(1));

        System.out.println(daysInBetween(dates));
        Collections.sort(dates);
        System.out.println(dates);

    }
    /*
    *Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий
    количество дней  между самой ранней и поздней датами
     */

    public static long daysInBetween(List<LocalDate> dates){
        Collections.sort(dates);

        return ChronoUnit.DAYS.between(dates.get(0),dates.get(dates.size()-1));


        /*
        Проект

        Программа для бухгалтерии.

        Тех задание:
        Молодому рекламному агентству нужна новая бухгалтерская программа.
        У заказчика следующие требования. Программа должна уметь:
        -добавлять сотрудников в штат
        -удалять сотрудников из штата
        -рассчитывать зарплату для двух категорий сотрудников:
            сотрудника с почасовой оплатой и менеджера по продажам
        -выводить на экран список сотрудников
        -суммировать зарплату всех сотрудников
        -у сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен
            учитывать минимальный размер оплаты труда
        -у менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж
            . Но в его случае также должен учитываься минимальный размер оплаты труда



         */
    }


}
