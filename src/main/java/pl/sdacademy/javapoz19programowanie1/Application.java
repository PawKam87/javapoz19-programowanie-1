package pl.sdacademy.javapoz19programowanie1;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, Nation.PL);
        Author author2 = new Author("Adam", "Mickiewicz", 1798, Nation.PL);

        Author author = new Author();
        author.setFirstName("Stephan");
        author.setLastName("King");
        author.setBirthYear(1947);
        author.setNation(Nation.USA);

        List<Author> authors = Arrays.asList(author, author1, author2,
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));


        showByNation(authors, Nation.PL);
        showModernAuthors(authors);
        showByNationAndBirthYear(authors);
        System.out.println(groupNyNation(authors));
    }

    private static void showByNationAndBirthYear(List<Author> authors) {
    }

    public static void showByNation(List<Author> authors, Nation nation){
        for (Author author : authors) {
            if (author.getNation().equals(nation)){
                System.out.println(author);
            }
        }
    }
    private static void showModernAuthors(List<Author> authors){
     int birthYear = 1900;
     for ( Author author : authors)
            if (author.getBirthYear()> 1900) {
                System.out.println(author);
            }
        }
    private static void showByNationAndBirthYear(List<Author> authors,Nation nation,int birthYear){
        for (Author author : authors){
            if ( (author.getNation()== nation && author.getBirthYear()>birthYear)) {
                System.out.println((author));
            }
        }
    }
    private static Map<Nation, List<Author>> groupNyNation(List<Author>authors){
        Map<Nation,List<Author>> map = new HashMap<>();
        for (Author author : authors) {
            map.putIfAbsent(author.getNation(), new ArrayList<>());
            map.get(author.getNation()).add(author);
        }
        return map;
    }
}
