public class Person {
    String name;
    int age;

    int weight;

    int height;

    boolean isPresent;

    char letter;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name,int age, int weight ){
        this(name,age);
      //  this.name = name;
      //  this.age = age;
        this.weight = weight;
    }

    public Person(String name,int age, int weight, int height){
        this(name,age,weight);
        this.height = height;
    }

    void move(){
        System.out.println("I can move");
    }

    void askName(){
        System.out.println("What is your name?");
        System.out.println("My name is "+name);
    }
}
