package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AnonymousArray {

    public static void main(String[] args) {
        double [] array = {3.14 , 2.16, 1.24, 4.32, 5.26, 1.00};

        // imprimindo o array
        double [] arrayFator4 = new AnonymousArray().methodArray(array,4);
        System.out.println(Arrays.toString(new AnonymousArray().methodArray(array,2)));
        System.out.println(Arrays.toString(arrayFator4));
       

    }

    // multiply the array elements by a factor
    private double [] methodArray(double [] argument, int factor) {
        double [] result = new double [argument.length];
        for(int i=0; i < result.length; i++) {
            result[i] = argument[i] * factor;
        }
        return result;
    }
}
