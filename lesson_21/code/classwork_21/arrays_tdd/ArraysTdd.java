package classwork_21.arrays_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArraysTdd {

    private int[] array;

    public ArraysTdd(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArraysTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArraysTdd arraysTdd)) return false;
        return Objects.deepEquals(array, arraysTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //count integers in array
    public int countIntegers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }



}
