package homework_28.marathon.pet_hotel.model;

public abstract class Pet {

    //fields
    protected final int id;
    protected String species;
    private String breed;
    protected String nickname;
    protected int age;
    protected double pricePerDay;
    protected int termOfStay;

    public Pet(int id, String species, String breed, String nickname, int age, double pricePerDay, int termOfStay) {
        this.id = id;
        this.species = species;
        this.breed = breed;
        this.nickname = nickname;
        this.age = age;
        this.pricePerDay = pricePerDay;
        this.termOfStay = termOfStay;
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getTermOfStay() {
        return termOfStay;
    }

    public void setTermOfStay(int termOfStay) {
        this.termOfStay = termOfStay;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("id=").append(id);
        sb.append(", species='").append(species).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", pricePerDay=").append(pricePerDay);
        sb.append(", termOfStay=").append(termOfStay);
        sb.append('}');
        return sb.toString();
    }
}
