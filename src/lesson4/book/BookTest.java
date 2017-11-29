package lesson4.book;

import lesson4.book.Book;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("book name", -22);
        System.out.println(book.getName());
        System.out.println(book.getPageCount());

        Book thinkInJava = new Book("Think in Java", 1000, "Tom Try");
        System.out.println(thinkInJava.getPageCount());
        System.out.println(thinkInJava.getName());
        System.out.println(thinkInJava.getAuthor());
    }
}
