import javax.security.sasl.AuthorizeCallback;

public class Book {
    private String name;
    private Author author;
    private int publishYear;

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }
}
