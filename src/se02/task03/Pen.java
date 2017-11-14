package se02.task03;

import lombok.Getter;

public class Pen extends BaseThing {
    @Getter
    protected String color;

    public Pen(int price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public Pen() {
        this(3, "Pen", "Black");
    }
}
