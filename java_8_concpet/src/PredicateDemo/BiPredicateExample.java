package PredicateDemo;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> checkSumOfTwo=(a,b)->a+b>=5;

        System.out.println();
    }
}
