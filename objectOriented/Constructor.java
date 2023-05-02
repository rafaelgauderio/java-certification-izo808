package objectOriented;

public class Constructor {

    public static void main(String[] args) {
        System.out.println("Every class must have a construct.\n" +
                "If you do dot declare one, the compile will declare a default constructor for you\n" +
                "The default constructor do not have args\n" +
                "The fisrt line will be super(). When super is used.\n" +
                "How to access a static variable of a class on the constructor. super(Person.name)\n"+
                "Use typically to initialise the object state\n" +
                "Contructor are not inharited. So they can not be overridden but can be overloaded\n" +
                "Two import points of constructor.\n" +
                "\t1.They have exactly the same name of the class.\n" +
                "\t2.They have not return type\n");
    }
}
