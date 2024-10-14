package classwork_23.book_library.controller;

import classwork_23.book_library.model.Book;

public class Library {

    //fields
    private Book[] books;
    private int size; //current number of books in the library

    //constructor
    public Library(int capacity){
        this.books = new Book[capacity];
        this.size = 0;
    }

//    public Book[] getBooks() {
//        return books;
//    }
//
//    public void setBooks(Book[] books) {
//        this.books = books;
//    }

    //CRUD methods

    public boolean addBook(Book book){
        if(size < books.length) {
            books[size++] = book;
            return true;
        }
        return false;
    }



    //void printBooks


    public Book findBook(long isbn){
        Book foundBook = null;
        return foundBook;
    }


    //Book removeBook(long isbn)
    //size--;


    //boolean updateBook()


    int size(){
        return size;
    }

}
