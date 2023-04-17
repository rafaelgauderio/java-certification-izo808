package dataTypes;

public class StringBuilderApi {

    public static void main(String[] args) {

        System.out.println("StringBuilder API methods");

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16 is de default capacity
        sb.append("Rafae");
        sb.insert(5,"l");
        System.out.println(sb.toString());
        System.out.println(sb.length()); //6
        System.out.println(sb.capacity()); //16
        sb.append("de Luca da Silva Lerias");
        System.out.println(sb);
        System.out.println(sb.length()); //29
        System.out.println(sb.capacity()); // 16 *2 + 2

        System.out.println(sb.delete(0,6)); // delete rafael
        System.out.println(sb.indexOf("x")); // -1 there is no f on the string
        System.out.println(sb.indexOf("e")); // 1 , index is zero-based


    }
}
