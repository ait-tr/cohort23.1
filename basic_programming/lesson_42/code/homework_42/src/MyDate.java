import java.util.Objects;

public class MyDate {

    /*
    Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.
     */

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if( obj instanceof MyDate){
            MyDate m =(MyDate) obj;
            return this.day==m.day && this.month == m.month && this.year == m.year;
        }else{
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(day,month,year);
    }
}
