package objectOriented.interfaces;

interface Animal {

    // defaul methods are inherited
    default void move () {
        System.out.println("By default a animal move slowly!");
    }
}

class Turtle implements Animal {
  // inherited the default methods. They do not need to be implemented
};

class GreyhoundDog implements Animal {

    @Override
    public void move () {
        System.out.println("A Greyhound dog move very fast.");
    }

}

public class ProgramInterfaceDefault {

    public static void main(String[] args) {

        // can not new a interface (abstract by default). Abstract class not be instantiated
        //Animal a1 = new Animal ();

        System.out.println("Default methods are related to an instance of the class.\n");

        //Can use a interface as an reference
        Animal galgo = new GreyhoundDog();
        galgo.move(); // ...move very fast;

        Animal tartaruga = new Turtle();
        tartaruga.move(); //... move slowly
    }

}
