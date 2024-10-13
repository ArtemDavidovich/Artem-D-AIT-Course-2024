package classwork_22.user;

//Задание 1. Прочитать и понять работу метода isEmailValid(String email). В клаccе UserTests продолжить писать тесты, для тестирования валидации емейла.

//- требования к password:
//  1) length >= 8
//  2) min one digit
//  3) min one symbol in upperCase
//  4) min one symbol in lowerCase
//  5) min one special symbol (!%@$&)
//  6) length < 20

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    final String email = "peter@mail.de"; //ideal email
    final String password = "123456Az!"; //ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password); //create new 'fresh' email
    }

    @Test
    void testValidEmail() {
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void testValidPassword() {
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    @DisplayName("checking if there is no AT")
    void testEmailNoAt() {
        String email = "petermail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    @DisplayName("checking if there are two ATs")
    void testEmailTwoAt() {
        String email = "peter@@mail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    @DisplayName("checking if there is no dot after AT")
    void testEmailNoDotAfterAt() {
        String email = "peter@mailde"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    @DisplayName("checking if the dot is too close to the end")
    void testEmailDotNotInTheEnd() {
        String email = "peter@maild.e"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    @DisplayName("checking if there is forbidden symbol in e-mail")
    void testEmailForbiddenSymbols() {
        String email = "peter/@mail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    void testValidPasswordLength() {
        user.setPassword("1234Az!"); //7 symbols
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456123456123456Az!"); //21 symbol
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void testValidPasswordMinOneDigit() {
        user.setPassword("Asdfghj!"); //7 symbols
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void testValidPasswordMinOneUpperCase() {
        user.setPassword("123456az!"); //7 symbols
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void testValidPasswordMinOneLowerCase() {
        user.setPassword("123456AZ!"); //7 symbols
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void testValidPasswordMinOneSpecialSymbol() {
        user.setPassword("123456AZq"); //7 symbols
        assertEquals("123456Az!", user.getPassword());
    }

}