package homework_27.book_library.test;

import homework_27.book_library.dao.LibraryImpl;
import homework_27.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    LibraryImpl library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        books = new Book[5];

        books[0] = new Book("1984","Orwell",1_111_111_111_110L, 2010);
        books[1] = new Book("T1","A1",1_111_111_111_111L, 2011);
        books[2] = new Book("T1","A2",1_111_111_111_112L, 2009);
        books[3] = new Book("T3","A2",1_111_111_111_113L, 2012);

        library.fillLibrary(books);
    }

//- не добавлять null
//- не добавлять дубликат
//- не добавлять больше, чем может вместить в себя библиотека.
    @Test
    @DisplayName("Filling the archive with documents")
    void testFillArchive(){
    assertEquals(books, library.fillLibrary(books));
}

    @Test
    @DisplayName("Adding book to Library")
    void testAddBook(){
        //no null adding
        assertFalse(library.addBook(null));
        //no duplicate adding
        assertFalse(library.addBook(books[0]));
        //adding new book
        Book newBook = new Book("T4","A4",1_111_111_111_114L,2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5,library.size());
        //adding one more book over capacity
        Book oneMoreBook = new Book("T5","A5",1_111_111_111_115L,2024);
        assertFalse(library.addBook(oneMoreBook));
    }

    @Test
    @DisplayName("Searching for exact book by its isbn")
    void testFindBook(){
        assertEquals(books[0], library.findBook(1_111_111_111_110L));
        assertNull(library.findBook(1_111_111_111_119L)); //find absent book
    }

    @Test
    @DisplayName("Searching for all books with the same author")
    void testFindBookByAuthor(){
        Book[] tempBooks = new Book[2];
        tempBooks[0] = new Book("T1","A2",1_111_111_111_112L, 2009);
        tempBooks[1] = new Book("T3","A2",1_111_111_111_113L, 2012);
        assertArrayEquals(tempBooks, library.findByAuthor("A2"));
    }

    @Test
    @DisplayName("Searching for all books with the same title")
    void testFindBookByTitle(){
        Book[] tempBooks = new Book[2];
        tempBooks[0] = new Book("T1","A1",1_111_111_111_111L, 2011);
        tempBooks[1] = new Book("T1","A2",1_111_111_111_112L, 2009);
        assertArrayEquals(tempBooks, library.findByTitle("T1"));
    }

    @Test
    @DisplayName("Deleting book from Library")
    void testRemoveBook(){
        //remove existing book
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals(3, library.size());
        //remove absent book
        assertNull(library.removeBook(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Checking actual size of Library")
    void testSize(){
        assertEquals(4,library.size());
    }

    @Test
    @DisplayName("Checking printing method")
    void testPrintBook(){
        System.out.println("=============================");
        library.printBook();
    }

    @Test
    void testUpdateBook(){
        Book newBook = new Book("Best Book in the World","Super Puper",1_111_111_111_114L, 2010);
        Book oneMoreBook = new Book("Best Book in the World","Super Puper",1_111_111_111_114L, 2024);
        library.addBook(newBook);
        library.printBook();
        System.out.println("==============================");
        assertTrue(library.updateBook(oneMoreBook));
        library.printBook();
    }

}//end of class