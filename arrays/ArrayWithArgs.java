package arrays;

public class ArrayWithArgs {

    public static void main(String[] [] args) {
        System.out.println(args[0][0]);
        System.out.println(args[0][1]);
        System.out.println(args[0][2]);
        System.out.println(args[0][3]);
    }

    public static void main(String[] args) {
        ArrayWithArgs argumentos = new ArrayWithArgs();
        String [] names = {"Rafael", "Claudia", null, "Larissa"};
        String [][] newArgs = {names}; // here we have an array referring to another array
        argumentos.main(newArgs);
    }
}
