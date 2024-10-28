package homework_33.planner.dao;

import homework_33.planner.model.Action;

public class PlannerImpl implements Planner{

    Action[] actions = Action.values();

    @Override
    public void printMenu() {
        for (Action action : actions) {
            System.out.println(action.getNumber() + ". " + action.getAction());
        }
    }

}//end of class
