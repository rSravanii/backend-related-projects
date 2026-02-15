// mini projects in that covers all concepts of basic to core(oops) level of java programming language

//1. Library management (console) that shows adding ,search, issue ,retur the book.

// book class

import java.util.Scanner;
import java.util.ArrayList;

interface InnerLibraryManagement {
    void addBook(Book book);

    Book searchBook(String name);

    void issueBook(String name);

    void returnBook(String name);
}

// book class
class Book {
    private String BookName;
    private int Edition;
    private boolean isIssued;
    private boolean isReturned;

    public Book(String name, int year) {
        this.BookName = name;
        this.Edition = year;
        this.isIssued = false;
        this.isReturned = false;
    }

    public String getBookName() {
        return BookName;
    }

    public int getEdition() {
        return Edition;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            isReturned = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

}
// library class

class Library implements InnerLibraryManagement {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookName());
    }

    // Method to search for a book by name
    public Book searchBook(String name) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                System.out.println("Book found: " + book.getBookName());
                return book;
            }
        }
        System.out.println("Book not found: " + name);
        return null;
    }

    // Method to issue a book by name
    public void issueBook(String name) {
        Book book = searchBook(name);
        if (book != null) {
            book.issueBook();
        }
    }

    // Method to return a book by name
    public void returnBook(String name) {
        Book book = searchBook(name);
        if (book != null) {
            book.returnBook();
        }
    }
}
// main class to test the above methods

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        // Adding books to the library
        System.out.println("Enter book name to add to library:");
        String bookName = sc.nextLine();
        System.out.println("Enter book edition:");
        int edition = sc.nextInt();
        sc.nextLine();
        // Consume newline
        Book book1 = new Book(bookName, edition);
        library.addBook(book1);

        // Searching for a book
        System.out.println("Enter book name to search in library:");
        String searchName = sc.nextLine();
        library.searchBook(searchName);

        // Issuing a book
        System.out.println("Enter book name to issue:");
        String issueName = sc.nextLine();
        library.issueBook(issueName);

        // Returning a book
        System.out.println("Enter book name to return:");
        String returnName = sc.nextLine();
        library.returnBook(returnName);

        sc.close();

    }

}
