package dataTypes;

public class StringEquals {

    public static void main(String[] args) {

        String name = new String("Rafael");
        String name2 = "Rafael";


        System.out.println("Equals compares if the content are the same");
        System.out.println(name.equals(name2)); //true
        System.out.println("== Test if the objects are identic. Occupy the same location in memory");
        System.out.println(name==name2); // false

        name2 = name ; // using the same reference

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name.equals(name2)); //true = the same content
        System.out.println(name==name2); // true, they se the sabe reference

    }
}
