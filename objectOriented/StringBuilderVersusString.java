package objectOriented;


public class StringBuilderVersusString {
    public static void main(String[] args) {

        System.out.println("String are Immutable.\n" +
                "String Builder are mutable.\n" +
                "\tIt otmizes the use of the memory when we hava to concatenated several strings.");

        String name = "Rafael";
        StringBuilder sbName = new StringBuilder("Rafael");

        addLastName(name);
        System.out.println(name); // it will have no change

        addLastName2(name);
        System.out.println(name); // it will not changes were not save in a local variable

        String compleName = addLastName2(name);
        System.out.println(compleName); // it will change, but it will have created several objects. wasting unnecessary memory

        addLastName(sbName);
        System.out.println(sbName); // it will change, optimizing memory using StringBuilder
    }

    public static void addLastName(String lastName) {
        lastName +=" de Luca";
        lastName.concat(" de Luca");
        // it will not change the original string. String are immutable
        // no reference to the new strings. The objects will be clean by the garbage collector.
        // garbage collector manages the allocation and release of the memory application.
    }

    //owerloading method
    public static void  addLastName(StringBuilder lastName) {
        lastName.append(" de Luca");
    }

    public static String addLastName2(String lastName){
        String completeName =  lastName.concat(" de Luca");
        return  completeName;
    }



}
