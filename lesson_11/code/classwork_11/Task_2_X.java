package classwork_11;

//**Задача 2.**
//Задача о "вкраплениях".
//Имеется массив целых чисел, в котором несколько раз встречается число X.
//Выясните, сколько раз это число встречается в массиве? На каких местах массива оно стоит?

public class Task_2_X {

    public static void main(String[] args) {

        int[] array = {-145, 75, 34, -145, -123, 57, -145, 86, 77, 48, -145};

        int[] arrayOfIndex = new int[array.length];

        int x = -145;
        int count = 0;

        int j = 0; //index for arrayOfIndex

        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                count++;
                System.out.print(i + " ");
                arrayOfIndex[j] = i; //putting the index into 2nd array
                j++; //increasing the index of 2nd array
            }
        }

        System.out.println();

        System.out.println("X meets " + count + " times in the array.");

        for (int i = 0; i < j; i++) {
            System.out.print(arrayOfIndex[i] + " ");
        }

    }//end of main

}//end of class
