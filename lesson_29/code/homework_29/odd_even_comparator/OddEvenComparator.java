package homework_29.odd_even_comparator;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer integer1, Integer integer2) {
        if(integer1 % 2 == 0 && integer2 % 2 == 0){
            return integer1.compareTo(integer2);
        } else if (integer1 % 2 == 0 && integer2 % 2 == 1) {
            return -1;
        } else if (integer1 % 2 == 1 && integer2 % 2 == 0) {
            return 1;
        } else if (integer1 % 2 == 1 && integer2 % 2 == 1) {
            return integer1.compareTo(integer2);
        }
        return 0;
    }

}//end of class
