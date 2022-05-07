package PredicateDemo;

import java.util.function.Function;

public class FuncationDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> integerFunction=i->i*i;
        System.out.println("Squre Of 5:"+integerFunction.apply(5));
    }
}
