package objectOriented.inheritance.subpackageProtected;

public class ProgramScienceFisction {

    public static void main(String[] args) {

        ChemistryBook.ScienceFisctionForKidsBook sfk1 = new ChemistryBook.ScienceFisctionForKidsBook("Alice no pais das maravilhas");
        System.out.println(sfk1);
        sfk1.useBook();

    }
}
