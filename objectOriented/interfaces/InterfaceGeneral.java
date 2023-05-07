package objectOriented.interfaces;

public class InterfaceGeneral {

    public static void main(String[] args) {

        System.out.println("Interface\n" +
                "In general a interface defines a CONTRACT thay say what a class can do,\n" +
                "\twithout saying how the clas will do, i.e, the methods have no body in the interface.\n" +
                "\tthey will be define in the concrete class that implements the interface.\n" +
                "A class accept the contract with the keyword implements.\n" +
                "While implementing an interface, you are agreeing to implements all the methods define on the interface.\n" +
                "A class can extends from only one class, by can implement many interfaces.\n" +
                "Is is possible to inherit concrete methods from interfaces.\n" +
                "\tInterfaces has to types of concrete methods: static and default.\n" +
                "\tThe default interface methods are inheritable.\n" +
                "\tThe static interface methods are NOT inheritable\n" +
                "Interfaces are implicitly abstract\n" +
                "All interface methods are implicitly public\n" +
                "All interface mehtods are implicitly abstract, unless declared as default or static.\n" +
                "Interface can only declared constants, i.e, all variable are public static final\n" +
                "As like abstract classes you can not new an interface, nonetheless interface type can be used as reference.\n");

        System.out.println("\nInterfaces Constants\n" +
                "By rule they are public static final\n" +
                "By placing a constants in the interface, any class that implements the interface has direct access to the constant." +
                "\t, like the class had inherited the constants.\n" +
                "");
    }



}
