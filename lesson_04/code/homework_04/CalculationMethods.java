package homework_04;

//Задачи на методы:
//
//Напишите методы для конвертации валюты:
//евро в доллары США
//евро в британские фунты
//евро в китайские юани и проверьте их работу, вызвав их в main.
//
// Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту. Формулу пересчета найти в Интернете. Вызовите метод в main.
//
//Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.
//
//Создайте метод, который рассчитывает количество топлива, необходимое для поездки. А также стоимость поездки.

public class CalculationMethods {

    public static void main(String[] args) {

        exchangeEuroForOtherCurrency(); // конвертируем евро в различные валюты

        convertCelsiusIntoFahrenheit(); // переводим цельсии в фаренгейты

        convertNauticalMileIntoKilometer(); // переводим морские мили в километры

        amountOfPetrol(); // считаем количество топлива для поездки и стоимость поездки


    } // end of main

    private static void exchangeEuroForOtherCurrency(){

        double rateEuroForDollar = 1.11; // кросскурс евро - доллар
        double rateEuroForPound = 0.84; // кросскурс евро - фунт
        double rateEuroForYuan = 7.87; // кросскурс евро - юань

        double money = 500; // количество евро

        double exchangeResDollar = exchangeEuroForDollarMethod(rateEuroForDollar, money); // метод для перевода евро в доллары

        System.out.println("При переводе " + money + " Евро в Доллары при кросс-курсе Евро-Доллар равном " + rateEuroForDollar + " мы получим " + exchangeResDollar + " Долларов.");

        double exchangeResPound = exchangeEuroForPoundMethod(rateEuroForPound, money); // метод для перевода евро в фунты

        System.out.println("При переводе " + money + " Евро в Фунты при кросс-курсе Евро-Фунт равном " + rateEuroForPound + " мы получим " + exchangeResPound + " Фунтов.");

        double exchangeResYuan = exchangeEuroForYuanMethod(rateEuroForYuan, money); // метод для перевода евро в юани

        System.out.println("При переводе " + money + " Евро в Юани при кросс-курсе Евро-Юань равном " + rateEuroForYuan + " мы получим " + exchangeResYuan + " Юаней.");

    } // end of exchangeEuroForOtherCurrency

    private static double exchangeEuroForDollarMethod(double rateEuroForDollar, double money){

        return rateEuroForDollar * money;

    } // end of exchangeEuroForDollarMethod

    private static double exchangeEuroForPoundMethod(double rateEuroForPound, double money){

        return rateEuroForPound * money;

    } // end of exchangeEuroForPoundMethod

    private static double exchangeEuroForYuanMethod(double rateEuroForYuan, double money){

        return rateEuroForYuan * money;

    } // end of exchangeEuroForYuanMethod

    private static void convertCelsiusIntoFahrenheit(){

        double celsius = 15; // градус по цельсию
        double resFahrenheit = convertCelsiusIntoFahrenheitMethod(celsius); // метод для перевода цельсиев в фаренгейты

        System.out.println("\n" + celsius + " градусов по Цельсию равно " + resFahrenheit + " по Фаренгейту.");

    } // end of convertCelsiusIntoFahrenheitMethod

    private static double convertCelsiusIntoFahrenheitMethod(double celsius){

        return celsius * 1.8 + 32;

    } // end of convertCelsiusIntoFahrenheitMethod

    private static void convertNauticalMileIntoKilometer() {

        double nauticalMile = 57; // количество морских миль
        double resKilometer = convertNauticalMileIntoKilometerMethod(nauticalMile); // метод для перевода морских миль в километры

        System.out.println("\n" + nauticalMile + " морских миль равны " + resKilometer + " километрам.");
        System.out.printf("Километры %.2f", resKilometer);


    } // end of convertNauticalMileIntoKilometer

    private static double convertNauticalMileIntoKilometerMethod(double nauticalMile){

        return nauticalMile * 1.852;

    } // end of convertNauticalMileIntoKilometerMethod

    private static void amountOfPetrol(){

        double distance = 1490; // километров
        double petrolPerKilometer = 7.1; // расход топлива на 100 км
        double costPerLiter = 1.629; // евро за литр топлива
        double resPetrol = amountOfPetrolMethod(distance, petrolPerKilometer); // метод для рассчета количества топлива
        double resCost = costOfTravelMethod(resPetrol, costPerLiter);

        System.out.println("\n" + "\n" + "Для поездки дистанцией " + distance + " километров при расходе топлива " + petrolPerKilometer + " литров на 100 километров понадобится " + resPetrol + " литров топлива.\nСтоимость поездки при этом составит " + resCost + " евро.");

    } // end of amountOfPetrol

    private static double amountOfPetrolMethod(double distance, double petrolPerKilometer){

        return distance / 100 * petrolPerKilometer;

    } // end of amountOfPetrolMethod

    private static double costOfTravelMethod(double resPetrol, double costPerLiter){

        return resPetrol * costPerLiter;

    } // end of costOfTravelMethod


} // end of class
