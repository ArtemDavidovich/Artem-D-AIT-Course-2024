package homework_27.pet;

//Task 1. The Pet class has the following fields:
//
//id
//view
//age
//nickname

//Create child classes Cat and Dog from the Pet class with additional fields:
//breed
//height
//weight
//
//Create a voice method that emits "Meow!" for the Cat class and "Woof-woof!" for the Dog class.
//Create a HouseAppl that has a main method. Place 2 dogs and 3 cats in the house.
//Simulate life in this house during the day.

import homework_27.pet.model.Cat;
import homework_27.pet.model.Dog;
import homework_27.pet.model.Pet;

public class PetAppl {

    public static void main(String[] args) {

        //array with pets
        Pet[] pets = new Pet[5];
        pets[0] = new Dog(001, "dog",4,"Chuck","Pit bull",0.85,25.6);
        pets[1] = new Cat(002, "cat",2,"Fluffy","Bobtail",0.30,10.1);
        pets[2] = new Dog(003, "dog",6,"Dionis","Labrador",1.03,28.3);
        pets[3] = new Cat(004, "cat",8,"Mufasa","Sphinx",0.27,8.0);
        pets[4] = new Cat(005, "cat",1,"Thomas","Maine Coon",0.29,9.8);

        //printing daily life
        System.out.println("Daily life in the house:");
        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();
        }

    }//end of main

}//end of class
