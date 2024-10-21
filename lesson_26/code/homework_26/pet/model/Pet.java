package homework_26.pet.model;

public class Pet {

    //fields
    protected final int id;
    protected String species;
    protected int age;
    protected String nickname;

    //constructor
    public Pet(int id, String species, int age, String nickname) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.nickname = nickname;
    }

    //getters and setters


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

    }

}
