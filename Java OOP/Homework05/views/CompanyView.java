package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Company;
import models.Department;

public class CompanyView {
    
    public int getMenuItem() {
        System.out.println("1). Все отделы");
        System.out.println("2). Выбрать отдел");
        System.out.println("3). В отдел");
        System.out.println("4). Создать отдел");
        System.out.println("5). Удалить отдел");
        System.out.println("0 - Выход");

        Scanner in = new Scanner(System.in, "CP866");
        return Integer.parseInt(in.nextLine());
    }

    public int getIndex() {
        System.out.println("Введите номер отдела");
        Scanner in = new Scanner(System.in, "CP866");
        return Integer.parseInt(in.nextLine());
    }

    public void printInfo(Company company, int index) {
        // System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("Отдел \"%s\"", company.getDepartment().get(index).getName()));
    }

    public void printInfo(Company company) {
        // System.out.println("++++++++++++++++++++++++++++++++++++");
        for (Department department : company.getDepartment()) {
            // System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println(String.format("Отдел \"%s\"", department.getName()));
        }
    } 
}
