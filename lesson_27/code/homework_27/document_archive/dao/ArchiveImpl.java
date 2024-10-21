package homework_27.document_archive.dao;

import homework_27.document_archive.model.Document;

public class ArchiveImpl implements Archive{

    //fields
    private Document[] documents;
    private int size;

    //constructor
    public ArchiveImpl(int capacity){
        this.documents = new Document[capacity];
        this.size = 0;
    }

    public Document[] fillArchive(Document[] documents){
        int count = 0;
        for (int i = 0; i < documents.length; i++) {
            if(!(documents[i] == null)){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            addDocument(documents[i]);
        }
        return documents;
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

    @Override
    public Document[] findByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(documents[i].getAuthor().equals(author)){
                count++;
            }
        }
        Document[] tempDocuments = new Document[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(documents[i].getAuthor().equals(author)){
                tempDocuments[j] = documents[i];
                j++;
            }
        }
        if(tempDocuments[0] != null){
            return tempDocuments;
        }
        return null;
    }

    @Override
    public Document findByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getTitle().equals(title)){
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

    public boolean updateDocument(Document document){
        removeDocument(document.getId());
        addDocument(document);
        for (int i = 0; i < size; i++) {
            if(documents[i] == document){
                return true;
            }
        }
        return false;
    }

}//end of class
