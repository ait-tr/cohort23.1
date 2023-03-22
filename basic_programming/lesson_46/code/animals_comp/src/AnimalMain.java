import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {

        /*
        Создать класс Animal с полями  String name, int weight, String colour.
        Используя компараторы, в классе AnimalMain  создать и вывести на экран  список животных упорядоченный:
        1. по названию
        2. по весу
        3. список названий животных, упорядоченный по возрастанию последней буквы имени
        [ Wolf, Fox, Anakonda, Bear, Elephant] ->
        Anakonda
        Wolf
        Bear
        Elephant
        Fox
         */
        Animal anim1 = new Animal("Wolf", 100, "grey");
        Animal anim2 = new Animal("Elephant", 1000, "white");
        Animal anim3 = new Animal("Bear", 500, "brown");
        Animal anim4 = new Animal("Fox", 30, "red");
        Animal anim5 = new Animal("Anakonda", 300, "yellow");

        Animal[] animals = {anim1, anim2, anim3, anim4, anim5};

        for (Animal a : animals) {
            System.out.println(a);
        }

        System.out.println("_----------------------byName---------------------");

        Arrays.sort(animals, new ComparatorByName());
        for (Animal a : animals) {
            System.out.println(a);
        }
        System.out.println("-----------------------byWeight---------------------");
        Arrays.sort(animals, new ComparatorByWeight());
        for (Animal a : animals) {
            System.out.println(a);
        }

        System.out.println("-----------------------by names by last letter---------------------");
        Arrays.sort(animals, new ComparatorByLastLetter());
        for (Animal a : animals) {
            System.out.println(a.getName());
        }
        /*
        Animal{name='Wolf', weight=100, colour='grey'}
Animal{name='Elephant', weight=1000, colour='white'}
Animal{name='Bear', weight=500, colour='brown'}
Animal{name='Fox', weight=30, colour='red'}
Animal{name='Anakonda', weight=300, colour='yellow'}
_----------------------byName---------------------
Animal{name='Anakonda', weight=300, colour='yellow'}
Animal{name='Bear', weight=500, colour='brown'}
Animal{name='Elephant', weight=1000, colour='white'}
Animal{name='Fox', weight=30, colour='red'}
Animal{name='Wolf', weight=100, colour='grey'}
-----------------------byWeight---------------------
Animal{name='Fox', weight=30, colour='red'}
Animal{name='Wolf', weight=100, colour='grey'}
Animal{name='Anakonda', weight=300, colour='yellow'}
Animal{name='Bear', weight=500, colour='brown'}
Animal{name='Elephant', weight=1000, colour='white'}
-----------------------by names by last letter---------------------
Anakonda
Wolf
Bear
Elephant
Fox

         */
    }
}
