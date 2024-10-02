package homework_16.equation;

//Task 3.(*) Create a QuadraticEquation class in the equation.model package.
//In this class, define the fields private double a; private double b; private double c;.
//Create a constructor public QuadraticEquation(double a, double b, double c) to initialize fields. Create getters and setters.
//Create a public void display() method to print a quadratic equation to the console.
//Create methods public double delta() and public int quantityRoots() to calculate the discriminant and the number of solutions to the equation, respectively.

import homework_16.equation.model.QuadraticEquation;

public class EquationAppl {

    public static void main(String[] args) {

        //setting the examples of quadratic equations
        QuadraticEquation qe1 = new QuadraticEquation(5, 7,3);
        QuadraticEquation qe2 = new QuadraticEquation(2, 4,2);
        QuadraticEquation qe3 = new QuadraticEquation(1, 6,4);
        QuadraticEquation qe4 = new QuadraticEquation(9, 3,6);

        //setting the array
        QuadraticEquation[] equations = new QuadraticEquation[4];
        equations[0] = qe1;
        equations[1] = qe2;
        equations[2] = qe3;
        equations[3] = qe4;

        //printing the results
        for (int i = 0; i < equations.length; i++) {
            System.out.println("The equation: " + equations[i].display());
            System.out.println("Discriminant: " + equations[i].delta());
            System.out.println("Number of roots: " + equations[i].quantityRoots());
            System.out.println();
        }

    }//end of main

}//end of class
