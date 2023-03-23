package views;

import java.util.Scanner;

import models.Designer;

public class DesignerView extends PersonView {
    private int salary;
    private String qualification;

    public DesignerView createView() {
        super.createView();

        Scanner in = new Scanner(System.in, "CP866");

        System.out.println("----Рабочая нформация---- ");
        System.out.println("Зарплата: ");        
        this.salary = Integer.parseInt(in.nextLine());
        System.out.println("Квалификация: ");
        this.qualification = in.nextLine();

        return this;
    }
    
    public void printInfo(Designer designer) {
        super.printInfo(designer);
        System.out.println("---Корпоративная информация---");
        System.out.println(String.format("Позиция: %s", designer.getQualification()));
        System.out.println(String.format("Зарплата: %d", designer.getSalary()));
    }

    public Designer getDesigner() {
        return new Designer(age, surname, name, patronymic, telephone, salary, qualification);
    }
}
