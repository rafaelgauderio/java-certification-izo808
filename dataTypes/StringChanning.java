package dataTypes;

import java.util.Locale;

public class StringChanning {
    public static void main(String[] args) {
        String name = "rakaEL";

        name = name.replace("k","f").concat(" de").concat(" Luca").toUpperCase();
        System.out.println(name);

        String example = "Ma".concat("ma").substring(0,2).concat("mãe").toLowerCase();
        System.out.println(example);

    }
}
