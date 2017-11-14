package se02.task03;

public class NewbieSet {
    BaseThing[] baseThings;

    public NewbieSet(BaseThing[] baseThings) {
        this.baseThings = baseThings.clone();
    }
}
