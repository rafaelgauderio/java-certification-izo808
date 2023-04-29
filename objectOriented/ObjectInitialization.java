package objectOriented;

public class ObjectInitialization {

    public static void main (String [] args ) {

        System.out.println("Acronym 'sic'\n" +
                "\tstatic\n" +
                "\tinstance\n" +
                "\tconstructor\n");
        System.out.println("First a time a object is created a NameOfTheClass.class is loaded,\n" +
                "\tall the static initialisers are run. This happen onl once.\n" +
                "\tWhen whe create a object a space is allocated omn the heap memory.\n" +
                "\tAll parameters and methods are set to the default values.\n" +
                "\tAll the instance (non-static) initialization are loaded now, in the order that they appear.\n" +
                "\tFinal the constructor(s) are executed.");


    }

}
