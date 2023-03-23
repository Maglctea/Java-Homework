package Presentor;

import models.Designer;
import models.Person;
import models.Programmer;
import views.DesignerView;
import views.PersonView;
import views.ProgrammerView;

public class PersonPresentor {

    Person person;

    public PersonPresentor(Person person) {
        this.person = person;
    }

    public void MenuControl() {
        PersonView departamentView = new PersonView();
        int menuIndex = departamentView.getMenuItem();

        while (menuIndex != 0) {
            switch (menuIndex) {
                case 1: // Информация о работнике
                    if (person instanceof Programmer) {
                        ProgrammerView programmerView = new ProgrammerView();
                        programmerView.printInfo((Programmer) person);
                    } else if (person instanceof Designer) {
                        DesignerView designerView = new DesignerView();
                        designerView.printInfo((Designer) person);
                    }
                    break;

                default:
                    break;
            }
            menuIndex = departamentView.getMenuItem();
        }
    }

    public void printInfo(Programmer programmer) {
        new ProgrammerView().printInfo(programmer);
    }

}