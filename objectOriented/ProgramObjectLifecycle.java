package objectOriented;

public class ProgramObjectLifecycle {

    public static void main(String[] args) {
        System.out.println("Objects lifecycle\n" +
                "Local variable are kept on the stack memory (speed access)\n" +
                "Instances variables and object are kept on the heap memoru (large area of memory\n" +
                "To create objet we use the keyword 'new'\n" +
                "This allocates storage on the heap for the object\n" +
                "The garbage collector have ther responsible for reclaiming memory no longer used.\n" +
                "The garbage collector delete object wuere there are no longer any referencer reffering to them.\n");
    }
}
