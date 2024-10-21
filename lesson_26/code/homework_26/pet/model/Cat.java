package homework_26.pet.model;

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

public class Cat extends Pet {

    //fields
    private String breed;
    private double height;
    private double weight;

    //constructor
    public Cat(int id, String species, int age, String nickname, String breed, double height, double weight) {
        super(id, species, age, nickname);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    //getters and setters
    public String getBreed() {
        return breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //display
    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public void voice(){
        System.out.println("Meow-meow-meow!");
    }
}
