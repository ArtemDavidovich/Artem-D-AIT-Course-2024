package homework_28.marathon.book_library.model;

import java.util.Objects;

public class Book {

    public static final int ISBN_LENGTH = 13;

    //field
    protected String title;
    protected String author;
    protected final long isbn;
    protected int yearOfPublishing;

    //constructor
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
//        if(isIsbnValid) {
//            this.isbn = isbn;
//        }
        this.isbn = checkAndCountDigit(isbn);
    }

    private long checkAndCountDigit(long isbn) {
//        if(String.valueOf(isbn).length() == 13){ - nice variant, but it uses a lot of resources
//            return true;
//        }
        //possible with cycle for, while we know the number of iterations
        int count = 0;
        long isbnTemp = isbn;
        while(isbnTemp > 0){
            count++;
            isbnTemp /= 10;
        }
        if(count == ISBN_LENGTH){
            return isbn;
        }
        return -1;
    }

    //getters and setters
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

    public long getIsbn() {
        return isbn;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}//end of class
