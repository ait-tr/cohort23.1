public class Demo {
    public static void main(String[] args) {


        ChildClass childClass = new ChildClass(10,20);
        System.out.println(childClass.a);
        ChildClass childClass1 = new ChildClass(10,30);
        System.out.println(childClass.b);

        /*
Constructor of ParentClass is used
Constructor od ChildClass is used
         */
    }
}
