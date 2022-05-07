package PredicateDemo;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> predicateLength=s-> s.length() >= 5;
        System.out.println("Check Length"+predicateLength.test("Code decode"));

        Predicate<String> predicateEvenOdd=s-> (s.length() % 2) == 0;
        System.out.println("CheckOdd and Even :"+predicateEvenOdd.test("Code Decode"));

        //it can joined with and
        System.out.println("After merging with And :"+predicateLength.and(predicateEvenOdd).test("Code decode"));

        //it can join with or
        System.out.println("After merging with Or : "+predicateLength.or(predicateEvenOdd).test("Code Decode"));

        //it can join with negate

        System.out.println("After merging Negate :"+predicateLength.negate().test("Code Decode"));


    }
}
