package methodsEncapsulation;

public class Constructor {

    public static void main(String[] args) {

        System.out.println("Constructors\n" +
                "\tIs executed by the keyword 'new'\n" +
                "\tIt is a special type of method.\n" +
                "\tHave the same name as the class.\n" +
                "\tHas no returned type.\n" +
                "\tCan be also be overload, as like any method.\n" +
                "\tIf no constructor is provide, a default one will be provide by the compiler.\n");
        new Dog (); // We lose this object that are no referenced to no variable
        Dog thor = new Dog();
        System.out.println(thor);
        Lion firstLion = new Lion("Simba");
        System.out.println(firstLion);

    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog extends Animal {

    //  palavra-chave super em Java é uma variável de referência usada
    //  para referenciar o objeto da classe pai
    public Dog() {
        super("Rex");
    }
}

class Lion extends Animal {
    public Lion (String nameLocal) {
        super(nameLocal);
    }
}