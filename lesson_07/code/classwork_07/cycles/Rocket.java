package classwork_07.cycles;

//Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        // setting initial conditions
        int countDown = 10;
        System.out.println("We have " + countDown + " sec before launch.");

        while (countDown > 0){
            countDown--;
            System.out.println("We have " + countDown + " sec before launch.");
        }

        System.out.println("Here we go!");

    }//end of main

}//end of class
