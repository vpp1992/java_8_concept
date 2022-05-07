package PredicateDemo;

import java.util.function.Predicate;

public class PredicateFuncationDemo {
    public static void main(String[] args) {
        Predicate<String> predicateCheckLength= s->s.length() >= 5;
        System.out.println("The Length of string is greater than 5"+predicateCheckLength.test("Code decode"));
    }
}
