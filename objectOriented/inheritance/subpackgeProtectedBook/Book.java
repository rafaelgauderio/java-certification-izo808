package objectOriented.inheritance.subpackgeProtectedBook;

public class Book {

    protected String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void read () {
        System.out.println("The user is reading a book");
    }
}

