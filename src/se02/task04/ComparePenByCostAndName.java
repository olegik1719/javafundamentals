package se02.task04;

import se02.task03.Pen;

import java.util.Comparator;

public class ComparePenByCostAndName implements Comparator<Pen>{
    public int compare(Pen o1, Pen o2){
        return (new ComparePenByCost())
                .thenComparing(new ComparePenByName())
                .compare(o1,o2);
//        ComparePenByCost comparePenByCost = new ComparePenByCost();
//        return comparePenByCost.compare(o1,o2) == 0
//                ? new ComparePenByName().compare(o1,o2)
//                : comparePenByCost.compare(o1,o2);
    }


}
