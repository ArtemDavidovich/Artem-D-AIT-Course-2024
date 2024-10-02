package homework_05;

//Task 2. Define the three sides of the triangle in the program.
// Check the validity of the triangle inequality - any of the sides must be smaller the sum of the other two.
// Report the result - whether a triangle with the given sides exists or not.

public class Task_2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 7;

        //simple variant without method
        if(a<b+c && b<a+c && c<a+b){
            System.out.println("The triangle with the sides " + a + ", " + b + " and " + c + " corresponds to the triangle inequality.");
        } else{
            System.out.println("The triangle with the sides " + a + ", " + b + " and " + c + " does not correspond to the triangle inequality.");
        }

        //1st variant with method
        boolean res = triangleInequalityMethod1(a, b, c); //calling the method for checking the triangle inequality

        System.out.println("The triangle with the sides " + a + ", " + b + " and " + c + " corresponds to the triangle inequality: " + res);

        //2nd variant with method
        res = triangleInequalityMethod2(a, b, c);
        System.out.println("The triangle with the sides " + a + ", " + b + " and " + c + " corresponds to the triangle inequality: " + res);

    } //end of main

    public static boolean triangleInequalityMethod1(int a, int b, int c){

        if(a<b+c && b<a+c && c<a+b){
            return true;
        } else {
            return false;
        }

    } //end of triangleInequalityMethod1

    public static boolean triangleInequalityMethod2(int a, int b, int c){

        return a<b+c && b<a+c && c<a+b;

    } //end of triangleInequalityMethod2

} //end of class
