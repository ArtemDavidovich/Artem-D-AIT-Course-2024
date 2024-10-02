package classwork_14.array_methods;

//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Реализуйте метод, который получает на вход исходный массив и возвращает массив,
//содержащий только положительные числа из исходного массива.

public class Task_2_PositiveNumbers {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillRandomArray(-100,100,20);
        ArrayMethods.printArray(myArray);
        int positive = countPositiveNumbers(myArray);
        System.out.println("Positive numbers in array: " + positive);
        System.out.println();
        myArray = gatherPositiveNumbers(myArray, positive);
        System.out.println("New array with positive numbers is:");
        ArrayMethods.printArray(myArray);

    }//end of main

    //searching for (counting) positive numbers
    public static int countPositiveNumbers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }

    //making array with positive numbers
    public static int[] gatherPositiveNumbers(int[] array, int n){
        int[] res = new int[n];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] > 0){
                res[j] = array[i];
                j++;
            }
        }
        return res;
    }

}//end of class
