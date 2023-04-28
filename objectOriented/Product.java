package objectOriented;

public class Product {

    private long id; // instance variable
    private String name;
    private int quantity; // instance variable
    private static int count; // class variable

    // constructor
    // 1. The same name as the class
    // 2. has no return type
    public Product () {
    }

    public Product(long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        Product.count++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String [] args) {

        System.out.println("Classes define a templane. The plan of a house\n" +
                "Object are the in-memory representation of the class. First is necessary to create an object (build a house\n" +
                "Instances are non-static\n" +
                "class variable are static.");

        Product p1 = new Product (1522,"Sabonete Líquido Lavanda", 10);
        System.out.println("count: " + count);

        Product p2 = new Product();
        p2.setId(1523);
        p2.setName("Detergente neutro");
        p2.setQuantity(25);

        System.out.println("count: " + count);
        System.out.println(p1);
        System.out.println("-------------");
        System.out.println(p2);
    }
}