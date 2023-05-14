package objectOriented.interfaces;

public class FunctionalInterfacesTheory extends Object implements functionalInterface01, functionalInterface05 {

    public static void main (String [] args) {
        System.out.println("A functional interrface is an interface that has only ONE ABSTRACT METHOD.\n" +
                "Knows as SAM (Single Abstract Method).\n" +
                "default methods do not count.\n" +
                "static methods do not count.\n" +
                "methods inherited from Object class do not count\n" +
                "use the annotation @FuntionalInterface");

        FunctionalInterfacesTheory fi01 = new FunctionalInterfacesTheory();
        FunctionalInterfacesTheory fi02 = new FunctionalInterfacesTheory();

        fi01.sam();
        System.out.println(fi02.equals(fi02));
        System.out.println(fi01.toString());
        System.out.println(fi01.hashCode());

    }


    @Override
    public void sam() {
        System.out.println("\nOverriding the single abstract method to a functional interface");
    }

    @Override
    public String toString() {
        return "FunctionalInterfacesTheory ToString method override";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

@FunctionalInterface
interface functionalInterface01 {
    public abstract void sam (); // single abstract method

}

@FunctionalInterface
interface functionalInterface02 {
    public abstract void sam (); // single abstract method
    default void method01 () {
        System.out.println("default method do not count");
    }

    public static void method02() {
        System.out.println("static method do not count");
    }

}

//@FunctionalInterface
interface functionalInterface03 {
    //  no sam method, is a simple interface
}

//@FunctionalInterface
interface functionalInterface04 {
    public abstract void sam (); // single abstract method
    public abstract void sam2(); // can have only one sam
    public abstract void sam3(); // can have only one sam

}

@FunctionalInterface
interface functionalInterface05 {
    void sam ();
    public abstract boolean equals(Object objeto); //methods inherited from Object class do not count
    public abstract String toString (); //methods inherited from Object class do not count
    public abstract int hashCode (); //methods inherited from Object class do not count
}





