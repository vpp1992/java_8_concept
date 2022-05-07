package funinterface;

public class DiamondProblemClass implements DaimondProblemInterface2,DiamondProbelmInterface1  {
    @Override
    public void m1() {
        DaimondProblemInterface2.super.m1();
        DiamondProbelmInterface1.super.m1();

    }

    public static void main(String[] args) {
        DiamondProblemClass diamondProblemClass=new DiamondProblemClass();
        diamondProblemClass.m1();

    }


}
