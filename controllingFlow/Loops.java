package controllingFlow;

public class Loops {

    public static void main(String[] args) {

        traditionalFor();
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
}
