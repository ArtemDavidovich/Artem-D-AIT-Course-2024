package homework_23.vacation_car;

//Задача 2. Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

import homework_23.vacation_car.model.VacationCar;

import static homework_23.vacation_car.model.VacationCar.vacationCarBestChoice;

public class VacationCarAppl {

    public static void main(String[] args) {

        VacationCar[] vacationCars = new VacationCar[5];
        vacationCars[0] = new VacationCar("Audi","d",6.6,45);
        vacationCars[1] = new VacationCar("BMW","b",6.8,49);
        vacationCars[2] = new VacationCar("Opel","d",6.9,45);
        vacationCars[3] = new VacationCar("VW","d",6.5,39);
        vacationCars[4] = new VacationCar("Mercedes","b",6.3,49);

        System.out.println("The best choice for the vacation is: " + vacationCarBestChoice(vacationCars).getBrand());

    }//end of main

}//end of class
