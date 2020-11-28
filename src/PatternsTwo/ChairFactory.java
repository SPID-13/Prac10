package PatternsTwo;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public VictorianChair createVictorian (int age) {
        return new VictorianChair (age);
    }

    @Override
    public MagicChair createMagicianChair () {
        return new MagicChair ();
    }

    @Override
    public FunctionalChair createFunctionalChair () {
        return new FunctionalChair ();
    }

}
