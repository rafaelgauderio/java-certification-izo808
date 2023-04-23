package methodsEncapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        System.out.println("Encapsulation is one the pillars ot the object oriented programming (OOP).\n" +
                "\tIt is defined whereby outside components can not access internal state without\n" +
                "\tthe components knowledge and permission.\n" +
                "\tIt is the same as 'data hiding'\n");

        System.out.println("There are 4 modifiers: private, packege-private, protected, public.\n" +
                "\tprivate: accessible ony inside the class.\n" +
                "\tpackage-private: accessible to the class and oher class in the same package.\n" +
                "\tprotected: accessible in the same package and to children of the class\n" +
                "\tpublic: available everythere\n");

        AdultCitizen ac1 = new AdultCitizen("",29,"Rua Assis Brasil");
        //ac1.name = "Claudio da Silva"; // private parameter can not be access directly
        ac1.setName("Rafael de Luca");

        OldCitizen ac2 = new OldCitizen("Old John",75);
        System.out.println(ac1);
        System.out.println(ac2);


    }



}
