package homework_25.document_archive.model;

//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
//Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Document {

    public static final int ID_LENGTH = 10;

    //field
    private String title;
    private String author;
    private final long id;

    //constructor
    public Document(String title, String author, long id) {
        this.title = title;
        this.author = author;
        this.id = checkIdAndCountDigit(id);
    }

    private long checkIdAndCountDigit(long id){
        //checking validity of id length
        int count = 0;
        long tempId = id;
        while(tempId > 0){
            count++;
            tempId /= 10;
        }
        if (count == ID_LENGTH){
            return id;
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

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return id == document.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}//end of class
