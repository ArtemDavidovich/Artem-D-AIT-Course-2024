package homework_28.marathon.pet_hotel.dao;

import homework_28.marathon.pet_hotel.model.Pet;

public class PetHotelImpl implements PetHotel{

    private Pet[] pets;
    private int size;

    public PetHotelImpl(int capacity){
        this.pets = new Pet[capacity];
        this.size = 0;
    }

    @Override
    public Pet[] fillPetHotel(Pet[] pets) {
        int count = 0;
        for (int i = 0; i < pets.length; i++) {
            if(!(pets[i] == null)){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            addPet(pets[i]);
        }
        return pets;
    }

    @Override
    public boolean addPet(Pet pet) {
        if(pet == null) {
            return false;
        }
        if(findPet(pet.getId()) != null){
            return false;
        }
        if(size == pets.length){
            return false;
        }
        pets[size] = pet;
        size++;
        return true;
    }

    @Override
    public void printPetHotel() {
        for (int i = 0; i < size; i++) {
            System.out.println(pets[i]);
        }
    }

    @Override
    public Pet findPet(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pet[] findByBreed(String breed) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(pets[i].getBreed().equals(breed)){
                count++;
            }
        }
        Pet[] tempPets = new Pet[count];
        for (int i = 0, j = 0; j < tempPets.length; i++) {
            if(pets[i].getBreed().equals(breed)){
                tempPets[j] = pets[i];
                j++;
            }
        }
        return tempPets;
    }

    @Override
    public Pet removePet(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id){
                //putting copy of last element instead of victim
                Pet victim = pets[i];
                pets[i] = pets[size - 1];
                pets[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public boolean updatePet(Pet pet) {
        removePet(pet.getId());
        addPet(pet);
        for (int i = 0; i < size; i++) {
            if(pets[i] == pet){
                return true;
            }
        }
        return false;
    }

    @Override
    public double totalIncome() {
        double income = 0;
        for (int i = 0; i < size; i++) {
            income += pets[i].getPricePerDay() * pets[i].getTermOfStay();
        }
        return income;
    }

    @Override
    public int size() {
        return size;
    }

}
