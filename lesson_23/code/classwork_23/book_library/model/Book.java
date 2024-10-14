package classwork_23.book_library.model;

// Создать класс Book с полями:
// long isbn, String title, String author, int yearOfPublishing.
// Проверить ISBN на корректное количество цифр = 13.

public class Book {

    public static final int ISBN_LENGTH = 13;

    //field
    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    //constructor
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
//        if(isIsbnValid) {
//            this.isbn = isbn;
//        }
        this.isbn = checkIsbn(isbn);
    }

    private long checkIsbn(long isbn){
        //check length of isbn
        if(countDigit(isbn)){
            return isbn;
        }
        return -1; // if isbn is invalid
    }

    private boolean countDigit(long isbn) {
//        if(String.valueOf(isbn).length() == 13){ - nice variant, but it uses a lot of resources
//            return true;
//        }
        //possible with cycle for, while we know the number of iterations
        int count = 0;
        long isbnTemp = isbn;
        while(isbnTemp / 10 != 0){
            count++;
            isbnTemp /= 10;
        }
        return count == ISBN_LENGTH;
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

    //TODO provide for protection concerning 13 digits
    public void setIsbn(long isbn) {
        if(countDigit(isbn)){
            this.isbn = isbn;
        } else{
            System.out.println("Error! ISBN '" + isbn + "' is invalid.");
        }

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
}//end of class
