package homework_05;

//Task 4.(*) Develop an application for solving a quadratic equation using the coefficients of the quadratic trinomial a, b and c.
// Calculate the discriminant using the formula: d = bb - 4ac If d > 0, then x1 = (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a).
// If d = 0, then x = -b / (2a). If d < 0, then report that there are no roots.

public class Task_4 {

    public static void main(String[] args) {
        //coefficients of the quadratic trinomial
        int a = 3;
        int b = 6;
        int c = 3;

        int d = b * b - 4 * a * c; //discriminant

        //potential roots of the quadratic equation
        double x = 0;
        double x1 = 0;
        double x2 = 0;


        if(d > 0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            x = -b / (2*a);
            System.out.println("x = " + x);
        } else {
            System.out.println("There are no roots.");
        }

    }//end of main

}//end of class
