package classwork_25.book_library.controller;

import classwork_25.book_library.model.Book;

public class Library {

    //fields
    private Book[] books;
    private int size; //current number of books in the library

    //constructor
    public Library(int capacity){
        this.books = new Book[capacity];
        this.size = 0;
    }

    //CRUD methods

//- не добавлять null
//- не добавлять дубликат
//- не добавлять больше, чем может вместить в себя библиотека.
    public boolean addBook(Book book){
        if(book == null){
            return false;
        }
        if(size == books.length){
            return false;
        }
        if(!(findBook(book.getIsbn()) == null)){
            return false;
        }
        //positive case
        books[size] = book;//putting book in the end of array (first empty space)
        size++;
        return true;
    }

    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
    
    //find by author
    public Book findByAuthor(String author){
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                return books[i];
            }
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
        return true;
    }

    public int size(){
        return size;
    }

}
