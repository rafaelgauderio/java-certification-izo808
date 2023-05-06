package objectOriented;

public class UpcastingVersusDowncasting {

    public static void main(String[] args) {

        System.out.println("Upcasting\n" +
                "\tHappens implicitly\n" +
                "\tThis will never cause a problem because all the subclass are a type of a superclass\n" +
                "\tCar carro = new Fiat ().\n" +
                "\tAll fiat are a car, but not all cars are fiat.\n" +
                "\tThe referece type determines the methods you can call.\n" +
                "\tRead the line code right from left.\n" +
                "");

        System.out.println("Downcasting\n" +
                "\tThe subclass may have extra methods that the superclass do not have.\n" +
                "\tFiat fiatUno = (Fiat)new Car ()\n" +
                "\tThe cast has to be done explicity\n");
    }
}
