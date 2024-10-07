package homework_18.book.model;

//Task 3().* Create or take from a previous homework a Book class with fields: title - title author year of publication - year unique number - ISBN
// In the Book class, implement a constructor, getters and setters for all fields and display method, which displays information about the book.
// Create a Dictionary class that extends the Book class. Provide a set of fields for it and override the display method.
// In the BookAppl class, in the main method, create several dictionaries and display information about them to the console.

public class Book {

    //fields
    private long isbn;
    private String title;
    private String author;
    private int year;

    //constructors
    public Book(long isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //setter and getters
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.year = year;
    }

    //display
    public void display(){
        System.out.printf("ISBN: %d, title: %s, author: %s, year of publishing: %d", isbn, title, author, year);
        System.out.println();
    }

}//end of class
