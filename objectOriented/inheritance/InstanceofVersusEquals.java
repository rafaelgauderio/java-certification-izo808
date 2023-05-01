package objectOriented.inheritance;

import java.util.Objects;

class Professor {
    private String name;
    private int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Professor) {
            Professor prof = (Professor) objeto;
            if (this.getName() == prof.getName() && this.getAge() == prof.getAge()) {
                return true;
            }
        }
        return false;
    }

        @Override
        public int hashCode () {
            return Objects.hash(name, age);
        }
    }

    public class InstanceofVersusEquals {

        public static void main(String[] args) {
            System.out.println("They are use to determine if a reference is referring to an object of certain type.\n" +
                    "\tThe same as ==. Are the references referring to the same object in the memory\n" +
                    "\tCan be override to provide custom behaviour\n");

            Professor p1 = new Professor("Rafael de Luca", 36);
            Professor p2 = new Professor("Rafael de Luca", 36);
            Professor p3 = p2; // p3 refereces to the same object tha p2
            Professor p4 = new Professor("Claudia", 36);

            System.out.println(p1 == p2); // false. Event thought the contents of the object are the same
            System.out.println(p3 == p2); // true. the refere to the same object

            Double pi = 3.1415;
            Double pi2 = 3.1415;
            System.out.println(pi == pi2); // false

            System.out.println("\nEquals");
            System.out.println(p1.equals(p2)); // true. the obects have the same name and age
            System.out.println(p3.equals(p4)); // false. the objects have different name
        }
    }
