// создай класс как в этом коде, но на Python

package models;

import java.util.ArrayList;

public class Company {
    private ArrayList<Department> departments = new ArrayList<>();

    public void add(Department department) {
        departments.add(department);
    }
  
    public ArrayList<Department> getDepartments() {
        return this.departments;
    }

    public Department getDepartment(int index) {
        return this.departments.get(index);
    }

    public void remove(int index) {
        departments.remove(index);
    }
}
