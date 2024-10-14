package homework_23.model;

//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
//Уникальный номер документа содержит 10 цифр.

public class Document {

    public static final int ID_LENGTH = 10;

    //field
    private long id;

    //constructor
    public Document(long id) {
        this.id = checkId(id);
    }

    private long checkId(long id){
        //checking counted length of id
        if(countDigit(id)){
            return id;
        }
        return -1;
    }

    private boolean countDigit(long id){
        //checking validity of id's length
        int count = 0;
        while(id / 2 != 0){
            count++;
            id /= 10;
        }
        return count == ID_LENGTH;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(countDigit(id)) {
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
}//end of class
