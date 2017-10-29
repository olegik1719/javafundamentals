package se02.task02;

public class PrintStaffWorkSetCost{
    public static void main(String[] args) {
        Staff staff = new Staff();
        Employee employee = staff.getEmployeeByName("Vasya");
        WorkSet workSet = employee.getWorkSet();
        System.out.println(workSet.getCost());
    }
}
