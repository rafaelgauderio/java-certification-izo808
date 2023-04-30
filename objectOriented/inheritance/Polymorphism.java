package objectOriented.inheritance;

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("Pillars of Oriented Object Program\n" +
                "\tPolymorphism\n" +
                "\tInheritance\n" +
                "\tEncapsulation\n" +
                "Inheritance is a code reusability mechanism in which common properties\n" +
                "\tbetween related types are exploited by forming relationships.\n" +
                "Inheritance relationships is java are created by extending class or implementing interface.\n" +
                "Polimorphic method invocation apply only to instance methods (non-static)\n");

        System.out.println("Overloaded\n" +
                "\tAt compile time, the reference type is important in determining which overload methods\n" +
                "\tdepending of their signatures will be invoked.\n" +
                "\tThe assinature signature consists of the method name and the arguments inside the parentheses.\n" +
                "\tThe return type are NOT part of the method signature." +
                "\tÉ o ato de criar vários métodos diferentes com o mesmo nome, mas com assinaturas diferentes.\n");

        System.out.println("Overriding\n" +
                "\tWhich overridden version of the method to call is decided at runtime bases in the object type\n" +
                "\tWhich overloaded version of the method to call is based on the reference type at compile time;\n" +
                "\tÉ sobrescrever, ou seja, definir um novo comportamento para um método que herdado.\n" +
                "\tCria-se um método na classe filha com a mesma assinatura da classe pai.\n");


    }
}
