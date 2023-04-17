package dataTypes.examples;

public class Exercise04 {
    public static int operators(){

        int x1 = -4;

        int x2 = x1--; //x2 = -4 , x1 = x1 - 1 = -5
        System.out.println("x1: "+ x1); // -5
        System.out.println("x2: " + x2); // -4

        int x3 = ++x2; //x2 + 1 = -3 , x3 = -3 = x2
        System.out.println("x3: "+ x3);
        System.out.println("x2: " + x2); // -3

        if(x2 > x3){
            --x3;
            System.out.println("x3: "+ x3); // do not change
        }else{
            x1++;
            System.out.println("x1: "+ x1); // x1 = -5 + 1 = -4
        }
        System.out.println(x1 + " " + x2 + "" + " " + x3);
        // -4 -3 - 3
        return x1 + x2 + x3;

    }

    public static void main(String[] args) {

        System.out.println(operators());

    }

}

