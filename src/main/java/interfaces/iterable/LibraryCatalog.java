package interfaces.iterable;

import java.util.ArrayList;
import java.util.List;

// Class LibraryCatalog
// TODO:
// Should implement Iterable<Book>. In the iterator() method should return
// the Iterator<Book> that can be obtained by calling .iterator() on the books list.
public class LibraryCatalog { // Implement Iterable<Book>
    private List<Book> books;

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    /**
     * Add a book to the ArrayList books
     * @param title title of the book
     * @param author author of the book
     */
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    /**
     * Find the book by title and if it's available, check it out and return true.
     * If the book is not found or not available, return false
     * @param title title of the book
     * @return true if we could check out the book, and false otherwise
     */
    public boolean checkoutBook(String title) {
        for (Book b: books) {
            if (b.getTitle().equals(title)) {
                return b.checkout();
            }
        }
        return false;
    }

    /**
     * Find the book by title (you can add a private method), and if it's currently checked out, return it to the library and return true.
     * If the book is not found or not checked out, return false.
     * @param title title of the book
     * @return true if we could return the book to the library, and false otherwise
     */
    public boolean returnBook(String title) {
        for (Book b: books) {
            if (b.getTitle().equals(title)) {
                return b.returnToLibrary();
            }
        }
        return false;
    }

    /**
     * Print books that are not checked out
     */
    public void printAvailableBooks() {
        for (Book b: books) {
            if (!b.isCheckedOut())
                System.out.println(b);
        }

    }

}
