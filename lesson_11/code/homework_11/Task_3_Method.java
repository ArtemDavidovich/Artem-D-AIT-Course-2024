package homework_11;

//Task 3.
//Write a method that accepts an array of integers and returns the average arithmetic mean of all its elements.
//Test its work on the array ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

public class Task_3_Method {

    public static void main(String[] args) {

        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
        double avgAge = ageMethod(ageOfGroup); //calling method for calculations
        System.out.println("The average age of the group is " + avgAge + " years."); //final output

    }//end of main
    
    private static double ageMethod(int[] ageOfGroup){
        int sum = 0; //variable for sum of ages
        for (int i = 0; i < ageOfGroup.length; i++) {
            sum = sum + ageOfGroup[i];
        }
        return (double)sum / ageOfGroup.length;
    } //end of ageMethod

}//end of class
