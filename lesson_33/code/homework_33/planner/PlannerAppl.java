package homework_33.planner;

import homework_33.planner.dao.PlannerImpl;
import homework_33.planner.model.Action;

import java.util.Scanner;

public class PlannerAppl {

    public static void main(String[] args) {

        Action[] actions = Action.values();
        PlannerImpl planner = new PlannerImpl();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Choose action:");
            planner.printMenu(); //printing menu (Task 2)
            int choice = scanner.nextInt();
            switch (choice){
                case 1, 2, 3 -> System.out.println("You've chosen '" + actions[choice - 1].getAction() + "' option.");
                case 4 -> flag = false;
                default -> System.out.println("Error! Wrong input.");
            }
        }

    }//end of main

}//end of class
