package dataTypes;

import org.w3c.dom.ls.LSOutput;

public class OperatorTernary {

    public static void main(String[] args) {

        System.out.println("Ternary operator\n" +
                "\t3 operands and 2 operator\n" +
                "\tsintaxe: condition ? true : false");
        System.out.println("Used to evaluated boolean expression, just like a if statement.\n" +
                "\tInstead of execute a block of a code is the test is true,\n" +
                "\ta conditional operator will assign a value to the test variable.\n");

        int age = 19;
        String ageOfMajority=(age<18) ? "You are still a child" :  "You have reachead the age of majority";
        System.out.println(ageOfMajority);
        ageOfMajority = (age>18) ? "You have reachead the age of majority" : "You are still a child";
        System.out.println(ageOfMajority);

        boolean elderly = false;

        ageOfMajority = (age<18) ? "You are stiil a child"
                                    : (age>50) ? "You are a elderly" : "You are and adult, mas not to old";
        System.out.println(ageOfMajority);

        age=65;
        ageOfMajority = (age<18) ? "You are stiil a child"
                : (age>50) ? "You are a elderly" : "You are and adult, mas not to old";
        System.out.println(ageOfMajority);


    }


}
