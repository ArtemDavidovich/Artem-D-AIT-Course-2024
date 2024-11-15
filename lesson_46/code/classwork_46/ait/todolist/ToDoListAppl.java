package classwork_46.ait.todolist;

import classwork_46.ait.todolist.dao.ToDoListImpl;
import classwork_46.ait.todolist.model.Task;
import classwork_46.ait.todolist.view.Menu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{

    public static final String FILE_NAME = "task_list.dat";

    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl(); // object
        LocalDate now = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        // Загрузка задач при запуске
        if (Files.exists(Path.of(FILE_NAME))) { // Проверяем, существует ли файл
            System.out.println("Loading existing tasks...");
            toDoList.loadTasks(FILE_NAME);
        } else {
            System.out.println("No existing tasks found. Starting fresh.");
        }

        // начало цикла
        while (true) {
            // print menu
            System.out.println("\n\u001B[31m======== MENU =========\u001B[0m");
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            System.out.println("Input your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: input integer.");
                scanner.next(); // пропустить некорректный ввод
            }
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);
                    toDoList.addTask(t);
                }
                case 2 -> {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                }
                case 3 -> {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                }
                case 4 -> {
                    System.out.println("Saving... ");
                    // call method
                    toDoList.saveTasks(FILE_NAME);
                }
                case 5 -> {
                    // call method
                    System.out.println("Loading... ");
                    toDoList.loadTasks(FILE_NAME);
                }
                case 6 -> {
                    System.out.println("Auto Saving... ");
                    toDoList.saveTasks(FILE_NAME);
                    return;
                }
                default -> {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}


