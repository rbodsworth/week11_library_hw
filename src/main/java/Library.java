import java.util.ArrayList;

public class Library {

    private ArrayList<Book>libraryBooks;
    private int capacity;

    public Library(int capacity){
        this.libraryBooks = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return libraryBooks.size();
    }

    public void addBook(Book book1) {
        this.libraryBooks.add(book1);
    }

    public int totalCapacity(){
        return capacity;
    }
}
