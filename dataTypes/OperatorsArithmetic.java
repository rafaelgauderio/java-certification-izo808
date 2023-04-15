package dataTypes;

public class OperatorsArithmetic {
    public static void main(String[] args) {

        System.out.println("Arithmetic Operator\n" +
                "\tAddition, subtraction, multiplication, division and modulus.\n" +
                "\tinteger division truncates\n" +
                "\tmodulus keep remainder only\n");

        int int1 = 16;
        int _int2 = 3;
        System.out.println(int1/_int2); // 5
        System.out.println(int1%_int2); // 1 = rest

        byte byte1 = 5, byte2=7;
        byte byte3 = (byte)(byte1 + byte2); // must cast to but two integers inside a byte

        System.out.println("String Concatenation");
        int number = 35;
        String name = "Rafael";
        System.out.println(name + ", age: " + number);

        System.out.println("Concatanates string with int:  " + byte1 + byte2); // 57 = concatenated string with int
        System.out.println("Result: " + (byte1 + byte2)); // 12 = 5 + 7
    }
}
