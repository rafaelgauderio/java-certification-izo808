package exceptions;

public class ProgramStackOrder {

    public static void main(String[] args) {
        System.out.println("The last method called is at the top of the stack and the first method is at the bottom.\n" +
                "In the botton of the stack will be main\n" +
                "Stack = FILO = First In, Last Out");
        primeiro();
    }

    public static void primeiro () {
        segundo();
    }

    public static void segundo () {
        terceiro();
    }

    public static void terceiro () {
        try {
            int number = 17/0 ; // AritmeticException
        } catch (ArithmeticException error) {
            error.printStackTrace();
        }

    }

}
