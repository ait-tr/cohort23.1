public class Main {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (a,b)->(a%b) == 0;
        System.out.println(isFactor.test(10,2));//true

        SomeTest<Double> isFactorD = (a,b)->(a%b) == 0;
        System.out.println(isFactorD.test(200.0,4.0));

        SomeTest<String> isPart = (s1,s2)-> s1.contains(s2);
        System.out.println(isPart.test("abcd","bc"));

        int[] ints = {1,50,80,10,3,9};
        Checkable moreThan10 = n -> n > 10;
        moreThan10 = n -> n < 5;
        System.out.println("sum of elements more than ten = "+sum(ints,moreThan10));


        PersonCreator personCreator = Person ::new;
        Person person = personCreator.create("Jack");
        System.out.println(person.name);
    }

    //Лямбда может быть параметром в методе

    public static int sum(int[] ints,Checkable checkable){
        int sum = 0;
        for(int num : ints ){
            if(checkable.check(num))
                sum+=num;
        }
        return sum;
    }

    // Method reference (ссылки на метод)
    /*
    Ссылки на метод бывают трех видов :
    -на статический метод
     ClassName :: methodName
     имя класса :: имя статического метода

     - на не статический метод
     в этом случае вместо названия класса используется имя обьекта этого класса

     - на конструктор
     ClassName :: new
     */

}
