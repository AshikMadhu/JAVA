package tutorials;

public class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Java Programming";
        author = "Unknown";
        price = 500.0;
    }
    Book(String title) {
        this.title = title;
        author = "Unknown";
        price = 500.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Object Oriented Programming");
        Book book3 = new Book("Data Structures", "Mark Allen Weiss", 750.0);

        System.out.println("Book 1 Details");
        book1.display();

        System.out.println("Book 2 Details");
        book2.display();

        System.out.println("Book 3 Details");
        book3.display();
    }
}
