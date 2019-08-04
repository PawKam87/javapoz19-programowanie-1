package pl.sdacademy.javapoz19programowanie1;

import java.util.Arrays;
import java.util.List;

public class ApplicatonBook {
    public static void main(String[] args) {

        List<Author> authors = Arrays.asList(
                new Author("Stephen", "King", 1947, Nation.USA),
                new Author("Henryk", "Sienkiewicz", 1846, Nation.PL),
                new Author("Adam", "Mickiewicz", 1798, Nation.PL),
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG)
        );

        List<Book> books = Arrays.asList(
                new Book("W pustyni i w puszczy", 1910, 300, authors.get(1)),
                new Book("Krzyżacy", 1900, 1000, authors.get(1)),
                new Book("Dziady III", 1832, 250, authors.get(2)),
                new Book("Dziady I", 1860, 350, authors.get(2)),
                new Book("Zielona mila", 1996, 290, authors.get(0)),
                new Book("Balladyn", 1839, 400, authors.get(3)),
                new Book("Harry Potter i Czara ognia", 2005, 650, authors.get(4)),
                new Book("Harry Potter i Ksiaze Polkrwi", 2009, 800, authors.get(4)),
                new Book("Romeo i Julia", 1595, 34, authors.get(5))
        );

        books.stream()
                //.forEach(book -> System.out.println(book));
                .filter(book -> book.getReleaseYear() < 2000)
                .filter(book -> book.getPages() > 300)
                .map(book -> book.getTitle())
                .forEach(bookTitle -> System.out.println(bookTitle));

        System.out.println("Henryk Sienkiewicz");
        findBooksbyAuthor(books, authors.get(1));

        System.out.println("Joanne Murray Rowling");
        findBooksbyAuthor(books, authors.get(4));
    }

    public static void findBooksbyAuthor(List<Book> books, Author author) {

        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .forEach(book -> System.out.println(book));

    }


//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> collect = integers.stream()
//                .filter(n -> n % 2 == 0)
//                .filter(n -> n > 5)
//                .filter(n -> n < 10)
//                .map(n -> n * 2)
////                .forEach(n -> System.out.println(n))
////                .forEach(System.out::println)
//                .collect(Collectors.toList());
//        System.out.println(collect);

}
