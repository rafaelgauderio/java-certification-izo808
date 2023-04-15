package dataTypes;

import java.util.Arrays;

public class Primitives {

    public static void main(String[] args) {

        System.out.println("All numeric types un Java are signed\n" +
                "\tThe leftmost bit is used to represent the sing\n" +
                "\t1 means negative and 0 means that the number is positive\n" +
                "\tThe decimal number 0 is considered a positive number, so tha range of a byte goes to -128 to 127\n" +
                "\tWe have one less positive number on the range\n");

        System.out.println("The size of the eight primitive data types in Java\n" +
                "\t1 byte = 8 bits\n" +
                "\tshort  = 2 bytes\n" +
                "\tchar   = 2 bytes unsigned, Unicode\n" +
                "\tint    = 4 bytes\n" +
                "\tlong   = 8 bytes\n " +
                "\tfloat  = 4 bytes\n" +
                "\tdouble = 8 bytes\n" +
                "\tboolen = (true, false)\n");

        System.out.println("Casting\n" +
                "Do not need casting\n" +
                "\tbyte -> short/char -> int -> long -> float -> double\n" +
                "\tIn the opposite direction requeires cast, becasuse you are losing butes\n");
        byte b= (byte) 454545; // into to a byte
        byte b1 = 127; // compite knows int literal is in range
        byte b2 = (byte) 128; // int to byte
        int i = (int)4.5; // double to int
        float f= (float)54597564134545454545445454599994564554.36; //double to floar
        long l = (long) 454566465.96f; // float to long

        long l1 = 35; // int to foat is automatic. Need no casting
        double d2 = 45.98f; ;; // float to double is automatic

        char chart = 'b'; // char in single quotes
        System.out.println(chart);

        long long1 = 2L & 3L;
        System.out.println(long1);

        char chart2 = 97;
        System.out.println(chart2); //a


        char chart3 = 'd' ;
        //short s2 = d; // compile error
        final char chart4 = 'd'; // compile-time constant
        System.out.println(chart4); // d

        int binary = 0b101010;
        System.out.println(binary); // 42;

        int octal = 052;
        System.out.println(octal); //42

        int hexadecimal = 0x2a;
        System.out.println(hexadecimal);

        double d1 = 17_000.12;  // ok
        // double d2 = _17_000.12; // underscore cannot be at very start/end
        //  double d3 = 17_000_.12; // underscore cannot be either side of decimal point
        System.out.println(d1);

    }

}
