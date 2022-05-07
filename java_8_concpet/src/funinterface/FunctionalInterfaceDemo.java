package funinterface;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void singleAbstMethod();
    default void printName(){
        System.out.println("Welcome to Code Decode");
    }
}
