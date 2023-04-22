package controllingFlow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Loops {

    public static void main(String[] args) {

        traditionalFor();
        enhancedFor();
        whileLoop();
    }

    public static void traditionalFor () {

        System.out.println("Traditional for iteration");
        for(int i=0 ; i <=10; i = i+2) {
            System.out.println(i);
        }
        System.out.println("--------------------------");

        byte j;
        for(j=0 ; j >= -10 ; j--) {
            System.out.println(j);
        }
        System.out.println("--------------------------");

        for(int x=0 , y=0 ; x<7 && y <10; x++, y++) {
            // print until x =6 and y =6
            System.out.println(x + " " + y);
        }
        System.out.println("--------------------------");
    }

    public static void enhancedFor() {
        System.out.println("For each iteration");

        List<String> names = new ArrayList<String>();
        names.add("Rafael");
        names.add("Claudia");
        names.add("Juliana");
        names.add("Atena");

        for(String nome : names) {
            System.out.println(nome);
        }
        System.out.println("-----------------");

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i=0 ; i<=15 ; i= i+3){
            numbers.add(i);
        }

        for(var nickname : numbers) {
            System.out.println(nickname);
        }
    }

    public static void whileLoop () {

        System.out.println("While loops");
        int x=1;
        while(x<=10) {
            System.out.println("Rafael de Luca " + x);
            x++;
            // It will print Rafael de Luca 10 times
        }

        int y=15;
        while(y==20) {
            // it will never enter on the loop 15 !=20
            System.out.println(y);
            y=y+5;
        }

        System.out.println("------------------");
    }
}
