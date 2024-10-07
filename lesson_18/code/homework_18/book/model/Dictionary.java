package homework_18.book.model;

//Task 3().* Create or take from a previous homework a Book class with fields: title - title author year of publication - year unique number - ISBN
// In the Book class, implement a constructor, getters and setters for all fields and display method, which displays information about the book.
// Create a Dictionary class that extends the Book class. Provide a set of fields for it and override the display method.
// In the BookAppl class, in the main method, create several dictionaries and display information about them to the console.

public class Dictionary extends Book {

    private String type;
    private int pages;
    private double price;

    public Dictionary(long isbn, String title, String author, int year, String type, int pages, double price) {
        super(isbn, title, author, year);
        this.type = type;
        this.pages = pages;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.printf("ISBN: %d, title: %s, author: %s, year of publishing: %d, type: %s, pages: %d, price: %.2f", getIsbn(), getTitle(), getAuthor(), getYear(), type, pages, price);
        System.out.println();
    }
}
