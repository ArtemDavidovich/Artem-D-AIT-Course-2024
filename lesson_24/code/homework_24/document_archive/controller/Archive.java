package homework_24.document_archive.controller;

import homework_24.document_archive.model.Document;

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
        if(document == null){
            return false;
        }
        if(size == documents.length){
            return false;
        }
        if(!(findDocument(document.getId()) == null)){
            return false;
        }
        //positive route
        documents[size] = document; //putting document in the end of array (first empty space)
        size++;
        return true;
    }

    public Document removeDocument(long id){
        for (int i = 0; i < size; i++) {
            if(documents[i].getId() == id){
                //putting copy of last document instead of victim
                Document victim = documents[i];
                documents[i] = documents[size - 1];
                documents[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    public Document findDocument(long id){
        for (int i = 0; i < size; i++) {
            if(id == documents[i].getId()){
                return documents[i];
            }
        }
        return null;
    }

    public void printDocument(){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }

    public int size(){
        return size;
    }


}
