package se02.task02;

public class WorkSet {
    private Writeable[] workSet;
    public int getCost(){
        int cost = 0;
        for (Writeable thing:workSet){cost+=thing.getCost();};
        return cost;
    }

    public WorkSet(){
        workSet = new Writeable[10];
    }
}
