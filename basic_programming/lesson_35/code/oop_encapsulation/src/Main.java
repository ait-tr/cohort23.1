
public class Main {
    // Инкапсуляция
    public static void main(String[] args) {
        Person person = new Person("James",25, 190);

        System.out.println("Everything about "+person.name+":");
        System.out.println("James's age is "+person.age);
        System.out.println("James's height is "+person.height);

    }

}
