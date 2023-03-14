import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {



        Lion lion = new Lion();
        lion.name="Lion";
        System.out.println(lion.name);
        lion.animalSound();

        WildDog wildDog = new WildDog();
        wildDog.name = "Dingo";
        System.out.println(wildDog.name);
        wildDog.animalSound();

        Animal animal = new Animal();
        animal.name = "Animal";
        System.out.println(animal.name);
        animal.animalSound();

        Animal kingLion = new Lion();
        kingLion.name ="King";

        Animal dingoDog = new WildDog();
        dingoDog.name = "Dingo";

        System.out.print(kingLion.name+" ");
        kingLion.animalSound();


        System.out.print(dingoDog.name+" ");
        dingoDog.animalSound();

        Lion lion2 = new Lion();
        Animal king2 = new Lion();

      //  lion2.
      //  king2.
        // При создании обьекта в  виде Animal king2 = new Lion() у обьекта king2  доступны поля и методы класса
        // Animal . Причем если метод переопределен в классе Lion,  то он будет работать в переопределенном виде.

        List<Integer> list = new ArrayList<>();
        LinkedList list1 = new LinkedList();

        List<Animal> animals = List.of(animal,kingLion,king2,dingoDog,wildDog);



/*
King roars
Dingo woofs
 */



/*
Lion
Roar
Dingo
Woof
Animal
Animal produces a sound
 */


    }
}
