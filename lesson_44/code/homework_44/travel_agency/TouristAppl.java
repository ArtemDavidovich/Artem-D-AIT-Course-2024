package homework_44.travel_agency;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TouristAppl {

    public static void main(String[] args) {

        List<Tourist> tourists = List.of(
                new Tourist("Olesia", List.of("Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain")),
                new Tourist("Bilbo Baggins", List.of("Italy", "Spain", "Turkey")),
                new Tourist("Tatyana", List.of("Italy", "Spain", "Italy", "Greece", "Turkey")),
                new Tourist("Anton", List.of("Germany", "Nederland", "Turkey", "Georgia")),
                new Tourist("Sergei_B", List.of("Tunis", "Turkey", "China", "Vietnam")),
                new Tourist("Galina", List.of("Italy", "France", "Italy")),
                new Tourist("Anatoly", List.of("Montenegro", "Albania", "Greece", "Italy")),
                new Tourist("Andrii", List.of("UK", "Ireland", "Spain")),
                new Tourist("Liubov", List.of("Croatien", "Slovenien", "Spain", "France", "Egypt")),
                new Tourist("Liam", List.of("Spain", "Portugal", "Morocco", "Cyprus")),
                new Tourist("Emma", List.of("Greece", "Turkey", "Croatia", "Montenegro")),
                new Tourist("Mia", List.of("Italy", "Malta", "Spain", "Turkey")),
                new Tourist("Noah", List.of("Turkey", "Greece", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Montenegro", "Albania", "Greece")),
                new Tourist("Lucas", List.of("Portugal", "Spain", "France", "Italy")),
                new Tourist("Amelia", List.of("Greece", "Cyprus", "Spain", "Italy")),
                new Tourist("Oliver", List.of("Spain", "Italy", "Turkey", "Greece")),
                new Tourist("Isabella", List.of("France", "Spain", "Italy", "Greece")),
                new Tourist("Ethan", List.of("Italy", "Greece", "Spain", "Croatia")),
                new Tourist("Ava", List.of("Greece", "Turkey", "Spain", "Italy")),
                new Tourist("Liam", List.of("Spain", "Italy", "Morocco", "Greece")),
                new Tourist("Sophia", List.of("Italy", "Spain", "Turkey", "Greece")),
                new Tourist("Jackson", List.of("Greece", "Spain", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Greece", "Italy", "Montenegro")),
                new Tourist("Logan", List.of("Spain", "Greece", "Italy", "Turkey")),
                new Tourist("Emma", List.of("Greece", "Italy", "Spain", "Cyprus")),
                new Tourist("Aiden", List.of("Italy", "Greece", "Spain", "Turkey"))
        );

        System.out.println("--------sort countries by popularity-------");
        printCountriesByPopularity(tourists);

        System.out.println("--------find best tourist-------");
        bestTourist(tourists);

    }//end of main

    private static void bestTourist(List<Tourist> tourists) {
        Map<Integer, List<Tourist>> touristsActivity = tourists.stream()
                .collect(Collectors.groupingBy(t -> t.getCountries().size()));

        int max = touristsActivity.keySet().stream()
                .max(Integer::compareTo)
                .orElse(0);

        tourists.stream()
                .filter(tourist -> tourist.getCountries().size() == max)
                .toList()
                .forEach(System.out::println);
    }

    private static void printCountriesByPopularity(List<Tourist> tourists) {
        Map<String, Long> countriesByPopularity = tourists.stream()
                .map(Tourist::getCountries)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(
                   countries -> countries, Collectors.counting()
                ));

        countriesByPopularity.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .forEach((entry -> System.out.println(entry.getKey() + ": " + entry.getValue())));
    }

}//end of class
