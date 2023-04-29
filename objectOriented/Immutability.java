package objectOriented;

public class Immutability {

    public static void main(String[] args) {
        System.out.println("Classes immutable by default: Wrappes.\n" +
                "Class mutalbe by default: StringBuilder\n" +
                "Use the keyword 'final' to make the primitives and objects immutable.\n");

        System.out.println("How to make yout on type immutable\n" +
                "\tDo not provide any 'setter methods\n" +
                "\tMake all fields private and final\n" +
                "\tClass final can not be extend" +
                "\tMake the constructor private and provide a public static factory method.\n" +
                "\tOn mutable types like Array, StringBuilder do NOT share references,\n" +
                "\tUsing defensive copying and advanced encapsulaton.\n");

        System.out.println("Call-by-Value\n" +
                "\tjava supports call-by-value when a methos is invoked.\n" +
                "\tIf it is a primitive, the called method can not change the value." +
                "\tIf it is a reference, the called method can change the object that the caller methos is using.");
    }
}
