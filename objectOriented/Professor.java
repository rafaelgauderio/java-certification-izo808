package objectOriented;

public final class Professor {

    private final String name;
    private final char gender;

    // parameters are final to not be accidentally change
    public Professor(final String name, final char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static void main (String [] args) {

        Professor p1 = new Professor("Rafael de Luca", 'M');
        Professor p2 = new Professor("Juliana Silva", 'F');

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("The object professor is immutalble but the reference is mutable. Can point to other objet.");
        p1 = new Professor("Stephen ",'M');
        System.out.println(p1);


    }
}
