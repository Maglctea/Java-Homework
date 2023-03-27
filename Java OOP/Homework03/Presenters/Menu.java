package homeworks.hw3.Presenters;

import homeworks.hw3.Views.View;

public class Menu {
    Presenter presenter;
    View view;

    public Menu(Presenter presenter, View view) {
        this.presenter = presenter;
        this.view = view;
    }

    public void showMenu() {
        String menu = "1 - Информация о всех фигурах\n2 - Информация о периметрах фигур\n" +
                "3 - Информация о площадях фигур\n4 - Добавить фигуру\n" +
                "5 - Заменить фигуру\n6 - Удалить фигуру\n7 - Выход\n";
        view.printMessage(menu);
    }

    public void start() {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(view.getInput());
            switch (choice) {
                case 1:
                    presenter.printAllFigures();
                    break;
                case 2:
                    presenter.printPerimeters();
                    break;
                case 3:
                    presenter.printArea();
                    break;
                case 4:
                    presenter.addFigure();
                    break;
                case 5:
                    presenter.replaceFigure();
                    break;
                case 6:
                    presenter.removeFigure();
                    break;
            }
        } while (choice != 7);
    }
}
