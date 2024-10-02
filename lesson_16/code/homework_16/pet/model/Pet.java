package homework_16.pet.model;

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

public class Pet {

    //fields
    private int id;
    private String type;
    private int age;
    private String nickname;

    //constructor
    public Pet(int id, String type, int age, String nickname) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickname = nickname;
    }

    //setters
    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    //display
    public String display(){
        return String.format("ID: %d, type: %s, age: %d, nickname: %s", id, type, age, nickname);
    }

    //extra methods
    public void sleep(){
        System.out.println(nickname + " sleeps.");
    }

    public void eat(){
        System.out.println(nickname + " eats.");
    }

    public void talkDog(){
        System.out.println(nickname + " barks.");
    }

    public void talkCat(){
        System.out.println(nickname + " meows.");
    }

    public void talkRat(){
        System.out.println(nickname + " squeaks.");
    }

    public void talkCanary(){
        System.out.println(nickname + " sings.");
    }

    public void play(){
        System.out.println(nickname + " plays.");
    }

    public void drink(){
        System.out.println(nickname + " drinks.");
    }



}//end of class
