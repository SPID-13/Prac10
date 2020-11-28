package PatternsTwo;

public class FunctionalChair implements Chair {

    public int sum (int a, int b) {
        return a+b;
    }

    @Override
    public int CountLegs () {
        return 2;
    }

}
