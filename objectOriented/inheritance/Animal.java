package objectOriented.inheritance;


public class Animal extends Object {
    // have to be protected the parameter,
    // private parameters will not be visable on the sub class
    protected String name = "name of the animal";

    public void eat() {
        System.out.println("The aninal is eating!");
    }

    public static void walk() {
        System.out.println("The animal is walking");
    }
}

    class Horse extends Animal {
        private String name="name of the horse";
        // overriding the method of the super class


        public String getName() {
            return name;
        }

        public void eat () {
            System.out.println("The horse is eating");
        }
        public static void walk () {
            System.out.println("The hourse is walking"); // not an override. is a static
        }
        public String relinx () {
            return "The hourse is relinxing";
        }
    }

    class ProgramAninal {

        public static void main(String[] args) {
            Animal a1 = new Animal();
            a1.eat(); // polymorphism - object type
            a1.walk(); // static will call the animal - reference type
            System.out.println(a1.name); // parameter can be acess directly.

            Horse a2 = new Horse();
            a2.eat(); // polymorphism - object type
            a2.walk(); // static - reference type
            a2.relinx(); // new method avaliable only on the subclass
            System.out.println(a2.getName()); // data - reference type
        }

    }