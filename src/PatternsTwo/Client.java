package PatternsTwo;

public class Client {

    public Chair chair;

    public void sit() {
        if (chair.CountLegs() > 0)
            System.out.print ("Перед вами не магический стул, можете садится.\n");
        else
            System.out.print ("Перед вами магический стул, садится нельзя.\n");
    }

    public void setChair (Chair chair) {
        this.chair = chair;
    }

}
