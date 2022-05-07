package PredicateDemo;

import java.util.function.Function;

public class FunctionalChainning {
    public static void main(String[] args) {

        Function<Integer,Integer> doubel=i->i*2;
        System.out.println("Double doubel :"+doubel.apply(2));

        Function<Integer,Integer> cube=i->i*i*i;
        System.out.println("Cube :"+cube.apply(2));

        System.out.println("First doubling using apply "+doubel.andThen(cube).apply(3));
        System.out.println("First cube using apply "+doubel.compose(cube).apply(2));


    }
}
