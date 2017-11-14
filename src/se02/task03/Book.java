package se02.task03;

import lombok.Getter;

public class Book extends BaseThing {
    @Getter
    protected String subject;

    public Book() {
        this(5, "Just Book", "Everything");
    }

    public Book(int price, String name, String subject) {
        this.price = price;
        this.name = name;
        this.subject = subject;
    }
}
