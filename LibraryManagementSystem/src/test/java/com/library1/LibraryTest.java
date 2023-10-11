package com.library1;

import org.junit.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.library.Library;

public class LibraryTest {

    private  Library library;

    @Before
    public  void setUp() {
        library = new Library();
    }

    @Test
    public void testAddMember() {
        library.addMember(1, "Alice");
        assertEquals(1, library.getMembers().size());
    }
    
    @Test
    public void testAddBook() {
        // Perform the action
        library.addBook(123456, "Sample Book");
        // Verify the side effect (e.g., check if the book was added)
        assertTrue(library.getBooks().containsKey(123456));
    }

    @Test
    public void testUpdateMemberDetails() {
        // Set up initial state
        library.addMember(1, "John Doe");

        // Perform the action
        library.updateMemberDetails(1, "Jane Doe");

        // Verify the side effect (e.g., check if the member name was updated)
        assertEquals("Jane Doe", library.getMembers().get(1).getMemberName());
    }
    
    @Test
    public void testUpdateBookDetails() {
        // Set up initial state
        library.addBook(123456, "Sample Book");

        // Perform the action
        library.updateBookDetails(123456, "New Book Title");

        // Verify the side effect (e.g., check if the book title was updated)
        assertEquals("New Book Title", library.getBooks().get(123456).getTitle());
    }
    
    @Test
    public void testCloseMembership() {
        // Set up initial state
        library.addMember(1, "John Doe");

        // Perform the action
        library.closeMembership(1);

        // Verify the side effect (e.g., check if the member was removed)
        assertNull(library.getMembers().get(1));
    }
    
    @Test
    public void testDeleteBookDetails() {
        // Set up initial state
        library.addBook(123456, "Sample Book");

        // Perform the action
        library.deleteBookDetails(123456);

        // Verify the side effect (e.g., check if the book was removed)
        assertFalse(library.getBooks().containsKey(123456));
    }
    
}
