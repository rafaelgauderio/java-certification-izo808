package methodsEncapsulation;

public class StaticKeyword {

    public static void main(String[] args) {
        System.out.println("Use word static on this two situations.\n" +
                "\t1. One copy to be shared by all instances.\n" +
                "\t2. Access a method without having to instantiate a object\n" +
                "Use ClassName.staticMember to access static members.\n");

        Employee e1 = new Employee("Rafael de luca");
        System.out.println(e1 + ", count: " + Employee.getCount());

        Employee e2 = new Employee("Claudia da Silva");
        System.out.println(e2 + ", count: " + Employee.getCount());

        Employee e3 = new Employee("Laurinha da Silva");
        System.out.println(e3 + ", count: " + Employee.getCount());
    }

}

class Employee {
    // tem que usar a keyword static  na variável count para não instanciar a variavel count em zero
    // cada vez que isntanciar um objeto employee

    private String name;
    private static int count;

    public Employee () {

    }
    public Employee (String name) {
        this.name = name;
        Employee.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return Employee.count;
    }

    /*
    public void setCount(int count) {
        this.count = count;
    }
     */

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +'}';
    }
}
