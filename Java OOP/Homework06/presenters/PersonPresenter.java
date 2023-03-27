package presenters;

import views.View;
import models.Designer;
import models.Person;
import models.Programmer;

public class PersonPresenter {

    Person person;
    View view;

    public PersonPresenter(Person person, View view) {
        this.person = person;
        this.view = view;
    }

    public int getMenuItem() {
        System.out.println("1). Информация о сотруднике");
        System.out.println("0). Назад");

        return Integer.parseInt(view.getInput());
    }

    public void menuControl() {
        int menuIndex;

        do {
            menuIndex = getMenuItem();

            switch (menuIndex) {
                case 1: // Информация о работнике
                    printPersonInfo(null);
                    break;

                case 0: // Удалить отдел
                    break;

                default:
                    view.printMessage("Некорректный ввод");
                    break;
            }
            menuIndex = getMenuItem();
        } while (menuIndex != 0);
    }

    public void printPersonInfo(Programmer programmer) {
        if (person instanceof Programmer) {
            ProgrammerPresenter programmerView = new ProgrammerPresenter((Programmer) person, view);
            ;
            programmerView.printProgrammerInfo();
        } else if (person instanceof Designer) {
            DesignerPresenter designerPresenter = new DesignerPresenter((Designer) person, view);
            ;
            designerPresenter.printDesignerInfo();
        }
    }

}