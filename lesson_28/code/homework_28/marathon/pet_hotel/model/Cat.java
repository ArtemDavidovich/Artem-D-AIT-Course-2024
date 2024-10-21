package homework_28.marathon.pet_hotel.model;

public class Cat extends Pet {

    private boolean lovesStroking;

    public Cat(int id, String species, String breed, String nickname, int age, double pricePerDay, int termOfStay, boolean lovesStroking) {
        super(id, species, breed, nickname, age, pricePerDay, termOfStay);
        this.lovesStroking = lovesStroking;
    }

    public boolean isLovesStroking() {
        return lovesStroking;
    }

    public void setLovesStroking(boolean lovesStroking) {
        this.lovesStroking = lovesStroking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("id=").append(id);
        sb.append(", species='").append(species).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", pricePerDay=").append(pricePerDay);
        sb.append(", termOfStay=").append(termOfStay);
        sb.append(", lovesStroking=").append(lovesStroking);
        sb.append('}');
        return sb.toString();
    }
}
