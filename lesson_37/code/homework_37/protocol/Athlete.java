package homework_37.protocol;

//Задача 3.(*) Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах и десятых долях секунды.

import java.util.Objects;

public class Athlete implements Comparable<Athlete>{

    private String lastName;
    private String firstName;
    private int regNumber;
    private String club;
    private double result;

    public Athlete(String lastName, String firstName, int regNumber, String club, double result) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.regNumber = regNumber;
        this.club = club;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete athlete)) return false;
        return Double.compare(result, athlete.result) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(result);
    }

    @Override
    public String toString() {
        return String.format("Last name: %s, First name: %s, Reg. number: %d, Club: %s, Result: %.2f сек",
                lastName, firstName, regNumber, club, result);
    }

    @Override
    public int compareTo(Athlete a) {
        return Double.compare(this.getResult(), a.getResult());
    }
}//end of class
