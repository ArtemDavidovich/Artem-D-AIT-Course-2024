package classwork_38.linked_list_test;

import java.time.LocalDateTime;
import java.util.*;

public class LinkedListAppl {

    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public LinkedListAppl() {
    }

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        long t1 = System.currentTimeMillis();

        //определяем имплементацию

        fillList(list); //creation
        printList(list); //reading


        System.out.println(list.size());
        System.out.println(list.get(0)); //first element of list
        System.out.println(list.get(list.size() - 1)); //last element of list

        //
        System.out.println(list.indexOf(10));
        list.set(0, 50);
        list.set(N_NUMBERS - 1, 100);
        printList(list);

        list.set((N_NUMBERS - 1 )/ 2, 200);
        printList(list);

        //INCORRECT METHOD, JUST FOR EXAMPLE
        //delete 15, if it's in the list
//        for (Integer integer : list) {
//            if(integer == 15){
//                list.remove(integer);
//            }
//        }
//        printList(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            if(num.equals(15)){
                iterator.remove(); //удаление в позиции курсора итератора
            }
        }
        printList(list);

        list.remove(list.indexOf(100));
        printList(list);

        //deleting by condition(predicate, lambda)
        //deleting all elements that divide by 3
        list.removeIf(e -> e % 3 == 0);
        printList(list);

        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);

    }//end of main

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("================================");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }
    }



}//end of class
