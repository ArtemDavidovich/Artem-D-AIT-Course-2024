package classwork_46.ait.todolist;

import classwork_46.ait.todolist.dao.ToDoListImpl;
import classwork_46.ait.todolist.view.Menu;

import java.io.*;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl(); //main object

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Input task: ");

                }
                case 2 -> {
                    System.out.println("Your tasks: ");

                }
                case 3 -> {
                    System.out.println("Input task number: ");

                }
                case 4 -> {
                    System.out.println("Saving... ");

                }
                case 5 -> {
                    System.out.println("Loading... ");

                }
                case 6 -> {
                    return;
                }
                default -> {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}


