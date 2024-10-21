package homework_28.marathon.book_library;

import homework_28.marathon.book_library.dao.LibraryImpl;
import homework_28.marathon.book_library.model.Book;

import java.util.Arrays;

public class LibraryAppl {

    public static void main(String[] args) {

        Book[] books = new Book[6];

        books[0] = new Book("1984","Orwell",1_111_111_111_110L, 2010);
        books[1] = new Book("T1","A1",1_111_111_111_111L, 2011);
        books[2] = new Book("T1","A2",1_111_111_111_112L, 2009);
        books[3] = new Book("T3","A2",1_111_111_111_113L, 2012);

        LibraryImpl library = new LibraryImpl(6);

        library.fillLibrary(books);

        library.printBook();
        System.out.println(library.size());
        System.out.println("==============================");
        
        Book newBook = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1_111_111_111_114L, 2000);
        library.addBook(newBook);
        library.printBook();
        System.out.println(library.size());
        System.out.println("==============================");

        library.removeBook(1_111_111_111_111L);
        library.printBook();
        System.out.println(library.size());
        System.out.println("==============================");

        System.out.println(library.findBook(1_111_111_111_114L));
        System.out.println("==============================");

        System.out.println(Arrays.toString(library.findByAuthor("Orwell")));
        System.out.println("==============================");

        System.out.println(Arrays.toString(library.findByTitle("T1")));
        System.out.println("==============================");

        Book oneMoreBook = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1_111_111_111_114L, 2024);
        library.updateBook(oneMoreBook);
        System.out.println(library.size());
        library.printBook();
        System.out.println("==============================");

    }//end of main

}//end of class
