import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Doctor Sleep", "Stephen King", "Horror");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Doctor Sleep", book.hasTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Stephen King", book.hasAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Horror", book.hasGenre());
    }
}
