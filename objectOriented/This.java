package objectOriented;

public class This {



    public void main(String[] args) {
        System.out.println("Use to differentiates the object´s attibute from the constructor´s parameter.\n" +
                "Is is a reference to the object itself.\n" +
                "Use alto to pass the object itself in a method call.\n");

        Produto produto01 = new Produto();
        produto01.method("table", this);


    }

    class Produto {
        private String name;
        private double price=0.0;

        private static int quantity=0;

        public Produto(int quantity) {
        }
        public Produto() {
            this(quantity);
        }
        public Produto (String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void method (String name, This object) {
            // using the object itself as a parameter
        }

    }
}




