package models;

public class Designer extends Person {

    private int salary;
    private String qualification;

    public Designer(int age, String surname, String name, String patronymic, String telephone, int salary,
            String qualification) {
        super(age, surname, name, patronymic, telephone);
        this.salary = salary;
        this.qualification = qualification;
    }

    public int getSalary() {
        return this.salary;
    }
    
    public String getQualification() {
        return this.qualification;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
}
