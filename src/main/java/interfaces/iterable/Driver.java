package interfaces.iterable;

public class Driver {
    static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        libraryCatalog.addBook("The Da Vinci Code", "Dan Brown");
        libraryCatalog.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        libraryCatalog.addBook("1984", "George Orwell");
        libraryCatalog.addBook("The Metamorphosis", "Franz Kafka");
        libraryCatalog.addBook("Fahrenheit 451", "Ray Bradbury");
        libraryCatalog.addBook("The old man and the sea", "Ernest Hemingway");

        libraryCatalog.checkoutBook("The Da Vinci Code");
        libraryCatalog.checkoutBook("Fahrenheit 451");

        // TODO:
        // Use iterator from LibraryCatalog to step over available books

    }
}
