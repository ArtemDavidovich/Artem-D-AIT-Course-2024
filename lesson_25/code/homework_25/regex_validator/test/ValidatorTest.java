package homework_25.regex_validator.test;

import homework_25.regex_validator.model.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    Validator validator;

    @Test
    void checkCreditCardNumber() {
        assertTrue(Validator.checkCreditCardNumber("12345678")); // 8 digits
        assertTrue(Validator.checkCreditCardNumber("1234567887654321")); // 16 digits
        assertTrue(Validator.checkCreditCardNumber("1234567890"));// 10 digit
        assertFalse(Validator.checkCreditCardNumber("1234567")); // 7 digit
        assertFalse(Validator.checkCreditCardNumber("12345678876543210")); // 17 digits
        assertFalse(Validator.checkCreditCardNumber("12345678A")); // symbol
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("26.10.2023"));//day - 20ies, month - 10s
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));//day - 0s
        assertTrue(Validator.checkDateFormatEU("31.02.2023"));//day - 30ies, month - 0s
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));//day > 32
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));//month > 12
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));// / instead of .
        assertFalse(Validator.checkDateFormatEU("5.10.2023"));//day - one digit
    }

    @Test
    void checkDateFormatUS() {
        assertTrue(Validator.checkDateFormatUS("2023.10.26"));//day - 20ies, month - 10s
        assertTrue(Validator.checkDateFormatUS("2023.10.05"));//day - 0s
        assertTrue(Validator.checkDateFormatUS("2023.02.31"));//day - 30ies, month - 0s
        assertFalse(Validator.checkDateFormatUS("2023.02.32"));//day > 32
        assertFalse(Validator.checkDateFormatUS("2023.13.15"));//month > 12
        assertFalse(Validator.checkDateFormatUS("2023/02/26"));// / instead of .
        assertFalse(Validator.checkDateFormatUS("2023.10.5"));//day - one digit
    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(01)1234-5678"));//correct number
        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));//no plus
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));//3 digits before (
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));//1 digit before (
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));//one digit inside ()
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));//3 digits before -
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));//5 digits after -
    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));//0 (minimum value)
        assertTrue(Validator.checkLessEquals255("5"));//1 digit > 0
        assertTrue(Validator.checkLessEquals255("58"));//2 digits
        assertTrue(Validator.checkLessEquals255("199"));//3 digits
        assertTrue(Validator.checkLessEquals255("255"));//255 (maximum value)
        assertFalse(Validator.checkLessEquals255("256"));//number > 255
        assertFalse(Validator.checkLessEquals255("-5"));//number < 0
        assertFalse(Validator.checkLessEquals255("b5"));//symbol
    }
}