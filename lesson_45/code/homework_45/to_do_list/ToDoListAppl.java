package homework_45.to_do_list;

//Задание 2. Разработать приложение ToDoList. В приложении ToDoList сделать сохранение/чтение задач в файл.

import homework_45.to_do_list.dao.ToDoListImpl;
import homework_45.to_do_list.model.Action;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ToDoListAppl {

    public static void main(String[] args) {

        ToDoListImpl toDoList = new ToDoListImpl();

        Action a1 = new Action(1, "Vacuum the flat", LocalDate.of(2024, 11, 19));
        Action a2 = new Action(2, "Dentist", LocalDate.of(2025, 2, 25));
        Action a3 = new Action(3, "Buy food supplies", LocalDate.of(2024, 11, 15));

        Set<Action> actions = new HashSet<>();

        //clearing the file before running the program
        toDoList.clearFile();

        //first try, adding actions to the file
        toDoList.addActionToFile(actions);

        //printing the file
        toDoList.printFile();
        System.out.println();

        //clearing the file to correct the list of actions
        toDoList.clearFile();

        //second try, adding actions to the file
        toDoList.addActionToFile(actions);

        //printing the file
        toDoList.printFile();

    }//end of main

}//end of class
