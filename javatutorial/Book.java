package tutorials;

public class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Java Programming";
        author = "Unknown";
        price = 500.0;
    }

    // Constructor with Title only
    Book(String title) {
        this.title = title;
        author = "Unknown";
        price = 500.0;
    }

    // Constructor with Title, Author and Price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Object using Default Constructor
        Book book1 = new Book();

        // Object using Constructor with Title
        Book book2 = new Book("Object Oriented Programming");

        // Object using Constructor with Title, Author and Price
        Book book3 = new Book("Data Structures", "Mark Allen Weiss", 750.0);

        System.out.println("Book 1 Details");
        System.out.println("--------------------");
        book1.display();

        System.out.println("Book 2 Details");
        System.out.println("--------------------");
        book2.display();

        System.out.println("Book 3 Details");
        System.out.println("--------------------");
        book3.display();
    }
}