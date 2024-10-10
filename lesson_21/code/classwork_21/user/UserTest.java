package classwork_21.user;

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
    void setEmail() {
        String email = "peter@mail.de"; //wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn't change


    }

    @Test
    void setPassword() {
    }
}