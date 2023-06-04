package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        try {
            System.out.println("To the must specif to the least especif (most general)");
            throw new FileNotFoundException();
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        } catch (IOException error) {
            error.getLocalizedMessage();
        } catch (Exception error) {
            error.getMessage();
        }
    }
}
