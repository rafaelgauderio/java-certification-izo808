package dataTypes;

public class OperatorsRelational {

    public static void main(String[] args) {

        System.out.println("There are 6 relational operators\n" +
                "\t== , !=, > , >=, <, <=\n" +
                "\tThese operators result always in a boolean value.\n" +
                "\t== is the equal to operator\n" +
                "\t!= is the not equal to operator\n");

        System.out.println(5>17); //false
        System.out.println(90 != 90.0000001); //true
        System.out.println(3.1 == 3); //false
        System.out.println(4.0 == 4L); // true
        System.out.println(3 == 3.0); // true


    }
}
