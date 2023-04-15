package dataTypes;

public class Wrappers {

    public static void main(String[] args) {

        System.out.println("Wrapper as classes so we can use primative data types as OBJECTS.\n" +
                "Each privitive Data type has a corresponding Wrapper class.\n" +
                "\tbyte    = Byte\n" +
                "\tshort   = Short\n" +
                "\tint     = Integer\n" +
                "\tlong    = Long\n" +
                "\tfloat   = Float\n" +
                "\tdouble  = Double\n" +
                "\tboolean = Boolean\n" +
                "\tchar    = Character\n");
        /////////////////

        int int1= Integer.parseInt("17");
        float float1 = Float.parseFloat("17.12");
        double double1 = Double.parseDouble("3.1415");
        boolean boolean1 = Boolean.parseBoolean("true");
        System.out.println("Parse\n" +
                int1 +"\n" + float1  +"\n" + double1 + "\n" + boolean1);
        ///////////////

        Integer int2 = Integer.valueOf(17);
        Integer int3 = Integer.valueOf("1712"); // overloaded
        Integer int4 = Integer.valueOf("B",16); // informing the base
        Integer int5 = Integer.valueOf("35",8);
        System.out.println("\nValueof() in better than using a constructor");
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4); // 11
        System.out.println(int5); // 29
        ////////////////

        Integer int6 = 15;  // auto-boxing = empacotar
        Integer int7 = (int)15; //boxing
        Object obj1 = int6;

        int int8 = Integer.valueOf(3); // auto -unboxing = desempacotar
        int int9 = Integer.parseUnsignedInt("3");
        Object obj2 = 1712;
        int int10 = (int)obj2; //unboxing has to be explicit

        System.out.println("Boxing\n" +
                "\tBoxing is the conversion of a value type to a object type");
        System.out.println(int7); //15
        System.out.println(obj1); //15


        System.out.println("\nUnboxing\n" +
                "\tUnboxing is an explict conversion from type objet to  value type");
        System.out.println(int8); //3
        System.out.println(int9); //3
        System.out.println(obj2); //17
        System.out.println(int10); //17




    }
}
