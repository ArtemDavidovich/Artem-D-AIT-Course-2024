package classwork_14.array_methods;

//  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - поиск искомых элементов

public class ArrayMethods {

    //-----------------------------HOME-WORK-14----------------------------------------

    // selection sort
    // приравнивает сперва первый элемент к минимальному (а затем каждый последующий) и сравнивает его со всеми другими элементами, по шагам сортируя массив

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; //Assume the current position hold the minimum element
            for (int j = i + 1; j < array.length; j++) {  // Iterate through the unsorted portion to find the actual minimum
                if (array[j] < array[minIndex]){
                    minIndex = j; // Update min_idx if a smaller element is found
                }
            }
            if (minIndex != i){ // If a new minimum is found, swap it with the element at index i
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    //-----------------------------CLASS-WORK-14----------------------------------------

    // bubble sort
    //    - сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
    //- цикл должен идти слева направо
    //- упорядоченные элементы выключаются из цикла

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){ //comparing two elements of array, if left element > right => swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // array turn around
    // step 1 - method swap
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverseArray(int[] array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    //-----------------------------CLASS-WORK-13----------------------------------------

    // 0(n) - чем больше элементов массива, тем дольше работает метод
    //linear search, return index (if element absent return -1)
    public static int linearSearch(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return i; //go out from method
            }

        }
        return -1;
    }

    // 0(log(n))
    // binary search
    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if(array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]){ // < - для нарастающей сортировки, > - для убывающей сортировки
                rightIndex = midIndex - 1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1; // левую половину надо отбросить
            }
        }
        return -leftIndex - 1; // если не нашлось
    }

    //-----------------------------CLASS-WORK-12----------------------------------------

    //fill consequent array
    public static int[] fillConsequentArray(int n){
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    //fill random array
    // a - left border, b - right border, n - quantity
    public static int[] fillRandomArray(int a, int b, int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random()*(b - a + 1) + a);
        }
        return res;
    }

    //print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("________________________________");
    }

    //search in array
    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==n){
                return true;
            }
        }
        return false;
    }

    //-----------------------------HOME-TASK-2----------------------------------------

    //filling in the array with bank accounts
    public static double[] bankAccounts(int a, int b, int m){
        double[] res = new double[m];
        for (int i = 0; i < res.length; i++) {
            res[i] = (Math.random()*(b - a + 1) + a);
        }
        return res;
    }

    //printing array with basic bank accounts
    public static void printBasicAccounts(double[] array){
        System.out.println("The status of basic bank accounts:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    //calculating bonus for bank accounts
    public static double[] calculatePercent(double[] array){
       double[] percent = new double[array.length];
       double per1 = 0.02;
       double per2 = 0.05;
       double per3 = 0.1;
       for (int i = 0; i < array.length; i++) {
           if (array[i] <= 100) {
               array[i] = array[i] + array[i] * per1;
           } else if (array[i] > 100 && array[i] <= 500) {
               array[i] = array[i] + array[i] * per2;
           } else if (array[i] > 500 && array[i] <= 1000) {
               array[i] = array[i] + array[i] * per3;
           }

       }
       return array;
   }

   //printing array with banking accounts after percent accrual
   public static void printPercent(double[] array){
       System.out.println("The status of bank accounts after percent accrual:");
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
       }
       System.out.println();
   }

    //-----------------------------HOME-TASK-3----------------------------------------

    //summing the elements of array
    public static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //printing the sum of all array elements
    public static void printSum(int sum){
        System.out.println("The sum of all array elements is: " + sum + ".");
    }

    //calculating the average value of array elements
    public static double averageValue(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    //printing the average value of array elements
    public static void printAvgValue(double avg){
        System.out.printf("The average value of array elements is: %.2f.", avg);
    }



}//end of class
