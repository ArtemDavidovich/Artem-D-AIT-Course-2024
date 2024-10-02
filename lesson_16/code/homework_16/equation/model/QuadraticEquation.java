package homework_16.equation.model;

//Task 3.(*) Create a QuadraticEquation class in the equation.model package.
//In this class, define the fields private double a; private double b; private double c;.
//Create a constructor public QuadraticEquation(double a, double b, double c) to initialize fields. Create getters and setters.
//Create a public void display() method to print a quadratic equation to the console.
//Create methods public double delta() and public int quantityRoots() to calculate the discriminant and the number of solutions to the equation, respectively.

public class QuadraticEquation {

    //fields
    private double a;
    private double b;
    private double c;

    //constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters and setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //display
    public String display(){
        return String.format("%.1f * x^2 + %.1f * x + %.1f = 0", a, b, c);
    }

    //methods
    public double delta(){
        return b * b - 4 * a * c;
    }

    public int quantityRoots(){
        if(delta() > 0){
            return 2;
        } else if (delta() == 0){
            return 1;
        } else {
            return 0;
        }
    }

}//end of class
