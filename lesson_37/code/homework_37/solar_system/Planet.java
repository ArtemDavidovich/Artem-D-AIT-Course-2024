package homework_37.solar_system;

//Задача 2. Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.

import java.util.Objects;

public class Planet implements Comparable<Planet>{

    private String name;
    private double distanceFromSun;
    private double mass;
    private int numberOfMoons;

    public Planet(String name, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return Double.compare(distanceFromSun, planet.distanceFromSun) == 0 && Double.compare(mass, planet.mass) == 0 && numberOfMoons == planet.numberOfMoons && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceFromSun, mass, numberOfMoons);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceFromSun=").append(distanceFromSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfMoons=").append(numberOfMoons);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Planet p) {
        return Double.compare(this.getDistanceFromSun(), p.getDistanceFromSun());
    }

}//end of class
