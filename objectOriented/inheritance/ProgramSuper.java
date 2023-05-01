package objectOriented.inheritance;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n";
    }
}

class Employee extends Person {

    private String departmentName;
    private double salary;

    public Employee(String name, String departmentName, double salary) {
        super(name);
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public void work () {
        System.out.println("The employee of the name " + super.getName() + " is working");
    }


    @Override
    public String toString () {
        return super.toString() + "Department: " + this.departmentName +"\n" +
                "salary: " + String.format("r$ %.2f",this.salary);
    }
}

class  MachineOperator extends Employee {

    private double unhealthyBonus;

    public MachineOperator(String name, String departmentName, double salary, double unhealthyBonus) {
        super(name, departmentName,salary);
        this.unhealthyBonus= unhealthyBonus;
    }

    @Override
    public String toString () {
        return super.toString() + "\nUnhealthy bonus: " + String.format("r$ %.2f", this.unhealthyBonus);
    }
}


public class ProgramSuper {

    public static void main(String[] args) {
        System.out.println("Can be used in 2 situations.\n" +
                "\t1.A constructor call its parent constructor from the superclass.\n" +
                "\tsuper([args).\n" +
                "\t2.To call a parent method. super.method([args)");

        MachineOperator mo1 = new MachineOperator("Rafael de Luca","Logistics",2500.00, 450);
        System.out.println(mo1);
        mo1.work();
    }
}


