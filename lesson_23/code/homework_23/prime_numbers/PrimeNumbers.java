package homework_23.prime_numbers;

//Задача 3.(*) Для метода проверки, является ли число простым, написать тест.
//Использовать assert для логических выражений.

public class PrimeNumbers {

    private int number;

    public PrimeNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PrimeNumbers{" +
                "number=" + number +
                '}';
    }

    public boolean isPrime(){
        if(number  != 2 && number != 3 && number != 5 && number != 7) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                return false;
            }
        }
        return true;
    }

}//end of class
