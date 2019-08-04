package pl.sdacademy.javapoz19programowanie1.books;

import java.util.Scanner;

public class BooksStart {

    private BooksViews views;

    public BooksStart() {
        this.views = new BooksViews(new Scanner(System.in));
    }

    public void start() {
        boolean flag = true;
        do {
            int decision = views.startMenu();
            switch (decision) {

                case 1:
                    authorsView();
                    break;
                case 2:
                    booksView();
                    break;
                default:
                    flag = false;

            }

        } while (flag);


    }

    private void authorsView() {
        System.out.println("Tutaj będą autorzy");
    }


    private void booksView() {
        System.out.println("tutaj będą Książki");


    }


}
