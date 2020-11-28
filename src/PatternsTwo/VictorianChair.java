package PatternsTwo;

public class VictorianChair implements Chair {

    private int age;

    public int getAge () {
        return this.age;
    }

    public VictorianChair (int age) {
        this.age = age;
    }

    @Override
    public int CountLegs () {
        return 4;
    }

}
