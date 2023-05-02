package objectOriented.inheritance;

class Book {

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

class ScienceFictionBook extends Book {

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

public class ProgramProtected {

    public static void main(String[] args) {
        System.out.println("Protected is more visiable than private and less visable than private\n" +
                "A protected member can be accessed by a subclass (via inheritance) event if the class is in a diffetente package.\n" +
                "\tprotected = same package + subclass\n");

        ScienceFictionBook neuromancer = new ScienceFictionBook("Neuromancer");
        System.out.println(neuromancer);
        neuromancer.read();
        neuromancer.doAnnotations();
    }
}
