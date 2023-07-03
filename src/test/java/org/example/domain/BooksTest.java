package org.example.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BooksTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Books}
     *   <li>{@link Books#setAuthor(Set)}
     *   <li>{@link Books#setBook_Edition(String)}
     *   <li>{@link Books#setBook_Name(String)}
     *   <li>{@link Books#setBook_Publisher(String)}
     *   <li>{@link Books#setId(int)}
     *   <li>{@link Books#getAuthor()}
     *   <li>{@link Books#getBook_Edition()}
     *   <li>{@link Books#getBook_Name()}
     *   <li>{@link Books#getBook_Publisher()}
     *   <li>{@link Books#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Books actualBooks = new Books();
        HashSet<Author> author = new HashSet<>();
        actualBooks.setAuthor(author);
        actualBooks.setBook_Edition("Book Edition");
        actualBooks.setBook_Name("Book Name");
        actualBooks.setBook_Publisher("Book Publisher");
        actualBooks.setId(1);
        assertSame(author, actualBooks.getAuthor());
        assertEquals("Book Edition", actualBooks.getBook_Edition());
        assertEquals("Book Name", actualBooks.getBook_Name());
        assertEquals("Book Publisher", actualBooks.getBook_Publisher());
        assertEquals(1, actualBooks.getId());
    }
}

