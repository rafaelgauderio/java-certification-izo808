package arrays;

public class ArrayTheory {

    public static void main(String[] args) {
        System.out.println("Arrays are objects that store multiple variables of the same type.\n" +
                "Arrays can be primitives variables or object references.\n" +
                "The array itself is always an OBJECT on th HEAP memory (even a array of primitives)\n" +
                "Arrays of arrays is a multi-dimensional\n" +
                "Include the size of the array only wen instantiate with new or declaring the elements\n" +
                "The compiler (JVM) need to know how much space to allocate on the heap for the nem array.\n" +
                "Multidimensinal arrays have to populated the size from array from the left to right.\n" +
                "Initialising an array of objects is essentially an array of references to those objects.\n" +
                "Array of 4 Strings, is an array of 4 references to those Strings.\n" +
                "A refecence that do not have an object assigned to it is a null reference.\n" +
                "We can access any individual element of the array using an index.\n" +
                "Array objects have a public variable length, that represent the number of elementos of the array.\n" +
                "Array of arrays, is when each element of the array refers to other array\n" +
                "Anonymous arrays (just-in-time arrays)\n" +
                "\tanonymous array is not assign to anything.\n" +
                "\tUseful when invoking a method that requires an array argument.\n");

        int [] notas; // recommended this way
        int grades [];
        int [] notas2 = new int[10];

        String [] names;
        String nomes [];
        Thread [] threads = new Thread[5];

        String [] [] fisrtAndLastNames;
        Double [] [] [] prices; // threeDimensionArray

        Integer [] [] number = new Integer[4][];
        Integer [] [] number2 = new Integer[5][10];
    }
}
