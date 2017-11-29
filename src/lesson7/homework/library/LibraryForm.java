package lesson7.homework.library;

import java.util.List;
import java.util.Scanner;

public class LibraryForm {

    private Library library;

    Scanner scanner = new Scanner(System.in);

    public LibraryForm(Library library) {
        this.library = library;
    }

    public void start() {




        while (true) {
            System.out.println("Please choose what you want:");
            System.out.println("1. Find books from same author");
            System.out.println("2. Find a book");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("1")) {
                allBooksByAuthor();
                break;
            } else if (userChoice.equals("2")) {
                findBookByTitle();
                break;
            }
        }


    }

    public void allBooksByAuthor() {
        System.out.println("Please enter author name: ");
        String authorName = scanner.nextLine();
        List<Book> booksByAuthor = library.getAuthorBook(authorName);
        if (booksByAuthor.size() == 0) {
            System.out.println("Sorry, no books from " + authorName);
        }
        if (booksByAuthor.size() > 0) {
            System.out.println("Here are all books written by " + authorName);
            for (int i = 0; i < booksByAuthor.size(); i++) {

                System.out.println(booksByAuthor.get(i));
            }
        }
    }



    public void findBookByTitle() {
        System.out.println("Please enter book title: ");
        String bookTitle = scanner.nextLine();
        Book findBook = library.bookExists(bookTitle);

        if (findBook != null) {
            System.out.println("Author of " + "'" + bookTitle + "'" + " is " + findBook.getAuthor());
        } else if (findBook == null) {
            System.out.println("Sorry, book " + "'" + bookTitle + "'" + " not found.");
        }
    }
}
