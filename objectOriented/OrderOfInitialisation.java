package objectOriented;

public class OrderOfInitialisation {

    public static void main (String [] args) {

        new Eletronic();   // executed Person(Lara). Eletronic()

        System.out.println("\nVai executar primeiros os membros estaticos e apenas uma vez.\n" +
                "Depois os membros instancias são criados, todas as vezes que são chamados são executados.\n" +
                "E, por último, os construtores.");
        System.out.println("Person lara é executada depois porque não é static e executada mais de uma vez, apenas de aparecer primeiro na ordem do código");
    }
    static Candy candy1 = new Candy(5); // Person(Rafael), Person(Atena) , Candy(5)
    static Eletronic eletronc1 = new Eletronic(); // Person(Julia), Person(Larissa), Person(Lara), Eletronic()



}
class Person {
    Person (String name) {
        System.out.println("Constructor Person: " + name);
    }
}

class Candy {
    static Person p1 = new Person("Rafael static");
    Candy(int quantity) {
        System.out.println("Candy constructor, quantity: " + quantity);
    }
    static Person p2 = new Person("Atena static");
}

class Eletronic {
    Person p3 = new Person("Lara instance");
    static Person p4 = new Person("Julia static");
    Eletronic () {
        System.out.println("Constructor Eletronic");
    }
    static Person p5 = new Person("Larissa static" );
}
