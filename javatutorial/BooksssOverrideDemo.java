package tutorials;

class Booksss {

    String title;
    String author;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class TechnicalBooksss extends Booksss {

    String subject;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class StoryBooksss extends TechnicalBooksss {

    String genre;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

public class BooksssOverrideDemo {

    public static void main(String[] args) {

        Booksss book = new Booksss();
        book.title = "General Book";
        book.author = "John";

        TechnicalBooksss technicalBook = new TechnicalBooksss();
        technicalBook.title = "Java Programming";
        technicalBook.author = "James";
        technicalBook.subject = "Computer Science";

        StoryBooksss storyBook = new StoryBooksss();
        storyBook.title = "The Lost World";
        storyBook.author = "Arthur";
        storyBook.genre = "Adventure";

        Booksss reference;

        System.out.println("BOOK DETAILS ");
        reference = book;
        reference.display();

        System.out.println("\nTECHNICAL BOOK DETAILS ");
        reference = technicalBook;
        reference.display();

        System.out.println("\n STORY BOOK DETAILS");
        reference = storyBook;
        reference.display();
    }
}