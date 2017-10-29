package se02.task02;

public class PrintStaffWorkSetCost{
    public static void main(String[] args) {
        Employee employee = Employee.getEmployeeByName("Vasya");
        WorkSet workSet = WorkSet.getWorkSet(employee);
        System.out.println(workSet.cost);
    }
}
