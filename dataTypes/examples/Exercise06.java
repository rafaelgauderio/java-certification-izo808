package dataTypes.examples;

public class Exercise06 {

    public static void main(String[] args){

        var b=false;
        //switch(Integer.parseInt(args[1]))  //1
        switch(Integer.parseInt("0"))
        {

            case 0 :
                b = false; //2
                System.out.println("false");
                break;

            case 1 :
                b = true; // 3
                System.out.println("true");
                break;
        }

        if(b==true) System.out.println("true"); //4

    }

}
