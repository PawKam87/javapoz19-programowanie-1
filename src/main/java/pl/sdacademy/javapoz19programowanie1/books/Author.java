package pl.sdacademy.javapoz19programowanie1.books;

import pl.sdacademy.javapoz19programowanie1.Nation;

import java.util.Objects;

public class Author {


    private String firstName;
    private String lastName;
    private int birthYear;
    private Nation nation;

    public Author(String firstName, String lastName, int birthYear, Nation nation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nation = nation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return birthYear == author.birthYear &&
                Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName) &&
                nation == author.nation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear, nation);
    }

    public Author() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", nation=" + nation +
                '}';
    }
}
