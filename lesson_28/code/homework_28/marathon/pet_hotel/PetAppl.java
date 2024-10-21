package homework_28.marathon.pet_hotel;

import homework_28.marathon.pet_hotel.dao.PetHotel;
import homework_28.marathon.pet_hotel.dao.PetHotelImpl;
import homework_28.marathon.pet_hotel.model.Cat;
import homework_28.marathon.pet_hotel.model.Dog;
import homework_28.marathon.pet_hotel.model.Pet;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetAppl {

    public static void main(String[] args) {

        Pet[] pets = new Pet[4];
        pets[0] = new Dog(1, "dog", "Pit bull","Chuck",5,60,7, 3, true);
        pets[1] = new Cat(2, "cat","Bobtail","Fluffy",7,40,14, false);
        pets[2] = new Dog(3, "dog","Labrador","Dionis",3,50,10, 4, false);
        pets[3] = new Cat(4, "cat","Bobtail","Mufasa",9,45,5, true);

        PetHotel petHotel = new PetHotelImpl(5);

        petHotel.fillPetHotel(pets);
        petHotel.printPetHotel();
        System.out.println(petHotel.size());
        System.out.println("===========================");

        Pet newPet = new Cat(5, "cat","Bobtail","Puffy",5,35,3, true);
        assertTrue(petHotel.addPet(newPet));
        petHotel.addPet(newPet);
        petHotel.printPetHotel();
        System.out.println(petHotel.size());
        System.out.println("===========================");

        System.out.println(petHotel.findPet(1));
        System.out.println("===========================");

        System.out.println(Arrays.toString(petHotel.findByBreed("Bobtail")));
        System.out.println("===========================");

        petHotel.removePet(3);
        petHotel.printPetHotel();
        System.out.println(petHotel.size());
        System.out.println("===========================");

        Pet oneMorePet = new Cat(5, "cat","Bobtail","Puffy",6,37,8, true);
        petHotel.updatePet(oneMorePet);
        petHotel.printPetHotel();
        System.out.println(petHotel.size());
        System.out.println("===========================");

        System.out.println("Total income is: " + petHotel.totalIncome());
        System.out.println("===========================");

    }//end of main

}//end of class
