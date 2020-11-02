package OOPhomeworkEmployee;

import OOPhomework.Bird;

import java.util.List;

public abstract class Employee {
    private String emloyeeId;
    private String name;
    private List<Employee>employees;

    public Employee(String emloyeeId, String name) {
        this.emloyeeId = emloyeeId;
        this.name = name;
    }

    public String getEmloyeeId() {
        return emloyeeId;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee>employees) {
        this.employees = employees;
    }

}
