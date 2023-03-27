package presenters;

import models.Programmer;
import views.View;

public class ProgrammerPresenter {
    Programmer programmer;
    View view;

    public ProgrammerPresenter(Programmer programmer, View view) {
        this.programmer = programmer;
        this.view = view;
    }

    public void printProgrammerInfo() {        
        view.printMessage("-------Личная информация-------");
        view.printMessage(String.format("Фамилия: %s", programmer.getSurname()));
        view.printMessage(String.format("Имя: %s", programmer.getName()));
        view.printMessage(String.format("Отчество: %s",programmer.getPatronymic()));
        view.printMessage(String.format("Телефон: %s", programmer.getTelephone()));
        view.printMessage(String.format("Возраст: %d", programmer.getAge()));

        
        view.printMessage("---Корпоративная информация---");
        view.printMessage(String.format("Позиция: %s", programmer.getQualification()));
        view.printMessage(String.format("Зарплата: %d", programmer.getSalary()));
    }

}
