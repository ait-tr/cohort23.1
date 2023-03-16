public class Main {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2,8,2023);
        MyDate m2 = new MyDate(2,8,2023);

        if(m1.equals(m2)){
            System.out.println("m1 is equal to m2");
        }else {
            System.out.println("m1 is not equal to m2");
        }

        System.out.println("Hashcodes are equal? "+(m1.hashCode()==m2.hashCode()));
    }
}
