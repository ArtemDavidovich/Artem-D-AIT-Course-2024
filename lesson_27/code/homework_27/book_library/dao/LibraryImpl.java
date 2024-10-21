package homework_27.book_library.dao;

import homework_27.book_library.model.Book;

public class LibraryImpl implements Library{

    //fields
    private Book[] books;
    private int size; //current number of books in the library

    //constructor
    public LibraryImpl(int capacity){
        this.books = new Book[capacity];
        this.size = 0;
    }

    //CRUD methods

//- не добавлять null
//- не добавлять дубликат
//- не добавлять больше, чем может вместить в себя библиотека.
    public Book[] fillLibrary(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(!(books[i] == null)){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            addBook(books[i]);
        }
        return books;
    }

    public boolean addBook(Book book){
        if(book == null){
            return false;
        }
        if(size == books.length){
            return false;
        }
        if(findBook(book.getIsbn()) != null){
            return false;
        }
        //positive case
        books[size] = book;//putting book in the end of array (first empty space)
        size++;
        return true;
    }

    public void printBook(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
    
    //find by author
    public Book[] findByAuthor(String author){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                count++;
            }
        }
        Book[] tempBooks = new Book[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                tempBooks[j] = books[i];
                j++;
            }
        }
        if(tempBooks[0] != null){
            return tempBooks;
        }
        return null;
    }

    @Override
    public Book[] findByTitle(String title) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().equals(title)){
                count++;
            }
        }
        Book[] tempBooks = new Book[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(books[i].getTitle().equals(title)){
                tempBooks[j] = books[i];
                j++;
            }
        }
        if(tempBooks[0] != null){
            return tempBooks;
        }
        return null;
    }

    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    public Book removeBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                //putting copy of last book instead of victim
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    public boolean updateBook(Book book){
        removeBook(book.getIsbn());
        addBook(book);
        for (int i = 0; i < size; i++) {
            if(books[i] == book){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

}
