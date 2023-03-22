import java.util.Comparator;

public class BookNameComparator implements Comparator<Author> {
    public int compare(Author a1, Author a2){
        return a1.bookName.compareTo(a2.bookName);
    }
}
