package funinterface;

public class InterfaceDemoWithOverriddenExample implements InterfaceDemo {
    public void printName(){
        System.out.println("Welcme to overridden method by code decode");
    }
    public static void main(String[] args) {
        InterfaceDemoWithOverriddenExample defaultdemo = new InterfaceDemoWithOverriddenExample();
        defaultdemo.printName();



    }
}
