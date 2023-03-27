package Presenter;

import models.Company;
import models.Department;
import views.CompanyView;
import views.DepartamentView;

public class CompanyPresenter {

    Company company;

    public CompanyPresenter(Company company) {
        this.company = company;
    }

    public void MenuControl() {
        int index;
        CompanyView companyView = new CompanyView();
        int menuIndex = companyView.getMenuItem();

        while (menuIndex != 0) {
            switch (menuIndex) {
                case 1: // Все отделы
                    companyView.printInfo(this.company);
                    break;

                case 2: // Информация об отделе
                    index = companyView.getIndex();
                    companyView.printInfo(this.company, index);
                    break;

                case 3: // В отдел
                    index = companyView.getIndex();
                    DeportamentPresenter deportamentPresenter = new DeportamentPresenter(company.getDepartment(index + 1));
                    deportamentPresenter.MenuControl();
                    break;

                case 4: // Создать отдел
                    this.company.add(new DepartamentView().createView());
                    break;

                case 5: // Удалить отдел
                    index = companyView.getIndex();
                    company.removetDepartment(index);
                    break;

                default:
                    break;
            }
            menuIndex = companyView.getMenuItem();
        }

    }
}
