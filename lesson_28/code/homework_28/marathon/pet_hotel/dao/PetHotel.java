package homework_28.marathon.pet_hotel.dao;

import homework_28.marathon.pet_hotel.model.Pet;

public interface PetHotel {

    Pet[] fillPetHotel(Pet[] pets);

    boolean addPet(Pet pet);

    void printPetHotel();

    Pet findPet(int id);

    Pet[] findByBreed(String breed);

    Pet removePet(int id);

    boolean updatePet(Pet pet);

    double totalIncome();

    int size();

}
