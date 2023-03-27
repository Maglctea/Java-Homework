package presenters;

import models.Designer;
import views.View;

public class DesignerPresenter {
    Designer designer;
    View view;

    public DesignerPresenter(Designer designer, View view) {
        this.designer = designer;
        this.view = view;
    }

    public void printDesignerInfo() {        
        view.printMessage("-------Личная информация-------");
        view.printMessage(String.format("Фамилия: %s", designer.getSurname()));
        view.printMessage(String.format("Имя: %s", designer.getName()));
        view.printMessage(String.format("Отчество: %s",designer.getPatronymic()));
        view.printMessage(String.format("Телефон: %s", designer.getTelephone()));
        view.printMessage(String.format("Возраст: %d", designer.getAge()));

        
        view.printMessage("---Корпоративная информация---");
        view.printMessage(String.format("Позиция: %s", designer.getQualification()));
        view.printMessage(String.format("Зарплата: %d", designer.getSalary()));
    }

}
