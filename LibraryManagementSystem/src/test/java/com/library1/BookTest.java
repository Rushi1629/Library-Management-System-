package com.library1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.library.models.Book;

public class BookTest {

    @Test
    public void testGetTitle() {
        Book book = new Book("The Book Title", 12345);
        assertEquals("The Book Title", book.getTitle());
    }

    @Test
    public void testGetIsbn() {
        Book book = new Book("The Book Title", 12345);
        assertEquals(12345, book.getIsbn());
    }

    @Test
    public void testSetTitle() {
        Book book = new Book("The Book Title", 12345);
        book.setTitle("New Title");
        assertEquals("New Title", book.getTitle());
    }
}
