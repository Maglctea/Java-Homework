package Presentor;

import java.util.ArrayList;

import models.Company;
import models.Department;
import models.Person;
import models.Programmer;
import views.DepartamentView;
import views.DesignerView;
import views.PersonView;
import views.ProgrammerView;

public class DeportamentPresenter {

    Department department;

    public DeportamentPresenter(Department department) {
        this.department = department;
    }

    public void MenuControl() {
        int index;
        DepartamentView departamentView = new DepartamentView();
        int menuIndex = departamentView.getMenuItem();

        while (menuIndex != 0) {
            switch (menuIndex) {
                case 1: // Все сторудники отдела
                    departamentView.printInfo(this.department);
                    break;

                case 2: // Выбрать работника
                    index = departamentView.getIndex();
                    departamentView.printInfo(this.department, index);
                    break;

                case 3: // В работника
                    index = departamentView.getIndex();
                    PersonPresentor personPresentor = new PersonPresentor(department.getEmployees(index + 1));
                    personPresentor.MenuControl();
                    break;

                case 4: // Создать работника
                    if (this.department.getDepartmentType().equals("Programmer")) {
                        ProgrammerView programmerView = new ProgrammerView();
                        programmerView.createView();
                        this.department.add(programmerView.getProgrammer());
                    } else if (this.department.getDepartmentType().equals("Designer")) {
                        DesignerView designerView = new DesignerView();
                        designerView.createView();
                        this.department.add(designerView.getDesigner());
                    }
                    break;

                case 5: // Удалить работника
                    index = departamentView.getIndex();
                    department.remove(index);
                    break;

                default:
                    break;
            }

            menuIndex = departamentView.getMenuItem();
        }

    }
}