import java.util.Objects;

public class Book {
    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;
    private Author fullName;
    Objects o;
    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook, Author fullName) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.fullName = fullName;
    }

    public Author getFullName() {
        return this.fullName;
    }

    public String titleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublicationOfTheBook == book.yearOfPublicationOfTheBook && titleOfTheBook.equals(book.titleOfTheBook)
                && fullName.equals(book.fullName);
    }

    @Override
    public int hashCode() {return Objects.hash(titleOfTheBook, yearOfPublicationOfTheBook, fullName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", yearOfThePublicationOfTheBook=" + yearOfPublicationOfTheBook +
                ", fullName=" + fullName +
                '}';
    }

}