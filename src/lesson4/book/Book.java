package lesson4.book;

public class Book {

    private int pageCount;
    private String author;
    private String iban;
    private String name;

    //constructor
    public Book(String name, int pageCount) {
        setName(name);
        setPageCount(pageCount);
    }

    //constructor
    public Book(String name, int pageCount, String author) {
        setPageCount(pageCount);
        setName(name);
        setAuthor(author);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        }

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
