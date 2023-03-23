package models;

public abstract class Person  {
    protected int age;
    protected String surname;
    protected String name;
    protected String patronymic;
    protected String telephone;

    public Person(int age, String surname, String name, String patronymic, String telephone) {
        this.age = age;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
    }

    public int getAge() {
        return this.age;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getPatronymic() {
        return this.patronymic;
    }
    
    public String getTelephone() {
        return this.telephone;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
