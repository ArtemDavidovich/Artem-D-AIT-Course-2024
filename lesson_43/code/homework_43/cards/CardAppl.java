package homework_43.cards;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CardAppl {

    //constants for deck creation
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {

        System.out.println("------creating a deck-------");
        List<String> deck = createDeck();
        deck.forEach(System.out::println);

        Collections.shuffle(deck); //shuffling the deck

        System.out.println("------dealing cards-------");

        Map<String, List<String>> table = dealCards(deck);
        table.forEach((key, value) -> System.out.println(key + ": " + value));

    }//end of main

    private static Map<String, List<String>> dealCards(List<String> deck) {
        Map<String, List<String>> table = new HashMap<>();

        IntStream.rangeClosed(0, 2) //3 players
                .forEach(i ->
                        table.put("Player " + (i + 1), deck.stream()
                                .skip(i * 10L) //skipping the elements
                                .limit(10) //limiting the number of elements
                                .toList()
                        ));
        List<String> reserve = deck.stream()
                .skip(3 * 10)
                .limit(2)
                .toList();
        table.put("Reserve", reserve); //adding reserve to the map

        return table;
    }

    private static List<String> createDeck() {
        return Arrays.stream(SUITS) //converting array SUITS into a stream
                //converting array RANKS  into a stream and creating one stream
                .flatMap(suit -> Arrays.stream(RANKS).map(rank -> rank + " of " + suit))
                .collect(Collectors.toList());
    }

}//end of class
