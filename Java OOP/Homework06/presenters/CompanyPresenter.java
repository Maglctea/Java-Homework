package presenters;

import models.Company;
import models.Department;
import models.Designer;
import models.Programmer;
import views.View;

public class CompanyPresenter {
    Company company;
    View view;

    public CompanyPresenter(Company company, View view) {
        this.company = company;
        this.view = view;
    }

    public int getMenuItem() {
        view.printMessage("1). Все отделы");
        view.printMessage("2). Выбрать отдел");
        view.printMessage("3). В отдел");
        view.printMessage("4). Создать отдел");
        view.printMessage("5). Удалить отдел");
        view.printMessage("0 - Выход");

        return Integer.parseInt(view.getInput());
    }

    public void menuControl() {
        int index;
        int menuIndex;

        do {            
            menuIndex = getMenuItem();
            switch (menuIndex) {
                case 1: // Все отделы
                    printDepartamentsInfo();
                    break;

                case 2: // Информация об отделе
                    printDepartamentInfo();
                    break;

                case 3: // В отдел
                    index = getIndex();
                    DeportamentPresenter deportamentPresenter = new DeportamentPresenter(company.getDepartment(index), view);
                    deportamentPresenter.menuControl();
                    break;

                case 4: // Создать отдел
                    addDepartment();
                    break;

                case 5: // Удалить отдел
                    removeDepartment();
                    break;

                case 0: // Удалить отдел
                    view.printMessage("Удачного дня!");
                    break;

                default:
                    view.printMessage("Некорректный ввод");
                    break;
            }
        } while (menuIndex != 0);
    }

    public void printDepartamentInfo() {
        view.printMessage("Введите номер департамента");
        int index = Integer.parseInt(view.getInput());
        view.printMessage(String.format("Отдел \"%s\"", company.getDepartments().get(index).getName()));
    }

    public void printDepartamentsInfo() {
        int index = 0;
        for (Department department : company.getDepartments()) {
            view.printMessage(String.format("[%d] Отдел \"%s\"", index, department.getName()));
            index++;
        }
    } 
    
    public void addDepartment() {   
        view.printMessage("Введите название отдела:");
        String name = view.getInput();

        view.printMessage("Вид отдела:\n1). Дизайн.\n2). Программирование\n>>> ");
        int res = Integer.parseInt(view.getInput());

        switch (res) {
            case 1:
                company.add(new Department<Designer>(name, "Designer"));

            case 2:
                company.add(new Department<Programmer>(name, "Programmer"));

            default:
            view.printMessage("Неверный ввод");
        }
    }

    public void removeDepartment() {
        int index = getIndex();
        company.remove(index);
    }

    public int getIndex() {
        view.printMessage("Введите номер отдела");
        return Integer.parseInt(view.getInput());
    }

    
}
