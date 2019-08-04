package pl.sdacademy.javapoz19programowanie1.books;

import java.util.Scanner;

public class BooksStart {

    private BooksViews views;
    private AuthorsRepository authorsRepository;

    public BooksStart() {
        this.views = new BooksViews(new Scanner(System.in));
        this.authorsRepository = new InMemoryAuthorsRepository();
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
        boolean flag = true;
        do {
            int decision = views.authorsMenu(authorsRepository.findAll());

            switch (decision) {
                case 1:

                default:
                    flag = false;
            }

        } while (flag);


    }


    private void booksView() {
        System.out.println("tutaj będą książki");


    }


}
