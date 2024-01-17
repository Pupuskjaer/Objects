import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;
    private String fullName;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName,String secondName) {
        this.fullName = firstName + secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(fullName, author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Автор книги - " + fullName;
    }

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fullName = firstName + secondName;
    }
}
