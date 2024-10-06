package homework_17.iban;

//Task 3.(*) The IBAN bank account number consists of Latin letters and numbers and has a strictly regulated length (in Germany - 22 characters). Create an IbanCode class in which to define the necessary fields and implement methods:
//
//lengthCode(String code), which returns the number of characters in the count
//controlCode(String code), which returns the sum of the ASCII codes of the first two characters
//isValid(String code), which checks the barcode for the correct number of characters

import homework_17.iban.model.IbanCode;

public class IbanAppl {

    public static void main(String[] args) {

        IbanCode iban1 = new IbanCode("DE52 2345 3745 0967 2318 33");

        iban1.display();
        System.out.println(iban1.lengthCode());
        System.out.println(iban1.controlCode());
        System.out.println(iban1.isValid());

    }//end of main

}//end of class


