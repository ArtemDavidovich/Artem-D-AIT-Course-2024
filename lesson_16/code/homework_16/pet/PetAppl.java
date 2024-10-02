package homework_16.pet;

import homework_16.pet.model.Pet;

public class PetAppl {

    //Task 1. Create a Pet class with private fields:
//
//id
//view
//age
//nickname

//Standard methods:
//
//constructor for all fields;
//getters and setters for all fields;
//toString method.
//Additional methods:
//
//sleep
//eat
//make sound
//play
//walk

//In the PetAppl class, create several pet instances. Display the day lived.

    public static void main(String[] args) {

        //creating pet instances
        Pet p1 = new Pet (1,"dog",8,"Snoopy");
        Pet p2 = new Pet (2,"cat",4,"Fluffy");
        Pet p3 = new Pet (3,"canary",2,"Lemon");

        //printing our pets
        System.out.println(p1.display());
        System.out.println(p2.display());
        System.out.println(p3.display());

        System.out.println();

        //creating array with pets
        Pet[] pets = new Pet[3];
        pets[0] = p1;
        pets[1] = p2;
        pets[2] = p3;

        //printing pets' day routine
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].getNickname() + "'s day routine:");
            pets[i].sleep();
            pets[i].eat();
            if (pets[i].getType().equals("dog")){
                pets[i].talkDog();
            } else if (pets[i].getType().equals("cat")) {
                pets[i].talkCat();
            } else if (pets[i].getType().equals("canary")) {
                pets[i].talkCanary();
            }
            pets[i].play();
            pets[i].drink();
            System.out.println();
        }


        




    }//end of main

}//end of class
