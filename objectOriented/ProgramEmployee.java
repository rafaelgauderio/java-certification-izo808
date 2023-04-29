package objectOriented;

import java.util.ArrayList;

final class Employee { // can not create subclass of a final class and all methods are final
    private final String name; // immutable, have to be initialized because its final class
    private final int age; // immutable have to be initialized
    private final ArrayList<String> function; // mutable, have to be initialized


    // constructor is private - can not subclass this conructor
    // can not be invoked from a subclass
    private Employee(String name, int age, ArrayList<String> function) {
        this.name = name;
        this.age = age;
        // this.function = function; breaking encapsulation
        this.function = new ArrayList<String>(function);
    }

    public static Employee createNewInstance(String name, int age, ArrayList<String> function) {
        Employee employee = new Employee(name, age, function);
        return employee;
    }

    //do not create the set methos, only the get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getFunction() {
        // return function; breaking encapsulation;
        return new ArrayList<String>(this.function);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", function=" + function +
                '}';
    }
}

    public class ProgramEmployee {

        public static void main(String[] args) {
            ArrayList<String> functionsOfEmployee = new ArrayList<String>();
            functionsOfEmployee.add("seller, stockist");

            Employee e1 = Employee.createNewInstance("Rafael",35, functionsOfEmployee);

            System.out.println(e1);

            String name = e1.getName();
            int age= e1.getAge();
            functionsOfEmployee = e1.getFunction();

            System.out.println("Return, name: " +name + ", age: " +age + ", functions: " + functionsOfEmployee );

            name= "Laura Silva";
            age =45;
            functionsOfEmployee.add("freelancer");
            functionsOfEmployee.add("netword administrator");

            System.out.println("It will have no changes, encapsulation will not be break");
            System.out.println(e1);
        }
    }


