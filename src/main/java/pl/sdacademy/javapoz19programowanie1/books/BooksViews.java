package pl.sdacademy.javapoz19programowanie1.books;

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
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }
}
