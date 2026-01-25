package Streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", 15.99, 1925, "Classic"),
                new Book("Dune", 22.50, 1965, "Sci-Fi"),
                new Book("Project Hail Mary", 18.00, 2021, "Sci-Fi"),
                new Book("The Hobbit", 12.99, 1937, "Fantasy"),
                new Book("The Hobbit", 12.99, 1937, "Fantasy"),
                new Book("1984", 10.50, 1949, "Dystopian"),
                new Book("The Silent Patient", 25.00, 2019, "Mystery"),
                new Book("A Game of Thrones", 30.00, 1996, "Fantasy"),
                new Book("Brave New World", 14.75, 1932, "Dystopian"),
                new Book("To Kill a Mockingbird", 13.25, 1960, "Classic"),
                new Book("The Midnight Library", 21.00, 2020, "Fantasy")
        );
//            1. Filter:  Books under 20 $

        books.stream().filter(b -> b.price < 20).forEach(System.out::println);

//            2.Mapping: Convert book titles to uppercase
        System.out.println("Mapping");
        books.stream().peek(book -> book.title = book.title.toUpperCase()).forEach(System.out::println);
//        U can use map as well
//            3. Sorting: Books by publication date
        System.out.println("Sorting");
        books.stream().sorted(Comparator.comparingInt(book -> book.publicationYear)).forEach(System.out::println);

//            4. Remove Duplicates

        System.out.println("Remove Duplicate");
        books.stream().distinct().forEach(System.out::println);


//            5. Limit : Display only first 3 books

        System.out.println("Limit");
        books.stream().limit(3).forEach(System.out::println);

//            6. Skip : Skip the first 2 books
        System.out.println("Skip first 2 books");
        books.stream().skip(2).forEach(System.out::println);

    }
}
