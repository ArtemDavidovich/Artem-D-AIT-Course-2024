package homework_17.book.model;

public class Book {

    //fields
    private long isbn;
    private String title;
    private String author;
    private int yearOfPublication;
    private String genre;

    //constructors
    public Book(long isbn, String title, String author, int yearOfPublication, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public Book(String title, String author, int yearOfPublication, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //display
    public void display(){
        System.out.printf("ISBN: %d, title: %s, author: %s, year of publishing: %d, genre: %d", isbn, title, author, yearOfPublication, genre);
        System.out.println();
    }


}//end of class
