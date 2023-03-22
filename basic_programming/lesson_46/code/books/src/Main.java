import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Dauthor", "Rbook", 2000));
        authors.add(new Author("Nauthor", "Bbook", 1830));
        authors.add(new Author("Fauthor", "Ubook", 2021));
        authors.add(new Author("Gauthor", "Sbook", 1976));
        authors.add(new Author("Aauthor", "Tbook", 1963));

        System.out.println("Print before sorting:");
        // System.out.println(authors);
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.println();

        System.out.println("Sorting by author's name:");
        Collections.sort(authors);
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println();
        System.out.println("Sorting by publishing date:");
        Collections.sort(authors, new PublishingYearComparator());
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println();
        System.out.println("Sorting by book's name:");
        Collections.sort(authors, new BookNameComparator());
        for (Author author : authors) {
            System.out.println(author);


        }

    }
}
