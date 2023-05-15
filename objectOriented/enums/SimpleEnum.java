package objectOriented.enums;

import java.sql.SQLOutput;

public class SimpleEnum {

    public enum Season {
        SUMMER,
        WINTER,
        AUTUMN,
        SPRING;

    }

    public static void main(String[] args) {

        System.out.println("Enumerations are very useful when we hava a type that have a finite set o values.\n" +
                "Enumerations provide a type-safety solition by restricting the object instances allowed.\n" +
                "We can use numeric ou String constants.\n" +
                "The values of an enum are expressed as constants imn capital letters.\n" +
                "Enumerations are like static and final constants.\n" +
                "Enum implicity extend java.lang.Enum. So enum can not be extend, because jaa do not support multiple inheritance.\n" +
                "Comple enum can contain fields, methods and constructors\n" +
                "Enum constructors are implicitly private\n" +
                "We can not new an enum.\n" +
                "Each of the enum values get and ordinal value starting in index zero.\n" +
                "Enum are type, not a primitive.\n");

        // Season season = new Season(); // Enum types cannot be instantiated

        Season verao = Season.SUMMER;
        System.out.println(verao);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);

        System.out.println(verao == Season.SUMMER); // true
        System.out.println(verao.equals(Season.SUMMER));

        Season value01 = Season.valueOf("SUMMER");
        Season value02 = Season.valueOf("WINTER");
        Season value03 = Season.valueOf("AUTUMN");
        Season value04 = Season.valueOf("SPRING");

        System.out.println("valueOf");
        System.out.println(value01);
        System.out.println(value02);
        System.out.println(value03);
        System.out.println(value04);

        System.out.println("-------------");
        for(Season nickname : Season.values()) {
            System.out.println(nickname.ordinal());
            System.out.println(nickname.name());
            System.out.println("-------------");
        }

    }


}