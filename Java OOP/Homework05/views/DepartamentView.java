package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Department;
import models.Designer;
import models.Person;
import models.Programmer;

public class DepartamentView {

    
    public int getMenuItem() {
        System.out.println("1). Все работники отдела");
        System.out.println("2). Выбрать работника");
        System.out.println("3). В работника");
        System.out.println("4). Создать работника");
        System.out.println("5). Удалить работника");
        System.out.println("0 - Назад");

        Scanner in = new Scanner(System.in, "CP866");
        return Integer.parseInt(in.nextLine());
    }

    public Department createView() {
        Scanner in = new Scanner(System.in, "CP866");

        System.out.print("Название отдела: ");
        String name = in.nextLine();

        System.out.print("Вид отдела: ");
        String menu = "1). Дизайн.\n2). Программирование\n>>> ";
        System.out.println(menu);

        int res = Integer.parseInt(in.nextLine());

        switch (res) {
            case 1:
                return new Department<Designer>(name, "Designer");

            case 2:
                return new Department<Programmer>(name, "Programmer");

            default:
                return new Department<>(name, "NoneType");
        }
    }

    public int getIndex() {
        System.out.println("Введите номер работника");
        Scanner in = new Scanner(System.in, "CP866");
        return Integer.parseInt(in.nextLine());
    }

    public void printInfo(Department department, int index) {
        System.out.println(String.format("================Отдел %s================", department.getName()));
        Person person = department.getEmployees(index);
        System.out.println(String.format("%s %s", person.getSurname(), person.getName()));

    }

    public void printInfo(Department department) {
        System.out.println(String.format("================Отдел %s================", department.getName()));
        for (Person person : (ArrayList<Person>)department.getEmployees()) {
            System.out.println(String.format("%s %s", person.getSurname(), person.getName()));

        }
    }
}
