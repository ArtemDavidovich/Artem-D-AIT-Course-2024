package homework_44.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookAppl {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("1984", "Orwell", 1949, 15.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.99));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851, 9.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, 8.99));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 14.99));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 13.99));

        System.out.println("------ Printing books ------");
        printBooks(books);

        System.out.println("------ Filtering books by price > 10 ------");
        printBooksByPrice(books);

        System.out.println("------ Sorting books by year ------");
        printBooksByYear(books);

        System.out.println("------ Calculating average price ------");
        printAveragePrice(books);

    }//end of main

    private static void printBooks(List<Book> books) {
        books.forEach(System.out::println);
    }

    private static void printBooksByPrice(List<Book> books) {
        List<Book> expensiveBooks = books.stream()
                .filter(book -> book.getPrice() > 10)
                .toList();
        expensiveBooks.forEach(System.out::println);
    }

    private static void printBooksByYear(List<Book> books) {
        books.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .forEach(System.out::println);
    }

    private static void printAveragePrice(List<Book> books) {
        double averagePrice = books.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0.0);
        System.out.printf("Average book price: %.2f USD\n", averagePrice);
    }

}//end of main
