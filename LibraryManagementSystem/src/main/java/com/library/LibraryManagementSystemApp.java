package com.library;

import java.util.Scanner;

public class LibraryManagementSystemApp {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------");
			System.out.println("Library Management System:");
			System.out.println("1. Add New Membership");
			System.out.println("2. View Membership Details");
			System.out.println("3. Update Membership Details");
			System.out.println("4. Close Membership");
			System.out.println("5. Add New Book");
			System.out.println("6. View Book Details");
			System.out.println("7. Update Book Details");
			System.out.println("8. Delete Book Details");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			try {
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) {
				case 1:
					System.out.print("Enter member ID: ");
					Integer memberId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter member name: ");
					String name = scanner.nextLine();
					if (isInteger(name)) {
                        System.out.println("Invalid member name. Please enter a valid string.");
                        continue; // Skip the rest of the loop
                    }
					library.addMember(memberId, name);
					break;
				case 2:
					library.viewMemberDetails();
					break;
				case 3:
					System.out.print("Enter member ID to update: ");
					memberId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter new member name: ");
					String newName = scanner.nextLine();
					if (isInteger(newName)) {
                        System.out.println("Invalid new member name. Please enter a valid string.");
                        continue; // Skip the rest of the loop
                    }
					library.updateMemberDetails(memberId, newName);
					break;
				case 4:
					System.out.print("Enter member ID to close: ");
					memberId = scanner.nextInt();
					scanner.nextLine();
					library.closeMembership(memberId);
					break;
				case 5:
					System.out.print("Enter book ISBN: ");
					Integer isbn = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter book title: ");
					String title = scanner.nextLine();
					if (isInteger(title)) {
                        System.out.println("Invalid book title. Please enter a valid string.");
                        continue; // Skip the rest of the loop
                    }
					library.addBook(isbn, title);
					break;
				case 6:
					library.viewBookDetails();
					break;
				case 7:
					System.out.print("Enter book ISBN to update: ");
					isbn = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter new book title: ");
					String newTitle = scanner.nextLine();
					if (isInteger(newTitle)) {
                        System.out.println("Invalid new book title. Please enter a valid string.");
                        continue; // Skip the rest of the loop
                    }
					library.updateBookDetails(isbn, newTitle);
					break;
				case 8:
					System.out.print("Enter book ISBN to delete: ");
					isbn = scanner.nextInt();
					scanner.nextLine();
					library.deleteBookDetails(isbn);
					break;
				case 0:
					System.out.println("Thank you for visiting our Library Management System.");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please choose a valid option.");
				}
			} catch (java.util.InputMismatchException e) {
				// Handle non-integer input
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.nextLine(); // Consume invalid input
				continue; // Skip the rest of the loop
			}

		}
	}

	private static boolean isString(String str) {
		return str.matches("^[a-zA-Z]*$");
	}
	
	private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}