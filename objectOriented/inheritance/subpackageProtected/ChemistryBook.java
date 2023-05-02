package objectOriented.inheritance.subpackageProtected;

import objectOriented.inheritance.subpackgeProtectedBook.Book;
import objectOriented.inheritance.subpackgeProtectedBook.ScienceFictionBook;
// have to import the class book from  different package

class ChemistryBook extends Book {
    public ChemistryBook(String name) {
        super(name);
    }

    public void useBook() {
        read(); // different package, access via inheritance;
        this.read();

        ChemistryBook cb1 = new ChemistryBook("Skoog química analítica");
        cb1.read();

        Book book1 = new Book("Livro da Química");
        // book1.read() // can not access the method. is is not protected, not public

    }


    class ChemistryPhysicistBook extends ChemistryBook {

        public ChemistryPhysicistBook(String name) {
            super(name);
        }

        public void useBook() {
            read();
            this.read();

            // new Book().read(); // no access
            // new ChemistryBook().read(); no acess
            new ChemistryPhysicistBook("Atkins - princípio da físico química").read();
        }
    }

    static class ScienceFisctionForKidsBook extends ScienceFictionBook {

        public ScienceFisctionForKidsBook(String name) {
            super(name);
        }

        public void useBook() {
            read();
            System.out.println();
            doAnnotations(); // can access via inheritance

        }
    }
}





