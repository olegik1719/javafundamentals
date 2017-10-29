package se02.task02;

public class Pen implements Writeable {
    private int price;

    public int getCost(){
        return 0;
    }

    public Pen(){
        this(0);
    }

    public Pen(int cost){
        price = cost;
    }
}
