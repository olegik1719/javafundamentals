package se02.task02;

public interface Writeable {
    default int getCost() {
        return 1;
    }
}
