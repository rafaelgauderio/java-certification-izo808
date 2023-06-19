package arrays;

import java.util.Arrays;

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


class Ford extends Car {
    public Ford(String name) {
        super(name);    }

}

class Fiat extends Car {

    public Fiat(String name) {
        super(name);
    }
}

    public class ArrayObjectsReferences {


            public static void main(String[] args) {

            System.out.println("The array eements are references variables of the array type.\n" +
                    "If the declared type is a class, you can put references of the declared type in the array.\n" +
                    "If the array is declared as an interface type, the array elements can refer to any instance of\n" +
                    "\tany class that implements the declared interface.\n" +
                    "");

            // array tendo referências como elementos. classes são sempre variáveis do tipo ponteiro

            Fiat uno = new Fiat("Uno Mile");
            Ford escort = new Ford ("Escort Guaruja");
            Car [] cars = {uno, new Car("Ferrari"), new Fiat("Stilo"), new Ford("Mustang"), escort};

                System.out.println(Arrays.toString(cars));

        }

}

