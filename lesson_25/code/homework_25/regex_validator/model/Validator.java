package homework_25.regex_validator.model;

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
        return str.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})");
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){
        return str.matches("(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12]\\d|3[01])");
    }

    // PhoneNumber (Format: +99(99)9999-9999)
    public static boolean checkPhoneNumber(String str){
        return str.matches("\\+(\\d[1-9])\\((\\d[1-9])\\)(\\d{4})-(\\d{4})");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        return str.matches("\\d|([1-9]\\d)|(1\\d\\d)|(2[0-5][0-5])");
    }

}
