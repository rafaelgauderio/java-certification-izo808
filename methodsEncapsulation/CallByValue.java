package methodsEncapsulation;

public class CallByValue {

    public static void main(String[] args) {

        System.out.println("Java uses Call-by-value.\n" +
                "A copy of the argument is passed to the method.\n" +
                "passing copy of a primitive: can NOT change the primitive value in the caller method.\n" +
                "passing a copy of a reference: can change the object that the caller method is looking at\n");

        AdultCitizen obj1= new AdultCitizen("Rafael de Luca", 35, "Rua do Limoeiro 96");
        changeByCopy(obj1,20, "");
        System.out.println(obj1);

        // now the object will be modified
        changeByReference(obj1,20);
        System.out.println(obj1);
    }



    public static void changeByCopy (AdultCitizen adultCitizen, int age, String address) {
        age =29; // it will not change the age ot the object, not the address;
        address= "Rua 25 de Novembro, 478";

    }

    public static void changeByReference (AdultCitizen adultCitizen, int age) {
        adultCitizen.setName("Joao da Silva");
        adultCitizen.setAge(29);
        adultCitizen.setAddress("Rua 25 de Novembro, 478");

    }
}
