package homework_28.marathon.pet_hotel.test;

import homework_28.marathon.pet_hotel.dao.PetHotel;
import homework_28.marathon.pet_hotel.dao.PetHotelImpl;
import homework_28.marathon.pet_hotel.model.Cat;
import homework_28.marathon.pet_hotel.model.Dog;
import homework_28.marathon.pet_hotel.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetHotelImplTest {

    PetHotel petHotel;
    Pet[] pets;

    @BeforeEach
    void setUp() {
        petHotel = new PetHotelImpl(5);
        pets = new Pet[4];
        pets[0] = new Dog(1, "dog", "Pit bull","Chuck",5,60,7, 3, true);
        pets[1] = new Cat(2, "cat","Bobtail","Fluffy",7,40,14, false);
        pets[2] = new Dog(3, "dog","Labrador","Dionis",3,50,10, 4, false);
        pets[3] = new Cat(4, "cat","Bobtail","Mufasa",9,45,5, true);

        petHotel.fillPetHotel(pets);
    }

    @Test
    @DisplayName("Filling Pets Hotel")
    void testFillPetHotel() {
        assertEquals(pets, petHotel.fillPetHotel(pets));
    }

    @Test
    @DisplayName("Adding pet to Hotel")
    void testAddPet() {
        //no null adding
        assertFalse(petHotel.addPet(null));
        //no duplicate adding
        assertFalse(petHotel.addPet(pets[0]));
        //adding new item
        Pet newPet = new Cat(5, "cat","Bobtail","Puffy",5,35,3, true);
        assertTrue(petHotel.addPet(newPet));
        assertEquals(5, petHotel.size());
        //adding one more item over capacity
        Pet oneMorePet = new Cat(6, "cat","Bobtail","Puffy",5,35,3, true);
        assertFalse(petHotel.addPet(oneMorePet));
    }

    @Test
    @DisplayName("Printing Pets Hotel")
    void testPrintPetHotel() {
        petHotel.printPetHotel();
        System.out.println("=============================");
    }

    @Test
    @DisplayName("Searching for exact pet by id")
    void testFindPet() {
        assertEquals(pets[0], petHotel.findPet(1));
        assertNull(petHotel.findPet(9));
    }

    @Test
    @DisplayName("Searching for pets by exact breed")
    void testFindByBreed() {
        Pet[] newPets = {pets[1], pets[3]};
        assertArrayEquals(newPets, petHotel.findByBreed("Bobtail"));
    }

    @Test
    @DisplayName("Deleting pet from Hotel")
    void testRemovePet() {
        //remove existing element
        assertEquals(pets[0], petHotel.removePet(1));
        assertEquals(3, petHotel.size());
        //remove absent element
        assertNull(petHotel.removePet(9));
    }

    @Test
    @DisplayName("Updating info on exact pet")
    void testUpdatePet() {
        Pet newPet = new Cat(5, "cat","Bobtail","Puffy",5,35,3, true);
        Pet oneMorePet = new Cat(5, "cat","Bobtail","Puffy",6,37,8, true);
        petHotel.addPet(newPet);
        petHotel.printPetHotel();
        System.out.println("==============================");
        assertTrue(petHotel.updatePet(oneMorePet));
        petHotel.printPetHotel();
    }

    @Test
    @DisplayName("Calculating total income")
    void testTotalIncome() {
        double totalIncome = 1705;
        assertEquals(totalIncome, petHotel.totalIncome());
    }

    @Test
    @DisplayName("Checking actual size")
    void testSize() {
        assertEquals(4, petHotel.size());
    }
}