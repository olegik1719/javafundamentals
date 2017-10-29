package se02.task02;

public class Staff {
    private Employee[] employees;
    public Employee getEmployeeByName(String name){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)){
                return employees[i];
            }
        }
        return null;
    }
}
