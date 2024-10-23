package homework_30.towers;

import java.util.Objects;

public class Tower implements Comparable<Tower>{

    private String name;
    private int yearOfConstruction;
    private double height;

    public Tower(String name, int yearOfConstruction, double height) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tower towers)) return false;
        return yearOfConstruction == towers.yearOfConstruction && Double.compare(height, towers.height) == 0 && Objects.equals(name, towers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfConstruction, height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Towers{");
        sb.append("name='").append(name).append('\'');
        sb.append(", yearOfConstruction=").append(yearOfConstruction);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Tower t) {
        return Double.compare(this.getHeight(), t.getHeight());
    }
}//end of class
