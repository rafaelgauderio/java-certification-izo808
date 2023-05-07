package objectOriented;

class Animal {
    protected String name="Generic Animal";

    public void eat () {
        System.out.println("A animal is eating.");
    }

    public void move() {
        System.out.println("By default a animal move by walking");
    };

    public static void walk () {
        System.out.println("A animal is walking"); // static methods can not be override
    }
}

class Fish extends Animal {

    private String name = "Fish";

    @Override
    public void eat() {
        //super.eat(); // inherited from the superclass
        System.out.println("A fish is eating");
    }

    public static void walk () {
        System.out.println("A Fish can not walk."); // static methods can not be override
    }

    @Override
    public void move () {
        System.out.println("A fish move by swimming");
    }


}

public class ProgramCasting {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat(); // polymorphism -> object type
        animal1.move(); // polymorphism -> object type
        Animal.walk(); // static
        animal1.walk(); // static method reference type

        System.out.println("------------");

        Animal fish1 = new Fish();
        fish1.eat();
        fish1.move();
        Fish.walk(); // static

        //Fish fish2 = (Fish) new Animal(); // error on runtime, even upcasting casting
        //Fish fish3 = (Fish) animal1; // error on runtime, even upcasting

        System.out.println("----------------");

        Fish fish4 = (Fish) fish1; // fish1 refence a type Fish. will not have a error on runtime
        fish4.eat();   // from the fish
        fish4.move();   // from the fish
    }
}
