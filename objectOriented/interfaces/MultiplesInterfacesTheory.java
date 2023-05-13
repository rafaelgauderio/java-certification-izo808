package objectOriented.interfaces;

public class MultiplesInterfacesTheory {

    public static void main(String[] args) {
        System.out.println("Java to not allow multiple inheritance.\n" +
                "A class can not extend from more than one class.\n" +
                "A class can implemented more than one interface (Java supports multiple interface implementation),\n" +
                "\tthe class will only to have to implement on the abstract methods of this interface.\n" +
                "This can create the scenario know as the 'Diamond of Death'.\n" +
                "\nDiamond of Death\n" +
                "The diamond if formed when a class B and C extend from A. In addition, D extends from both B and C.\n" +
                "A is at the top of the diamong and D is at the bottom of the diamond.\n" +
                "If class A have a method m1 ad B and C override  this method m1.\n" +
                "Then D has inherited two different implementations of the method m1.\n" +
                "The Diamong of death is NOT possible on Java.\n" +
                "If we code a class that implemented interfaces that override identical concrete methods,\n" +
                "\tthe compiler will make sure that you override the method in the class that we are coding.\n");

        MultipleInheritance mi = new MultipleInheritance();
        System.out.println(mi.method1()); //22

    }

    interface interfaceOne {
        public default int method1() {
            return 17;
        }
    }

    interface interfaceTwo {
        default int method1() {
            return 12;
        }

        default int methodDifferent() {
            return 22;
        }
    }

}
class MultipleInheritance implements MultiplesInterfacesTheory.interfaceOne, MultiplesInterfacesTheory.interfaceTwo {
    @Override
    public int method1() {
        //return interfaceOne.super.method1();
        //return 50;
        return MultiplesInterfacesTheory.interfaceTwo.super.methodDifferent(); // the compiter force to implement the method1
    }
}