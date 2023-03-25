package basics;

public class Scope {

    // class and instance variable go above all methods
    static int christAge = 33; // class
    int age = 33; // instance

    public static void main(String[] args) {

        System.out.println("Scope\n" +
                "\tJava is a strongle typed language.\n" +
                "\tIt means developers must specify a type of variables when declaring it.\n"+
                "\tJava uses block scopes. The variables create inside a scope, will be avaible only inside this scope.\n" +
                "\tBlocks can be nested and the scope will be valid within the nested blocks.\n" +
                "\tThat means, it is possible to create subblocks within blocks.");

        System.out.println("\nLocal variable can be method parameters and variables within methos.\n" +
                "\tThis variables will be avaliable only within this methods");

        int x = 17;
        { // this braces indicate a new block of code
            x =25;
            x++; { // this indicate a subblock nested to the block above
                System.out.println("Value of x: " + x);
            }
        }

        method();

        Scope scope = new Scope();
        scope.methodTwo(16);
    }

    public static void method () {
        int x = 18;
        System.out.println("Valueo of x: " + x);
    }

    public void methodTwo (int x) {
        x= x+2;
        System.out.println("value of x: "+ x);

    }

}
