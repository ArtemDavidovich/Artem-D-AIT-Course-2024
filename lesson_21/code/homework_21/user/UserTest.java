package homework_21.user;

//Задание 1. Прочитать и понять работу метода isEmailValid(String email). В клаccе UserTests продолжить писать тесты, для тестирования валидации емейла.

import org.junit.jupiter.api.BeforeEach;
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
    void testEmailNoAt() { //checking if there is no AT
        String email = "petermail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    void testEmailTwoAt() { //checking if there are two ATs
        String email = "peter@@mail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test //
    void testEmailNoDotAfterAt() { //checking if there is no dot after AT
        String email = "peter@mailde"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    void testEmailDotNotInTheEnd() { //checking if the dot is too close to the end
        String email = "peter@maild.e"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }

    @Test
    void testEmailForbiddenSymbols() { //checking if there is forbidden symbol in e-mail
        String email = "peter/@mail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change
    }



    @Test
    void setPassword() {
    }
}