package arrays;

class Plane {

}

public class ArrayEquivalent {


    public static void main(String[] args) {

        System.out.println("Array of object references");
        Car[] cars = new Car[10];
        Fiat[] fiats = new Fiat[10];
        String[] names = new String[10];

        cars = fiats; // ok fiat is a car
        //names = fiats; // compilance error
        System.out.println("O instanceof é um operador que permite testar se um objeto\n" +
                "\té uma instância de um tipo específico de uma classe, subclasse ou interface");


        System.out.println(cars instanceof Car[]);
        System.out.println(fiats instanceof Car[]);
        System.out.println(names instanceof String[]);

        cars = null; // array refer to nowhere
        System.out.println(cars instanceof Car[]); //false

        System.out.println("\nArray of interface references");
        ExecutiveCar[] executiveCars = new ExecutiveCar[5];
        executiveCars = fiats; // ok, fiat implements executiveCar

        Car [] inventoryOfCars = {new Fiat("Bravo"), new Ford("Focus")};
        Volkswagen [] inventoryOfVolks = {new Volkswagen("Golf"), new Volkswagen("New Beatle")};

        //inventoryOfVolks = inventoryOfCars // a car in not necessarily a volkswagem
        inventoryOfVolks = (Volkswagen[]) inventoryOfCars; // classCastException



    }
}
