package homework_45.to_do_list.dao;

import homework_45.to_do_list.model.Action;

public interface ToDoList {

    void addActionToFile(Action action);

    void clearFile();

    void printFile();

}
