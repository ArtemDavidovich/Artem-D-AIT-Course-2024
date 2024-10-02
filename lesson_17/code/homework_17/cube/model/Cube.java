package homework_17.cube.model;

public class Cube {

    //fields
    private double a;

    //constructor
    public Cube(double a) {
        this.a = a;
    }

    //setters and getters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    //display
    public void display(){
        System.out.println("Cube with the side " + a + " has: ");
    }

    //methods
    public double p(){
        return a * 12;
    }

    public double s(){
        return a * a* 6;
    }

    public double v(){
        return a * a * a;
    }

}//end of class
