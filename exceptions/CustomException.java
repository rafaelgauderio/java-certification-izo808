package exceptions;

class AnimalException extends Exception {

}

class MammalException extends AnimalException {

}

class DogException extends MammalException {

}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("The goal here is to hide the exception that was originally generated from the client");
        try {
            bark ();
        } catch (AnimalException error) {
            error.printStackTrace();
        }
    }

    public static void bark () throws AnimalException {
        try {
            throw new MammalException();
        } catch (MammalException error) {
            throw new DogException();
        }
    }

}
