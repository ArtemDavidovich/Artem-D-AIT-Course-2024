package homework_45.to_do_list.dao;

import homework_45.to_do_list.model.Action;

import java.util.Set;

public interface ToDoList {

    void addActionToFile(Set<Action> actions);

    void clearFile();

    void printFile();

}
