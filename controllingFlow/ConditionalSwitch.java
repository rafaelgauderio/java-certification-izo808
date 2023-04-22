package controllingFlow;

public class ConditionalSwitch {

    public static void main(String[] args) {
        System.out.println("A switch statement is an elegat solution to a complex if-else statement.\n" +
                "The types variables of switch are byte, char, short, int, String, enum, var and his respectives Wrappes.\n" +
                "Must be a compile time constant in the switch options");
        switchSport("VOLLEYBALL");
        switchSport("Soccer");
        switchSport("PunhoBall");
        switchSport("Basketball");
        System.out.println("-------------");
        implicitCasting();
    }

    public static void switchSport(String sport) {

        switch (sport.toLowerCase()) {
            case "soccer":
                System.out.println("I play soccer");
                break;
            case "volleyball":
                System.out.println("I play volleyball");
                break;
            case "basketball":
                System.out.println("I like to play basketball");
                break;
            default:
                System.out.println("Unknown sport");
                break;
        }

    }

    public static void implicitCasting() {
        byte x=4;
        final int y = 10;  // compile-time constant
        int i = 10;         // not a constant
        final int w;        // not initialied at compile-time
        w = 25;             //   - initialied at runtime
        Byte byte1 = 17;    // Byte byte1 = new Byte(17);
        final int a =35;

        switch(x){//byte
            case 1+3:   // compile-time constant, int -> byte
                System.out.println("x = " + x);
                break;
            case y:    // compile-time constant, int -> byte
                System.out.println("y = " + y);
                break;
            //case i:     // must be a compile time constant
            //case byte1: // must be a compile time constant
            //case w:     // must be a compile time constant
            case a:
                System.out.println("a = " + a);
                break;
        }


    }

}
