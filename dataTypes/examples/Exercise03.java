package dataTypes.examples;

public class Exercise03 {

    int i;

    //constructor
    public Exercise03(int i)
    { this.i = i;  }

    public String toString(){

        if(i == 0) return null;
        else return ""+i;

        // == reference to the memory reference
        // equals reference to the content of the string

    }

    public static void main(String[ ] args){

        Exercise03 t1 = new Exercise03(0);

        Exercise03 t2 = new Exercise03(2);
        System.out.println(t2); // 2
        System.out.println(""+t1); //null
    }
}

