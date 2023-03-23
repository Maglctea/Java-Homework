package models;

import java.util.ArrayList;

public class Department <T extends Person> {
    private String name;    
    private ArrayList<T> employees = new ArrayList();
    private String departmentType;

    public Department(String name, String departmentType) {
        this.name = name;
        this.departmentType = departmentType;
    }

    public void add(T employee) {
        employees.add(employee);
    }

    public void remove(int index) {
        employees.remove(index);
    }

    public String getName() {
        return this.name;
    }

    public String getDepartmentType() {
        return this.departmentType;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<T> getEmployees() {
        return this.employees;
    }

    public Person getEmployees(int index) {
        return this.employees.get(index);
    }
}
  