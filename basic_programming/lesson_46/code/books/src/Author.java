public class Author implements Comparable<Author> {

    String authorName;
    String bookName;
    int  year;

    public Author(String authorName, String bookName, int year) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public int compareTo(Author au){
        return this.authorName.compareTo(au.authorName);
    }

    @Override
    public String toString() {
        return authorName + " " +bookName+" "+ year;}
}
