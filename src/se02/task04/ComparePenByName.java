package se02.task04;

import se02.task03.Pen;

import java.util.Comparator;

public class ComparePenByName implements Comparator<Pen> {
    @Override
    public int compare(Pen o1, Pen o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
