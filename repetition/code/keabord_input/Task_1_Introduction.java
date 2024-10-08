package keabord_input;

//**Задача 1.**
//Реализовать приложение, которое запрашивает информацию о вас, и выводит итоговую строку.
//Пример:
//Введите ваше имя:
//Иван
//Введите вашу фамилию:
//Иванов
//Введите ваш город:
//Берлин
//Введите ваш возраст:
//29
//Введите ваш рост (в метрах):
//1.80
//Вывод в консоль:
//Меня зовут Иван Иванов, мне 29 лет, мой город Берлин, мой рост 180 см.

import java.util.Scanner;

public class Task_1_Introduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Name:");
        String name = scanner.nextLine();
        System.out.println("Input your Surname:");
        String surname = scanner.nextLine();
        System.out.println("Input your city:");
        String city = scanner.nextLine();
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        System.out.println("Input your height, m:");
        double height = scanner.nextDouble();

        System.out.println("My name is " + name + " " + surname + ", I am " + age + " years old, I am from " + city + ", I am " + height + "m height.");

    }//end of main

}//end of class
