package objectOriented.inheritance.subpackgeProtectedBook;

public class ScienceFictionBook extends Book {

    public ScienceFictionBook(String name) {
        super(name);
    }

    public void doAnnotations () {
        read(); // can access because is on the same package
        System.out.println("After read the book, the reader is writing annotations.");
    }

    @Override
    public String toString() {
        return "ScienceFictionBook{" +
                "name='" + name + '\'' +
                '}';
    }
}

