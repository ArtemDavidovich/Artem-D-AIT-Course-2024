package homework_39.courses;

//Задача 1.(*) Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса. Список студентов, которые записаны только на один из курсов. Условия: Используйте два HashSet для хранения студентов каждого курса. Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StudentCourses {

    public static void main(String[] args) {

        // Create sets for students registered in "Mathematics" and "Computer Science"
        Set<String> mathStudents = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        Set<String> csStudents = new HashSet<>(Arrays.asList("Bob", "Charlie", "Eve", "Frank"));

        // Find students registered in both courses using set intersection
        Set<String> bothCourses = new HashSet<>(mathStudents);
        bothCourses.retainAll(csStudents); // Intersection of mathStudents and csStudents

        // Find students registered in only one course using set difference
        Set<String> onlyOneCourse = new HashSet<>(mathStudents);
        onlyOneCourse.addAll(csStudents);  // Union of both sets
        onlyOneCourse.removeAll(bothCourses); // Removing students in both courses

        System.out.println("Students registered in both courses:");
        System.out.println(bothCourses);

        System.out.println("\nStudents registered in only one course:");
        System.out.println(onlyOneCourse);

    }//end of main

}//end of class
