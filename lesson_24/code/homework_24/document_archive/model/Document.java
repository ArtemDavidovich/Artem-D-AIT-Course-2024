package homework_24.document_archive.model;

//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
//Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Document {

    public static final int ID_LENGTH = 10;

    //field
    private long id;

    //constructor
    public Document(long id) {
        this.id = checkIdAndCountDigit(id);
    }

    private long checkIdAndCountDigit(long id){
        //checking validity of id's length
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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(checkIdAndCountDigit(id) > 0) {
            this.id = id;
        } else{
            System.out.println("Error! ISBN '" + id + "' is invalid.");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
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
