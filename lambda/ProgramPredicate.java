package lambda;

import java.util.function.Predicate;

// functional interface that have only one abstract method
interface EvaluateIsNegative <T> {
    public abstract boolean isNegative(T generics);
}



public class ProgramPredicate {

    public static <T> boolean evaluate(T generics, Predicate<T> lambdaExpression) {
        return lambdaExpression.test(generics);
    }

    public static void main(String[] args) {

        EvaluateIsNegative<Double> lambda = (argument) -> argument < 0;

        System.out.println("Evaluate is negative: " + lambda.isNegative(-3.5));
        System.out.println("Evaluate is negative: " + lambda.isNegative(-8.0));
        System.out.println("Evaluate is negative: " + lambda.isNegative(10.3));

        Predicate<Integer> lambdaPredicate = (argumentos) -> argumentos <0;

        System.out.println("\nPredicate is negative: " + lambdaPredicate.test(-5));
        System.out.println("Predicate is negative: " + lambdaPredicate.test(-20));
        System.out.println("Predicate is negative: " + lambdaPredicate.test(11));

        System.out.println("Is 10 odd?  " + evaluate(10, (n) -> n %2 !=0 ));
        System.out.println("Is 10 even? " + evaluate(10, (n) -> n %2 ==0 ));
        System.out.println("Is 10 bigger than 5? " + evaluate(10, (n) -> n > 5));

        String nickName = "Rafael";
        System.out.println(nickName + " starts with R? " + evaluate(nickName, name -> name.startsWith("R")));
        System.out.println(nickName + " ends with l? " + evaluate(nickName, name -> name.endsWith("l")));
        System.out.println(nickName + " equals ignore case raFAel? " + evaluate(nickName, name -> name.equalsIgnoreCase("raFAel")));
        System.out.println(nickName + " contains fael? " + evaluate(nickName, s -> s.contains("fael")));
        System.out.println(nickName + " contains cleiton? " + evaluate(nickName, s -> s.contains("cleiton")));






    }


}
