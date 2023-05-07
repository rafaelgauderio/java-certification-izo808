package objectOriented.interfaces;

public interface interface1 {

    int NUMBER=1;
    public final Integer NUMBER2=1;
    final double NUMBER3= 2.0;

    public String NAME = "Rafael de Luca";

    // all the methods of a interface are public and abstract and have no body
    void method1();
    public abstract void method2();
    public double method3();
    abstract String method4();
    // public final void method5(); //modifier final are not allowed on interfaces. the method will have to be implemented

}

