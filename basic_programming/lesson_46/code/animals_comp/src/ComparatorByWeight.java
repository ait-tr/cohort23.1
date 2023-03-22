import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal>{

    public int compare(Animal animal1, Animal animal2){
        return animal1.getWeight() - animal2.getWeight();
    }
}
