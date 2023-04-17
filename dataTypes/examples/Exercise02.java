package dataTypes.examples;

public class Exercise02 {

    public static void main(String[] args) {

        int rate = 10;
        int t = 5;

        //float amount = 1000.0f;
        double amount = 1000.0;

        for(int i=0; i<t; i++){

            amount = amount*(1 - rate/100); // 10/100 = zero
            System.out.println(amount);
        }

        System.out.println(amount); // 1000.0
    }
}
