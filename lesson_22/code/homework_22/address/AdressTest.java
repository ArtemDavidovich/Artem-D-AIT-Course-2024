package homework_22.address;

//Задача 3.(*) Создать класс Address, проверить:
//
//город с большой буквы
//индекс содержит 5 цифр
//предложите еще тесты

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    Address address;

    final String city = "Isny im All-Gau";
    final int index = 88316;
    final String street = "Maierhofener Str.";
    final String houseNumber = "25a";

    @BeforeEach
    void setUp() {
        address = new Address(city, index, street, houseNumber);
    }

    @Test
    void testValidCity() {
        assertEquals("Isny im All-Gau", address.getCity());
    }

    @Test
    void testValidIndex() {
        assertEquals(88316, address.getIndex());
    }

    @Test
    void testValidStreet() {
        assertEquals("Maierhofener Str.", address.getStreet());
    }

    @Test
    void testValidHouseNumber() {
        assertEquals("25a", address.getHouseNumber());
    }

    //1.city name starts from big letter
    //2.city name has more than one symbol
    //3.has only letters, spaces or dashes

    @Test
    @DisplayName("City name starts from Upper case")
    void testCityStartsUpperCase(){
        address.setCity("isny im All-Gau");
        assertEquals("Isny im All-Gau", address.getCity());
    }

    @Test
    @DisplayName("City name has more than one letter")
    void testCityMoreThanOneLetter(){
        address.setCity("I");
        assertEquals("Isny im All-Gau", address.getCity());
    }

    @Test
    @DisplayName("City name has only letters, spaces or dashes")
    void testCityOnlyLetterOrDash(){
        address.setCity("Isny im All-Gau1");
        assertEquals("Isny im All-Gau", address.getCity());
    }

    //1.index has 5 digits

    @Test
    @DisplayName("Index has 5 digits")
    void testIndexFiveDigits(){
        address.setIndex(883164);
        assertEquals(88316, address.getIndex());
    }

    //1.street name starts from big letter
    //2.street name has only letters, ' ', '.', '-' or apostrophe
    //3.street name has any variation of 'straße'

    @Test
    @DisplayName("Street name starts from big letter")
    void testStreetStartsUpperCase(){
        address.setStreet("maierhofener Str.");
        assertEquals("Maierhofener Str.", address.getStreet());
    }

    @Test
    @DisplayName("Street name has only letters, ' ', '.', '-' or apostrophe")
    void testStreetHasOnlyValidSymbols(){
        address.setStreet("Maierhofener1 Str.");
        assertEquals("Maierhofener Str.", address.getStreet());
    }

    @Test
    @DisplayName("Street name has any variation of 'straße'")
    void testStreetHasStrasse(){
        address.setStreet("Maierhofener St.");
        assertEquals("Maierhofener Str.", address.getStreet());
    }

    //1.house number has minimum 1 and maximum 3 digits
    //2.house number can't start from 0
    //3.house number can have only one letter and it should stay in the end

    @Test
    @DisplayName("House number has minimum 1 and maximum 3 digits")
    void testHouseNumberAllowedDigits(){
        address.setHouseNumber("a");
        assertEquals("25a", address.getHouseNumber());
        address.setHouseNumber("2534a");
        assertEquals("25a", address.getHouseNumber());
    }

    @Test
    @DisplayName("House number has minimum 1 and maximum 3 digits")
    void testHouseNumberZeroBeginning(){
        address.setHouseNumber("025a");
        assertEquals("25a", address.getHouseNumber());
    }

    @Test
    @DisplayName("House number has minimum 1 and maximum 3 digits")
    void testHouseNumberLetterEnding(){
        address.setHouseNumber("2a5");
        assertEquals("25a", address.getHouseNumber());
    }
}