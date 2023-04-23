package methodsEncapsulation;

public class AdultCitizen {

    private String name;
    private int age;
    protected String address;

    public AdultCitizen () {

    }

    public AdultCitizen(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public AdultCitizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isAdult(age)== true) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAdult (int age) {
        if(age >=21)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "AdultCitizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

class OldCitizen extends AdultCitizen {

    // address is protected, but can be access directly to a children class
    public OldCitizen (String name, int age) {
        super(name, age);
        address = "Live in the asylum";
    }

}

