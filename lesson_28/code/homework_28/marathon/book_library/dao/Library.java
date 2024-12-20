package homework_28.marathon.book_library.dao;

import homework_28.marathon.book_library.model.Book;

public interface Library {

    Book[] fillLibrary(Book[] books);

    boolean addBook(Book book);

    void printBook();

    Book findBook(long isbn);

    Book[] findByAuthor(String author);

    Book[] findByTitle(String title);

    Book removeBook(long isbn);

    boolean updateBook(Book book);

    int size();

}
