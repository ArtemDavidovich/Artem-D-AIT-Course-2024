package keabord_input;

//**Игра “Угадай число” (*)**
//Цель:
//Разработать консольную игру, в которой пользователь должен угадать случайно сгенерированное число в пределах от 1 до 100.
//Программа должна давать подсказки после каждой попытки, сообщая, больше или меньше введенное число, чем загаданное.
//Игра продолжается до тех пор, пока число не будет угадано.
//После угадывания, программа должна вывести количество попыток, потраченных на угадывание, и предложить пользователю сыграть еще раз.
//Шаги реализации:
//Генерация случайного числа.
//Использовать Math.random() для генерации случайного числа в заданном диапазоне (1-100).
//Основной игровой цикл:
//Использовать цикл (do-while или while), чтобы запросить у пользователя ввод числа до тех пор, пока не будет угадано загаданное число.
//Использовать условные операторы для сравнения введенного числа с загаданным и вывода подсказок (“слишком большое“, “слишком маленькое“).
//Подсчет попыток:
//Вести подсчет числа попыток, которые пользователь сделал для угадывания числа.
//Окончание игры и предложение повторить:
//После угадывания числа вывести количество попыток и спросить пользователя, хочет ли он сыграть еще раз.
//Если да, игра начинается заново с генерации нового случайного числа; если нет — программа завершается.
//Дополнительные условия:
//Обеспечить обработку ввода, чтобы программа принимала только числа и корректно реагировала на некорректный ввод (например, буквы или символы).
//Можно добавить функционал для ограничения максимального количества попыток.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2_Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game! Try to guess a random number from 1 to 100.");
        System.out.println("Type in your first guess:");

        int guess = 0;
        boolean nextGame = true;

        while(nextGame){
            int n = ((int) (Math.random() * ((100 - 1) + 1))) + 1;
            int count = 1;
            boolean validInput = false;

            while(!validInput){
                try {
                    guess = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException x) {
                    System.out.println("Incorrect input! Please, enter an integer number.");
                    scanner.next();
                }
            }

            while(n != guess && count < 10) {
                System.out.println("Your have missed :(");
                if (guess > n) {
                    System.out.println("Your number is too big.");
                } else {
                    System.out.println("Your number is too small.");
                }
                System.out.println("Make another try:");
                validInput = false;
                while(!validInput){
                    try {
                        guess = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException x) {
                        System.out.println("Incorrect input! Please, enter an integer number.");
                        scanner.next();
                    }
                }
                count++;
            }
                if(guess == n) {
                    System.out.println("You've WON! The random number was " + guess + "! Congratulations!!!");
                    System.out.println("You have made " + count + " tries in total.");
                } else{
                    System.out.println("Sorry, you have made to many attempts :(");
                }
                    System.out.println("Do you want to play once more? Type in true or false:");
                    nextGame = scanner.nextBoolean();
                if (nextGame){
                    System.out.println("Great choice! Then we should play once again!");
                    System.out.println("Let's start! Make your first try:");
            }
        }

        System.out.println("No? Then see you next time. Bye!");


    }//end of main

}//end of class
