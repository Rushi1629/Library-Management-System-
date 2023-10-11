package com.library;

import java.util.HashMap;

import com.library.models.Book;
import com.library.models.Membership;

public class Library {
	private HashMap<Integer, Membership> members;
	private HashMap<Integer, Book> books;

	public Library() {
		members = new HashMap<>();
		books = new HashMap<>();
	}

	public void addMember(int memberId, String memberName) {
		Membership member = new Membership(memberId, memberName);
		members.put(memberId, member);
		System.out.println("New membership added successfully!");
	}

	public void viewMemberDetails() {
		System.out.println("Membership Details:");
		if (members.isEmpty()) {
			System.out.println("No members in the list.");
		} else {
			for (Membership member : members.values()) {
				System.out.println("Member ID: " + member.getMemberId() + ", Name: " + member.getMemberName());
			}
		}
	}

	public void updateMemberDetails(int memberId, String newName) {
		Membership member = members.get(memberId);
		if (member != null) {
			member.setMemberName(newName);
			System.out.println("Membership details updated successfully!");
		} else {
			System.out.println("Member not found!");
		}
	}

	public void closeMembership(int memberId) {
		Membership member = members.get(memberId);
		if (member != null) {
			members.remove(memberId);
			System.out.println("Membership closed successfully!");
		} else {
			System.out.println("Member not found!");
		}
	}

	public void addBook(int isbn, String title) {
		books.put(isbn, new Book(title, isbn));
		System.out.println("New book added successfully!");
	}

	public void viewBookDetails() {
		System.out.println("Book Details:");
		if (books.isEmpty()) {
			System.out.println("No books in the list.");
		} else {
			for (Book book : books.values()) {
				System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
			}
		}
	}

	public void updateBookDetails(int isbn, String newTitle) {
		Book book = books.get(isbn);
		if (book != null) {
			book.setTitle(newTitle);
			System.out.println("Book details updated successfully!");
		} else {
			System.out.println("Book not found!");
		}
	}

	public void deleteBookDetails(int isbn) {
		if (books.containsKey(isbn)) {
			books.remove(isbn);
			System.out.println("Book details deleted successfully!");
		} else {
			System.out.println("Book not found!");
		}
	}
	
	public HashMap<Integer, Membership> getMembers() {
        return members;
    }

    public HashMap<Integer, Book> getBooks() {
        return books;
    }

}
