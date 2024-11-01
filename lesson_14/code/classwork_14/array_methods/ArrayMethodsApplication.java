package classwork_14.array_methods;

public class ArrayMethodsApplication {

    public static void main(String[] args) {

        //-----------------------------CLASS-WORK-14----------------------------------------

//        //create array with random numbers
//        int[] myArray = ArrayMethods.fillRandomArray(0, 100, 10);
//
//        //print array
//        ArrayMethods.printArray(myArray);
//
//        //sort array
//        ArrayMethods.bubbleSort(myArray);
//
//        //print array
//        ArrayMethods.printArray(myArray);

        int[] newArray = ArrayMethods.fillRandomArray(1,20,6);
        ArrayMethods.printArray(newArray);
        ArrayMethods.reverseArray(newArray);
        ArrayMethods.printArray(newArray);

//        //-----------------------------CLASS-WORK-13----------------------------------------
//
//        int [] myArray = {10, 20, 30, 40, 50};
//        System.out.println(ArrayMethods.linearSearch(myArray, 40));
//        System.out.println(ArrayMethods.linearSearch(myArray, 19));
//
//        System.out.println("----------------------------------");
//
//        int index = ArrayMethods.binarySearch(myArray, 30);
//        System.out.println(index);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input positive integer: ");
//        int n = scanner.nextInt();
//
//        int[] myArray = ArrayMethods.fillArray(10, 20, n);
//
//        ArrayMethods.printArray(myArray);
//
//        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isInArray);
//
//        //-----------------------------HOME-TASK-12-2----------------------------------------
//
//        System.out.println("________________________________");
//
//        double[] arrayBasicArray = ArrayMethods.bankAccounts(-10, 1000, 10);
//
//        ArrayMethods.printBasicAccounts(arrayBasicArray);
//
//        double[] arrayCalculatedPercent = ArrayMethods.calculatePercent(arrayBasicArray);
//
//        ArrayMethods.printPercent(arrayCalculatedPercent);
//
//        //-----------------------------HOME-TASK-12-3----------------------------------------
//
//        System.out.println("________________________________");
//
//        int sumOfElements = ArrayMethods.sumArray(myArray);
//
//        ArrayMethods.printSum(sumOfElements);
//
//        double avgValueOfArray = ArrayMethods.averageValue(arrayBasicArray);
//
//        ArrayMethods.printAvgValue(avgValueOfArray);

    }//end of main

}//end of class
