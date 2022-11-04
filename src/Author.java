public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    @Override
    public String toString() {
        return "Author{"+
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''+
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return true;
    }
}


