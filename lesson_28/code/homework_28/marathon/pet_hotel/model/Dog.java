package homework_28.marathon.pet_hotel.model;

public class Dog extends Pet {

    private int toiletPerDay;
    private boolean isAggressiveWIthDogs;

    public Dog(int id, String species, String breed, String nickname, int age, double pricePerDay, int termOfStay, int toiletPerDay, boolean isAggressiveWIthDogs) {
        super(id, species, breed, nickname, age, pricePerDay, termOfStay);
        this.toiletPerDay = toiletPerDay;
        this.isAggressiveWIthDogs = isAggressiveWIthDogs;
    }

    public int getToiletPerDay() {
        return toiletPerDay;
    }

    public void setToiletPerDay(int toiletPerDay) {
        this.toiletPerDay = toiletPerDay;
    }

    public boolean isAggressiveWIthDogs() {
        return isAggressiveWIthDogs;
    }

    public void setAggressiveWIthDogs(boolean aggressiveWIthDogs) {
        isAggressiveWIthDogs = aggressiveWIthDogs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("id=").append(id);
        sb.append(", species='").append(species).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", pricePerDay=").append(pricePerDay);
        sb.append(", termOfStay=").append(termOfStay);
        sb.append(", toiletPerDay=").append(toiletPerDay);
        sb.append(", isAggressiveWIthDogs=").append(isAggressiveWIthDogs);
        sb.append('}');
        return sb.toString();
    }
}
