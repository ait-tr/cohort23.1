public class Person {
 private String name;
 private int age;

 private int weight;

 private int height;

 private  boolean isPresent;

 private  char letter;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int weight ){
        this(name,age);
      //  this.name = name;
      //  this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age, int weight, int height){
        this(name,age,weight);
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
        this.age = age;
        }else {
            System.out.println("Age cannot be negative!");
        }

    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        if(weight>20){
        this.weight = weight;
        }else{
            System.out.println("The weight is too small");
        }
    }

    public int getHeight(){

        return height;
    }

    public void setHeight(int height){
        if(height>100){
            this.height = height;
        }else{
            System.out.println("Height is too small");
        }

    }



    void move(){
        System.out.println("I can move");
    }

    void askName(){
        System.out.println("What is your name?");
        System.out.println("My name is "+name);
    }


}
