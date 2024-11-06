package homework_39.currency;

//Задача 2. Создайте enum с кодами валют и их текущими курсами к евро.

public enum Currency {

    USD(0.85),     // 1 USD = 0.85 EUR
    GBP(1.15),
    JPY(0.0075),
    CHF(0.92),
    AUD(0.65);

    private final double rateToEuro;

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

}//end of class
