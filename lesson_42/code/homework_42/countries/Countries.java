package homework_42.countries;

import java.util.HashMap;
import java.util.Map;

public class Countries {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        countries.put("United States", "North America");
        countries.put("Canada", "North America");
        countries.put("Mexico", "North America");
        countries.put("Brazil", "South America");
        countries.put("Argentina", "South America");
        countries.put("Chile", "South America");
        countries.put("United Kingdom", "Europe");
        countries.put("Germany", "Europe");
        countries.put("France", "Europe");
        countries.put("Italy", "Europe");
        countries.put("Nigeria", "Africa");
        countries.put("Egypt", "Africa");
        countries.put("South Africa", "Africa");
        countries.put("Morocco", "Africa");
        countries.put("China", "Asia");
        countries.put("India", "Asia");
        countries.put("Japan", "Asia");
        countries.put("South Korea", "Asia");
        countries.put("Vietnam", "Asia");

        int nAmerica = 0;
        int sAmerica = 0;
        int europe = 0;
        int africa = 0;
        int asia = 0;

        for (String value : countries.values()) {
            if(value.equals("North America")){
                nAmerica++;
            } else if (value.equals("South America")) {
                sAmerica++;
            } else if (value.equals("Europe")) {
                europe++;
            } else if (value.equals("Asia")) {
                asia++;
            } else {
                africa++;
            }
        }

        System.out.println("There are " + nAmerica + " countries from North America, " + sAmerica + " from South America, " + asia + " from Asia, " + africa + " from Africa and " + europe + " from Europe in the Map.");

    }//end of main

}//end of class
