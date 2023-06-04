package exceptions;

public class ProgramTryCatch {

    public static void drinkJuice () {
        System.out.println("Drinking a refresh juice!");
    }

    public static void spillJuice () {
        System.out.println("Spiling juice on the table...");
        throw new RuntimeException(); // essa parte do código está tratando a exceção par ao código continuar a executando.
    }

    public static void watchingTheRestOfTheVideo () {
        System.out.println("Watching the resto of the video.");
    }

    public static void main(String[] args) {
        try {
            spillJuice();
            System.out.println("This path of the code will never be reached.");
            System.out.println(17);
            System.out.println("Not even this part");
        } catch (RuntimeException error) {
            error.getMessage();
            drinkJuice();
        }
        watchingTheRestOfTheVideo();
    }
}
