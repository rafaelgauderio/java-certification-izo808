package objectOriented;

abstract class Pen {
    abstract void write (); // must have no implementation
}

class FountainPen extends Pen {

    @Override
    void write() { // must implement the methods of the superclass
        System.out.println("A fountain pen is writing!");
    }
}

class StereographicPen extends Pen {

    @Override
    void write() {
        System.out.println("The writer is writing with a ballpoint pen!");
    }
}

public class PenProgram {
    public static void main(String[] args) {

        // Pen caneta = new Pen() // can not instantiated an abstract class
        FountainPen canetaTineira = new FountainPen();
        canetaTineira.write();

        StereographicPen canetaEsterografica = new StereographicPen();
        canetaEsterografica.write();
    }
}
