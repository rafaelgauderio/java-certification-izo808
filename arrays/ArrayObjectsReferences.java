package arrays;

import java.util.Arrays;

interface ExecutiveCar {
    public abstract void speedUp ();
}

class Car {
    private String name;
    private String string;

    public Car() {

    }

    public Car(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return  "name='" + name;
    }
}


class Ford extends Car implements ExecutiveCar{
    public Ford(String name) {
        super(name);    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up a ford car!");
    }
}

class Fiat extends Car implements ExecutiveCar {

    public Fiat(String name) {
        super(name);
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up a fiat car!");
    }
}

class Volksmagen extends Car {
    public Volksmagen(String name) {
        super(name);
    }
}

    public class ArrayObjectsReferences {


            public static void main(String[] args) {

            System.out.println("The array eements are references variables of the array type.\n" +
                    "If the declared type is a class, you can put references of the declared type in the array.\n" +
                    "If the array is declared as an interface type, the array elements can refer to any instance of\n" +
                    "\tany class that implements the declared interface.\n" +
                    "Do not concernet with array elements but rather the REFERENCE TO THE ARRAY OBJECT itself.\n" +
                    "An a double array reference can not be assignet to anything that is not an double array, not even an double value.\n" +
                    "ARRAY IS A OBJECT, so an double array reference can not refet to an double primitive.\n" +
                    "");

            // array tendo referências como elementos. classes são sempre variáveis do tipo ponteiro

            Fiat uno = new Fiat("Uno Mile");
            Ford escort = new Ford ("Escort Guaruja");
            Car [] cars = {uno, new Car("Ferrari"), new Fiat("Stilo"), new Ford("Mustang"), escort, new Volksmagen("Gol Geração 4")};

            System.out.println(Arrays.toString(cars));

            Car [] cars2 = {new Volksmagen("Passat alemão"), new Fiat("Uno mile 2005")};
            System.out.println(Arrays.toString(cars2));

        }

}

