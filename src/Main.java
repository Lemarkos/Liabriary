public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader("Tom", "Cruz", "1992-18-12", "Biology", 2233,"996500223344");
        Book book1 = new Book("Star wars", "Lucas");
        Book book2 = new Book("Lord of the Rings", "Tolkien");
        Book book3 = new Book("Harry Potter", "Julian");

        Book[] numBooks = new Book[3];
        numBooks[0] = book1;
        numBooks[1] = book2;
        numBooks[2] = book3;

        reader.takeBook(3);
        reader.takeBook(numBooks);
        reader.returnBook(3);
        reader.returnBook(numBooks);
    }
}
