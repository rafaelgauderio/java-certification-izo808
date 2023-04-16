package dataTypes;

public class StringApi {

    public static void main(String[] args) {
        System.out.println("String is a object and have methods\n");
        System.out.println("String index are zero-based\n");
        System.out.println("String position are one-based");

        String name = "julianA";
        String name2 = "JULIana";
        String lastname = "de Souza";

        System.out.println(name.equals(name2)); // false
        System.out.println(name.equalsIgnoreCase(name2)); // true
        System.out.println(name.charAt(0)); //j index started in zero
        System.out.println(name.charAt(3)); // i
        System.out.println(name.replace("j","J").replace("A","a").concat(" ").concat(lastname));
        System.out.println(name.length()); // 7
        System.out.println(lastname.length()); // 8
        System.out.println(name.substring(0,2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
