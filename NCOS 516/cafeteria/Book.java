package cafeteria;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    Book(String title, String author, int publicationYear, boolean isAvailable){
        setTitle(title);
        setAuthor(author);
        setPublicationYear(publicationYear);
        setAvailable(isAvailable);
    }

    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getPublicationYear() {
        return publicationYear;
    }
    boolean getAvailable() {
        return isAvailable;
    }
}
