package homework_23.controller;

import classwork_23.book_library.model.Book;
import homework_23.model.Document;

public class Archive {

    //fields
    private Document[] documents;
    private int size;

    //constructor
    public Archive(int capacity){
        this.documents = new Document[capacity];
        this.size = 0;
    }

    public boolean addDocument(Document document){
        if(size < documents.length){
            documents[size++] = document;
            return true;
        }
        return false;
    }

    public Document findDocument(long id){
        Document foundDocument = null;
        return foundDocument;
    }

    public int size(){
        return size;
    }


}
