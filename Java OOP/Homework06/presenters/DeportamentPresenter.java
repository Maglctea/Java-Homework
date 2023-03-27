package presenters;

import java.beans.DesignMode;
import java.util.ArrayList;

import models.Department;
import models.Designer;
import models.Person;
import models.Programmer;
import views.View;

public class DeportamentPresenter {
    Department department;
    View view;

    public DeportamentPresenter(Department department, View view) {
        this.department = department;
        this.view = view;
    }

    public int getMenuItem() {
        view.printMessage("1). Все работники отдела");
        view.printMessage("2). Выбрать работника");
        view.printMessage("3). В работника");
        view.printMessage("4). Создать работника");
        view.printMessage("5). Удалить работника");
        view.printMessage("0 - Назад");

        return Integer.parseInt(view.getInput());
    }

    public void menuControl() {
        int index;
        int menuIndex;

        do {
            menuIndex = getMenuItem();
            switch (menuIndex) {
                case 1: // Все сторудники отдела
                    printEmployeesInfo();
                    break;

                case 2: // Выбрать работника
                    printEmployeeInfo();
                    break;

                case 3: // В работника
                    index = getIndex();
                    PersonPresenter personPresentor = new PersonPresenter(department.getEmployees(index), view);
                    personPresentor.menuControl();
                    break;

                case 4: // Создать работника
                    addEmployee();
                    break;

                case 5: // Удалить работника
                    removeEmployee();
                    break;

                case 0: // Удалить отдел
                    break;

                default:
                    view.printMessage("Некорректный ввод");
                    break;
            }
        } while (menuIndex != 0);
    }

    public void printEmployeeInfo() {
        int index = getIndex();
        Person person = department.getEmployees(index);
        view.printMessage(String.format("%s %s %s", person.getSurname(), person.getName(), person.getPatronymic()));

    }

    public void printEmployeesInfo() {
        int index = 0;
        view.printMessage(String.format("================Отдел %s================", department.getName()));
        for (Person person : (ArrayList<Person>) department.getEmployees()) {
            view.printMessage(String.format("[%d] %s %s %s", index, person.getSurname(), person.getName(),
                    person.getPatronymic()));
            index++;
        }
    }

    public Programmer getProgrammer() {
        view.printMessage("----Личная информация---- ");
        view.printMessage("Фамилия: ");
        String surname = view.getInput();
        view.printMessage("Имя: ");
        String name = view.getInput();
        view.printMessage("Отчество: ");
        String patronymic = view.getInput();
        view.printMessage("Телефон: ");
        String telephone = view.getInput();
        view.printMessage("Возраст: ");
        int age = Integer.parseInt(view.getInput());

        view.printMessage("----Рабочая нформация---- ");
        view.printMessage("Зарплата: ");
        int salary = Integer.parseInt(view.getInput());
        view.printMessage("Квалификация: ");
        String qualification = view.getInput();

        return new Programmer(age, surname, name, patronymic, telephone, salary, qualification);
    }

    public Designer getDesigner() {
        view.printMessage("----Личная информация---- ");
        view.printMessage("Фамилия: ");
        String surname = view.getInput();
        view.printMessage("Имя: ");
        String name = view.getInput();
        view.printMessage("Отчество: ");
        String patronymic = view.getInput();
        view.printMessage("Телефон: ");
        String telephone = view.getInput();
        view.printMessage("Возраст: ");
        int age = Integer.parseInt(view.getInput());

        view.printMessage("----Рабочая нформация---- ");
        view.printMessage("Зарплата: ");
        int salary = Integer.parseInt(view.getInput());
        view.printMessage("Квалификация: ");
        String qualification = view.getInput();

        return new Designer(age, surname, name, patronymic, telephone, salary, qualification);
    }

    public void addEmployee() {

        switch (department.getDepartmentType()) {
            case "Designer":
                department.add(getDesigner());

            case "Programmer":
                department.add(getProgrammer());

            default:
                view.printMessage("Неверный ввод");
        }
    }

    public void removeEmployee() {
        int index = getIndex();
        department.remove(index);
    }

    public int getIndex() {
        view.printMessage("Введите номер работника");
        return Integer.parseInt(view.getInput());
    }
}
