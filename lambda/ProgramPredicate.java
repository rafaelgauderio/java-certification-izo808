package lambda;

// functional interface that have only one abstract method
interface EvaluateIsNegative <T> {
    public abstract boolean isNegative(T generics);
}

public class ProgramPredicate {

    public static void main(String[] args) {

        EvaluateIsNegative<Double> lambda = (argument) -> argument < 0;

        System.out.println("Evaluate is negative: " + lambda.isNegative(-3.5));
        System.out.println("Evaluate is negative: " + lambda.isNegative(10.3));

    }


}
