import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    Book book1, book2, book3, book4, book5;

    @Before
    public void before(){
        library = new Library(4);

        book1 = new Book ("Doctor Sleep", "Stephen King", "Horror");
        book2 = new Book ("The Invisible Man", "HG Wells", "Sci-fi");
        book3 = new Book ("Crash", "JG Ballard", "Fiction");
        book4 = new Book ("Poverty Safari", "Darren McGarvey", "Biography");
        book5 = new Book ("Ubik", "Philip K Dick", "Sci-fi");
    }

    @Test
    public void canAddBook(){
        library.addBook (book1);
        assertEquals(1, library.bookCount());

    }
    @Test
    public void bookCount(){
        library.addBook (book1);
        library.addBook (book2);
        assertEquals(2, library.bookCount());



    }

    @Test
    public void canCheckCapacity(){
        assertEquals(4, library.totalCapacity());
    }


}
