package code;

public class Methods_formulas_and_other {


    public static void main(String[] args) {

        double d = doubleMethod(0.0000);
        int i = 0;
        String string = "A";

        //printing

        System.out.print(string + "ha"); //prints the content of ()
        System.out.println(); //transfers to a new line after the end
        System.out.println(string + "ha ha"); //prints the content of () and transfers to a new line after the end
        System.out.printf("%.2f %d %s", d, i, string); //prints the content with formation, %.2f - number with characters after coma, %d - digit, %s - string

       

    }//end of main

    //methods

    public static double doubleMethod(double d) { //methods takes some data inside, does something with it and returns the result (except "void")
        if (d == 0 && d != 2) { // if() - condition for {} - action; && - conditional operator AND; ! - NOT
            d = 0.00;
        } else if (d == 1 || d == 3) { //else if() - alternative condition for {} - action; || - conditional operator OR
            d = 1.00;
        } else { // else{} - action that happens when "if" and "else if" the conditions are not satisfied
            d = 2.00;
        }
        return d; //we return the result
    }

}//end of class
