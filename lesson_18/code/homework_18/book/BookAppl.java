package homework_18.book;

//Task 3().* Create or take from a previous homework a Book class with fields: title - title author year of publication - year unique number - ISBN
// In the Book class, implement a constructor, getters and setters for all fields and display method, which displays information about the book.
// Create a Dictionary class that extends the Book class. Provide a set of fields for it and override the display method.
// In the BookAppl class, in the main method, create several dictionaries and display information about them to the console.

import homework_18.book.model.Book;
import homework_18.book.model.Dictionary;

public class BookAppl {

    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Dictionary(5432354354L,"English - German Dictionary", "Bob Marrley", 2020, "Bilingual", 235,25.99);
        books[1] = new Dictionary(3125401534L,"Cambridge Dictionary", "Elizabeth Walter", 2024, "General", 1901,39.50);
        books[2] = new Dictionary(199571120L,"Oxford Dictionary", "John Simpson", 2023, "Historical", 21730,392.35);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }

    }//end of main

}//end of class
