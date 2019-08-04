package pl.sdacademy.javapoz19programowanie1.books;

import java.util.List;
import java.util.Scanner;

public class BooksViews {
    private Scanner scanner;

    public BooksViews (Scanner scanner){
        this.scanner = scanner;
    }

    public int startMenu() {
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("3. Koniec");
        return getDecision();
    }

    private int getDecision() {
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }

    public int authorsMenu (List<Author> authors) {
        authors.stream()
                .forEach(author -> System.out.println(author));
        return getDecision();

    }
}
