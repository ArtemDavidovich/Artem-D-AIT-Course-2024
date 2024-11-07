package homework_40.treeset;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetAppl {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(50, 20, 30, 10, 40));

        //auto sorting
        System.out.println(treeSet);
        System.out.println("=========================");

        //adding element
        System.out.println(treeSet.add(25));
        System.out.println("=========================");

        //checking size
        System.out.println(treeSet.size());
        System.out.println("=========================");

        //removing element
        System.out.println(treeSet.remove(30));
        System.out.println("=========================");

        //E lower(E e): Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        //E higher(E e): Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        //E floor(E e): Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        //E ceiling(E e): Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(treeSet.lower(40));
        System.out.println("=========================");

        //E first(): Returns the first (lowest) element in the set.
        //E last(): Returns the last (highest) element in the set.
        System.out.println(treeSet.first());
        System.out.println("=========================");

        //E pollFirst(): Retrieves and removes the first (lowest) element, or returns null if this set is empty.
        //E pollLast(): Retrieves and removes the last (highest) element, or returns null if this set is empty.
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
        System.out.println("=========================");

        //reverse set
        System.out.println(treeSet.reversed());
        System.out.println("=========================");

        //NavigableSet<E> descendingSet(): Returns a view of the elements in this set in descending order.
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
        System.out.println("=========================");

        //clearing and isEmpty
        treeSet.clear();
        System.out.println(treeSet.isEmpty());










    }//end of main

}//end of class
