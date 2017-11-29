package lesson7.homework.library;


import java.util.ArrayList;
import java.util.List;

public class Library {


    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("John", "Book"));
        books.add(new Book("John", "Book 2"));
        books.add(new Book("John", "Book 3"));
        books.add(new Book("John", "Book 4"));
        books.add(new Book("Ted", "Book 111"));
        books.add(new Book("Ted", "Book 222"));
        books.add(new Book("Doe", "Book 11"));
    }

    public List<Book> getAuthorBook(String author) {
        List <Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }

        }

        return foundBooks;

    }


    public Book bookExists(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {

                return book;
            }
        }

        return null;
    }




}
