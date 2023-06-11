package arrays;

import java.util.Arrays;

public class ArrayPrimitives {

    public static void main(String[] args) {
        System.out.println("Primitive array accept any value can be promoted implicity to the declared type.\n");

        int [] integerArray = new int [4];
        byte b = 6;
        char a = 'a';
        short s = 9;
        int i = 17;

        integerArray[0] = b;
        integerArray[1] = a;
        integerArray[2] = s;
        integerArray[3] = i;

        System.out.println(Arrays.toString(integerArray));

    }
}
