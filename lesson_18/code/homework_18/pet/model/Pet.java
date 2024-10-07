package homework_18.pet.model;

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

public class Pet {

    //fields
    private long id;
    private String species;
    private int age;
    private String nickname;

    //constructor
    public Pet(long id, String species, int age, String nickname) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.nickname = nickname;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    //display
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    //voice method
    public void voice(){
        if(getSpecies().equals("cat")){
            System.out.println("Meow-meow-meow!");
        } else if (getSpecies().equals("dog")) {
            System.out.println("Woof-woof!");
        }
    }

}
