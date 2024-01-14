// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author kickJackson = new Author("Kick" , "Jackson");
        Author lowrenceGigatti = new Author("Lowrence" , "Gigatti");

        Book book1 = new Book("Silence", kickJackson, 1953);
        Book book2 = new Book("Galagooga", lowrenceGigatti, 1524);

        book2.setPublishYear(1998);



    }
}