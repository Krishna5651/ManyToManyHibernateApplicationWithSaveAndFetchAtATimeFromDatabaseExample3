package org.example.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AuthorTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Author}
     *   <li>{@link Author#setAuthor_Education(String)}
     *   <li>{@link Author#setAuthor_Email(String)}
     *   <li>{@link Author#setAuthor_Id(int)}
     *   <li>{@link Author#setAuthor_Name(String)}
     *   <li>{@link Author#setBooks(Set)}
     *   <li>{@link Author#getAuthor_Education()}
     *   <li>{@link Author#getAuthor_Email()}
     *   <li>{@link Author#getAuthor_Id()}
     *   <li>{@link Author#getAuthor_Name()}
     *   <li>{@link Author#getBooks()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Author actualAuthor = new Author();
        actualAuthor.setAuthor_Education("JaneDoe");
        actualAuthor.setAuthor_Email("jane.doe@example.org");
        actualAuthor.setAuthor_Id(1);
        actualAuthor.setAuthor_Name("JaneDoe");
        HashSet<Books> books = new HashSet<>();
        actualAuthor.setBooks(books);
        assertEquals("JaneDoe", actualAuthor.getAuthor_Education());
        assertEquals("jane.doe@example.org", actualAuthor.getAuthor_Email());
        assertEquals(1, actualAuthor.getAuthor_Id());
        assertEquals("JaneDoe", actualAuthor.getAuthor_Name());
        assertSame(books, actualAuthor.getBooks());
    }
}

