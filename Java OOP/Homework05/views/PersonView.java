package views;

import java.util.Scanner;

import models.Person;

public class PersonView {
    public int age;
    public String surname;
    public String name;
    public String patronymic;
    public String telephone;

    public int getMenuItem() {
        System.out.println("1). Информация сотруднике");
        System.out.println("0). Назад");

        Scanner in = new Scanner(System.in, "CP866");
        return Integer.parseInt(in.nextLine());
    }

    public void printInfo(Person person) {
        System.out.println("-------Личная информация-------");
        System.out.println(String.format("Фамилия: %s", person.getSurname()));
        System.out.println(String.format("Имя: %s", person.getName()));
        System.out.println(String.format("Отчество: %s",person.getPatronymic()));
        System.out.println(String.format("Телефон: %s", person.getTelephone()));
        System.out.println(String.format("Возраст: %d", person.getAge()));
    }

    public PersonView createView() {
        Scanner in = new Scanner(System.in, "CP866");

        System.out.println("----Личная информация---- ");
        System.out.println("Фамилия: ");
        this.surname = in.nextLine();
        System.out.println("Имя: ");
        this.name = in.nextLine();
        System.out.println("Отчество: ");
        this.patronymic = in.nextLine();
        System.out.println("Телефон: ");
        this.telephone = in.nextLine();
        System.out.println("Возраст: ");
        this.age = Integer.parseInt(in.nextLine());
        return this;
    }

    
}
