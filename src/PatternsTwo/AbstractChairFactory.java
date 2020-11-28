package PatternsTwo;

interface AbstractChairFactory {

    VictorianChair createVictorian (int age);

    MagicChair createMagicianChair ();

    FunctionalChair createFunctionalChair ();

}
