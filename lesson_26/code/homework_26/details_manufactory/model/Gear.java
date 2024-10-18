package homework_26.details_manufactory.model;

public class Gear extends Detail{

    //fields
    private double radius;
    private int tooth;

    //constructor
    public Gear(long barCode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gear{");
        sb.append("radius=").append(radius);
        sb.append(", tooth=").append(tooth);
        sb.append(", barCode=").append(barCode);
        sb.append(", size=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

}//end of class
