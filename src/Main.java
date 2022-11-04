public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Archibald", "Cronin");
        Author secondAuthor = new Author("John","Priestley");
        Book firstBook = new Book("Green Years",1931,firstAuthor);
        Book secondBook = new Book("A bend in the Road", 1932, secondAuthor);

        System.out.println();
        System.out.println("Book One");
        System.out.println(" "+firstBook.titleOfTheBook()+","+
                " "+ firstBook.getYearOfPublicationOfTheBook()+","+
                " " + firstBook.getFullName());
        System.out.println();
        System.out.println("Book Two");
        System.out.println(" "+ secondBook.titleOfTheBook()+","+
                " "+ secondBook.getYearOfPublicationOfTheBook()+","+
                " " + secondBook.getFullName());
    }
}

