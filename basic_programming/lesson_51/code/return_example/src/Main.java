public class Main {
    public static void main(String[] args) {
        int num = 1;

        Main main = new Main();
        main.printSmth(num);

        System.out.println(main.sum(2,2));
    }

    public void printSmth(int num){

        if(num==1) {
            System.out.println("number = 1");
            return;
        }
        System.out.println("number = 2");
    }

    public int sum(int a, int b){

        if(a==b){
            return 2*(a+b);
        }

        return a+b;
    }
}
