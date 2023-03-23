package views;

import java.util.Scanner;

import models.Programmer;

public class ProgrammerView extends PersonView {
    private int salary;
    private String qualification;

    public ProgrammerView createView() {
        super.createView();

        Scanner in = new Scanner(System.in, "CP866");

        System.out.println("----Рабочая нформация---- ");
        System.out.println("Зарплата: ");
        this.salary = Integer.parseInt(in.nextLine());
        System.out.println("Квалификация: ");
        this.qualification = in.nextLine();

        return this;
    }

    public Programmer getProgrammer() {
        return new Programmer(this.age, this.surname, this.name, this.patronymic, this.telephone, this.salary,
                this.qualification);
    }

    public void printInfo(Programmer programmer) {
        super.printInfo(programmer);
        System.out.println("---Корпоративная информация---");
        System.out.println(String.format("Позиция: %s", programmer.getQualification()));
        System.out.println(String.format("Зарплата: %d", programmer.getSalary()));
    }

}
