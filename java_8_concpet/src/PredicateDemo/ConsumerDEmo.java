package PredicateDemo;

import java.util.function.Consumer;

public class ConsumerDEmo {
    public static void main(String[] args) {
        Consumer<Integer> squreMe= i-> System.out.println("Square :"+i*i);
        squreMe.accept(5);
        Consumer<Integer> doubleC=i-> System.out.println("Double:"+i*2);
        doubleC.accept(2);
        squreMe.andThen(doubleC).accept(2);
    }
}
