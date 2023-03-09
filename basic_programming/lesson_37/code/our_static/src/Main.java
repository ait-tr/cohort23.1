public class Main {

    // key word static-  ключевое слово static
    public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name ="Cat1";
   // Cat.counter
    Cat.mew();


    StaticSum ob1 = new StaticSum();
    StaticSum ob2 = new StaticSum();
// каждый обьект имеет свою копию переменной x
    ob1.x = 10;
    ob2.x = 20;

        System.out.println("ob1.x= "+ob1.x);
        System.out.println("ob2.x= "+ob2.x);

    StaticSum.y = 5;
        System.out.println("set y to y="+StaticSum.y);

        System.out.println("Counting sum");

        System.out.println("ob1 sum: "+ob1.sum());
        System.out.println("ob2 sum: "+ob2.sum());

        StaticSum.y = 10;

        System.out.println("ob1 sum: "+ob1.sum());
        System.out.println("ob2 sum: "+ob2.sum());

        /*
ob1.x= 10
ob2.x= 20
set y to y=5
Counting sum
ob1 sum: 15
ob2 sum: 25
ob1 sum: 20
ob2 sum: 30
         */

        // from class StaticBlock
        StaticBlock staticBlock = new StaticBlock("Inside Constructor");

        System.out.println( "Square root of 2 is "+ StaticBlock.rootOf2);
        System.out.println( "Square root of 3 is "+ StaticBlock.rootOf3);

        /*
Inside Static Block
Inside Constructor
Square root of 2 is 1.4142135623730951
Square root of 3 is 1.7320508075688772
         */

      //  StaticBlock.MY_INT = 40;

    }


}
