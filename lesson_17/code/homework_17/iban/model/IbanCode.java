package homework_17.iban.model;

//Task 3.(*) The IBAN bank account number consists of Latin letters and numbers and has a strictly regulated length (in Germany - 22 characters). Create an IbanCode class in which to define the necessary fields and implement methods:
//
//lengthCode(String code), which returns the number of characters in the count
//controlCode(String code), which returns the sum of the ASCII codes of the first two characters
//isValid(String code), which checks the barcode for the correct number of characters

public class IbanCode {

    //fields
    private String iban;

    //constructor
    public IbanCode(String iban) {
        this.iban = iban;
    }

    //setters and getters
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    //display
    public void display(){
        System.out.println("IBAN: " + iban);
    }

    //methods
    //number of characters in IBAN
    public int lengthCode(){
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        return ibanLength.length;
    }

    //sum of first two characters according to ASCII
    public int controlCode(){
        //String[] ibanControl = iban.replaceAll("\\s+", "").split("");
        char firstChar = iban.charAt(0);
        char secondChar = iban.charAt(1);
        return firstChar + secondChar;
    }

    //checking the correct number of characters in IBAN (22)
    public boolean isValid(){
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        if(ibanLength.length == 22){
            return true;
        }
        return false;
    }
}
