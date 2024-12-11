package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testBookConstructor() {
        Book book = new Book("1984", "George Orwell", 1949, "1112225368");
        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals(1949, book.getYearPublished());
    }
    @Test
    void testBookToString() {
        Book book = new Book("1984", "George Orwell", 1949, "1112225368");
        assertEquals("Book{" +
                "title='" + book.getTitle() + '\'' +
                ", author='" + book.getAuthor() + '\'' +
                ", yearPublished=" + book.getYearPublished() +
                '}', book.toString());
    }
}
