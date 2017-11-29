package lesson7.homework.library;


public class LibraryMain {

    public static void main(String[] args) {

        Library library = new Library();
        LibraryForm libraryForm = new LibraryForm(library);

        libraryForm.start();

    }
}
