import java.util.Comparator;

public class ComparatorByLastLetter implements Comparator<Animal> {
    public int compare( Animal an1, Animal an2){
        String animalName1 = an1.getName();
        String animalName2 = an2.getName();
        return animalName1.charAt(animalName1.length()-1) - animalName2.charAt(animalName2.length()-1);
       // Character.compare()
    }
}
