package classwork_05;

//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".



public class Conditions {

    public static void main(String[] args) {

        //Проверка положительное или отрицательное число.
        // неполный условный оператор
        int x = 56;

        if (x >= 0){
            System.out.println("x = " + x + " is a positive number");
        }

        if (x < 0){
            System.out.println("x = " + x + " is a negative number");
        }

        // полный условный оператор
        x = -54; // переопределили значение переменной

        if(x >= 0){
            System.out.println("x = " + x + " is a positive number");
        } else {
            System.out.println("x = " + x + " is a negative number");
        }

        //Проверка четное или нечетное целое число.
        x = 112;

        if(x % 2 == 0){
            System.out.println("x= " + x + " is an even number");
        } else {
            System.out.println("x= " + x + " is an odd number");
        }

        //Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
        //прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

        int age = 18;

        if(age <= 18){
            System.out.println("Вам надо прийти вместе с вашим опекуном.");
        } else {
            System.out.println("Вам разрешено действовать самостоятельно.");
        }

    } // end of main




} // end of class
