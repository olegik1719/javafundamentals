package se02.task02;

public class Employee {
    WorkSet workSet;
    private String name;

    public String getName() {
        return name;
    }

    public WorkSet getWorkSet() {
        return workSet;
    }

    public Employee() {
        name = "";
    }

    public Employee(String name) {
        this.name = name;
    }
}
