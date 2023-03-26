package basics;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Inform your age: ");
        int age = input.nextInt();

        System.out.println("Your name is " + name + ", and your age is "+ age + ".\n");

        // to execute program in the console
        // navegate to the folder the class the do the command lines
        // javac Console.java
        // java COnsole.java


    }
}
