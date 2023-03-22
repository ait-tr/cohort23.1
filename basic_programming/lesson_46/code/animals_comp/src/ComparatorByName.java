import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2){
        return animal1.getName().compareTo(animal2.getName());
    }
}
