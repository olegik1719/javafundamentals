package se02.task04;


import se02.task03.Pen;

import java.util.Comparator;

public class ComparePenByCost implements Comparator<Pen> {
    @Override
    public int compare(Pen o1, Pen o2) {
        return o1.getPrice() > o2.getPrice() ? 1
                : (o1.getPrice() == o2.getPrice()) ? 0 : -1;
    }
}
