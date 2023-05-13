package objectOriented.interfaces;

interface interfaceA {
    default void speak  () {
        System.out.println("A person from INTERFACE A is speaking");
    }
}

interface interfaceB {
    default void speak () {
        System.out.println("A person from INTERFACE B is speaking");
    }

    default void walk () {
        System.out.println("A person from INTERFACE b is walking\n");
    }
}

public class ProgramMultipleInterface implements interfaceA, interfaceB{
    @Override
    public void speak() {
        interfaceA.super.speak();
        interfaceB.super.speak();
        interfaceB.super.walk();
    }

    public static void main(String[] args) {

        System.out.println("The same code will be executed 3 times and than a method can only interfaceB have");

        new ProgramMultipleInterface().speak();
        ((interfaceA)new ProgramMultipleInterface()).speak();
        ((interfaceB)new ProgramMultipleInterface()).speak();

        ((interfaceB)new ProgramMultipleInterface()).walk();
        //((interfaceA)new ProgramMultipleInterface()).walk(); error interfaceA do not have the method walk



    }
}
