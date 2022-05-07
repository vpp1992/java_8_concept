package funinterface;

public class MethodRefExample {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImplementation;
        functionalInterfaceDemo.singleAbstMethod();

    }
}

class Test{
    public static void testImplementation(){
        System.out.println("this is test implementation of your abstaract method");
    }
}
