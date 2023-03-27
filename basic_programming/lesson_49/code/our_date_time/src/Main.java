import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

import static java.time.LocalTime.parse;

public class Main {
    //Date and Time in Java

    //Начиная с Java 8  появились новые классы для работы с датой и временем.
    /*
    Существовавшие до этого классы Date  и Calendar имели ряд существенных недостатков:
    1.Не были потокобезопасными
    2. Плохой дизайн и не всегда адекватная работа методов
    3. Не учитывалась зональность

    Новые классы для работы с датой и временем:
   1 LocalDate,
   2 LocalTime,
   3 LocalDateTime
   4 ZonedDateTime
   5 Period
   6 Duration
   Классы 1-3 используются наиболее часто,  представляют местное время и в основном нужны когда указывать временные
   зоны в явном виде не нужно

     */

    public static void main(String[] args) {
        //Local Date- этот класс представляе дату в ISO формате, без указания времени.
       // yyyy-MM-dd

        // получить текущую дату от системных часов
        LocalDate now = LocalDate.now();
        System.out.println("Today is "+now);
//Today is 2023-03-27

        // получить дату вида год-месяц-число можно двумя способами :
      LocalDate date2020=  LocalDate.of(2020,02,5);//метод of
      LocalDate dateParse = LocalDate.parse("2020-02-05");// метод parse

        System.out.println("date2020 = "+date2020);
        System.out.println("dateParse = "+dateParse);

        // методы plusDays,Weeks,Months,Years прибавляют соответствующее количество дней, месфцев и т.д.
        // методы minus  отнимают.
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is "+tomorrow);


        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("A month ago was "+previousMonthSameDay);

       LocalDate march29 = LocalDate.of(2023,03,29);

       LocalDate feb29 = march29.minus(1,ChronoUnit.MONTHS);
        System.out.println("29 February 2023 is "+feb29);

        System.out.println(LocalDate.parse("2023-03-27").getDayOfMonth());

       DayOfWeek monday= LocalDate.parse("2023-03-27").getDayOfWeek();
        System.out.println("Today is "+monday);

        LocalDate today = LocalDate.parse("2023-03-27");
        System.out.println("today is "+today.getDayOfYear()+" day of year");


        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(" Is 2023  a leap year? "+leapYear);


        // отношения между датами - была ли одна раньше или позже другой - методы isBefore() and isAfter()

        boolean before = LocalDate.now().isBefore(LocalDate.parse("2020-03-03"));
        boolean after =  LocalDate.now().isAfter(LocalDate.parse("2020-03-03"));

        System.out.println(before);//false
        System.out.println(after);//true
/*
false
true
 */

        //Local Time  - это представление времени без даты.

        // время сейчас
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time now is "+timeNow);

        LocalTime sevenThirty = LocalTime.of(7,30);
        System.out.println("time is "+sevenThirty);

        LocalTime eightForty = parse("08:40");
        System.out.println("time is "+eightForty);

        LocalTime nineForty = eightForty.plus(1,ChronoUnit.HOURS);
        System.out.println(nineForty);

        eightForty.plus(1,ChronoUnit.HOURS).plus(10,ChronoUnit.MINUTES);

      //  LocalTime eightTen = LocalTime.parse("08-10");
      //  LocalDate wrongDate = LocalDate.parse("2020:4:03");

       int ten = LocalTime.parse("10:30").getHour();
        System.out.println(ten);

        boolean isBefore = LocalTime.parse("07:30").isBefore(LocalTime.parse("08:30"));
        LocalTime maxTime = LocalTime.MAX;
        System.out.println("Max time is "+maxTime);
        System.out.println("Min time is "+LocalTime.MIN);
        System.out.println("Midnight is "+LocalTime.MIDNIGHT);


        //LocalDateTime
        System.out.println(LocalDateTime.now());

        System.out.println( LocalDateTime.of(2022, Month.MARCH,27,12,45) );
        System.out.println(LocalDateTime.parse("2022-03-27T12:45:00"));

        /*
    2022-03-27T12:45
2022-03-27T12:45
         */

        LocalDateTime dateTime = LocalDateTime.of(2022, Month.MARCH,27,12,45);

        System.out.println(dateTime.plusDays(1));
        System.out.println(dateTime.minusHours(5));
/*
2022-03-28T12:45
2022-03-27T07:45
 */

      //  dateTime.get

        //ZonedDateTimeAPI - используется при работе с зональными датой и временем.

        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        System.out.println("Berlin zone id is "+zoneId);

        Set<String> allZoneIDs =  ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIDs);


        System.out.println(ZonedDateTime.parse("2023-05-03T12:58:30+01:00[Europe/Paris]"));
    }


}
