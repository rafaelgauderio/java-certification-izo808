package objectOriented.inheritance;

class Vehicle extends Object{

    public String toString () {
        return "Generic vehicle";
    }
}

 class Plane extends Vehicle {
    public String toString() {
        return "Generic Plane";
    }
}

class Car extends Vehicle {

    private String assembller;

    public Car () {
    }

    public String getAssembller() {
        return assembller;
    }

    public void setAssembller(String assembller) {
        this.assembller = assembller;
    }

    public String toString() {
        return "Car {assembller: "  + this.assembller +
                "}";
    }
}

public class ProgramVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        System.out.println(v1); // it will print the toString fo the superclass Vehicle

        Plane p1 = new Plane();
        System.out.println(p1); // it will print the toString fo the subclass Plane

        Car c1 = new Car();
        c1.setAssembller("Fiat"); // it will print the toString fo the subclass Plane
        System.out.println(c1);
    }
}



