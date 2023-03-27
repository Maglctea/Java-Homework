package homeworks.hw3.Presenters;

import homeworks.hw3.Views.View;
import seminars.sem2.Inter;

import java.util.Scanner;

import homeworks.hw3.Models.FigureCollection;

import homeworks.hw3.Models.Triangle;
import homeworks.hw3.Models.Square;
import homeworks.hw3.Models.Circle;
import homeworks.hw3.Models.Figure;
import homeworks.hw3.Models.Rectangle;

public class Presenter {
    View view;
    FigureCollection figures;

    public Presenter(View view, FigureCollection figures) {
        this.view = view;
        this.figures = figures;
    }

    public void sortCollection() {
        figures.sortByArea();
    }

    Rectangle getRectangle() {
        view.printMessage("Введите сторону A");
        double a = Double.parseDouble(view.getInput());
        view.printMessage("Введите сторону B");
        double b = Double.parseDouble(view.getInput());

        return new Rectangle(a, b);
    }

    Square getSquare() {
        view.printMessage("Введите сторону");
        double a = Double.parseDouble(view.getInput());

        return new Square(a);
    }

    Circle getCircle() {
        view.printMessage("Введите радиус");
        double r = Double.parseDouble(view.getInput());

        return new Circle(r);
    }

    Triangle getTriangle() {
        view.printMessage("Введите сторону A");
        double a = Double.parseDouble(view.getInput());
        view.printMessage("Введите сторону B");
        double b = Double.parseDouble(view.getInput());
        view.printMessage("Введите сторону C");
        double c = Double.parseDouble(view.getInput());

        return new Triangle(a, b, c);
    }

    public Figure choiceFigure() {
        view.printMessage("1 - Треугольник\n2 - Круг\n3 - Квадрат\n4 - Прямоугольник");
        String userChoise = view.getInput();

        switch (userChoise) {
            case "1":
                return getTriangle();
            case "2":
                return getCircle();
            case "3":
                return getSquare();
            case "4":
                return getRectangle();
            default:
                view.printMessage("Неверный ввод");
                return null;
        }

    }

    public void addFigure() {
        Figure figure = choiceFigure();
        if (figure != null) {
            figures.addFigure(figure);
        }
    }

    public void removeFigure() {
        int index = getIndex();
        if (index >= 0) {
            figures.removeFigure(index);
        }
    }

    public void replaceFigure() {
        int index = getIndex();
        Figure figure = choiceFigure();
        if (index >= 0) {
            figures.updateFigure(index, figure);
        }
    }

    private int getIndex() {
        view.printMessage("Введите индекс");
        int figureNumber = Integer.parseInt(view.getInput());
        if (figureNumber >= figures.getCount()) {
            return -1;
        }
        return figureNumber;
    }

    public void printAllFigures() {
        int index = 0;
        for (Figure figure : figures.getFigures()) {
            if (figure instanceof Triangle) {
                view.printMessage(
                        String.format("[%d]; Треугольник со сторонами: %.2f, %.2f, %.2f; Площадь: %.2f; Периметр: %.2f",
                                index, ((Triangle) figure).getA(), ((Triangle) figure).getB(),
                                ((Triangle) figure).getC(),
                                figure.getArea(), figure.getPerimeter()));
            } else if (figure instanceof Square) {
                view.printMessage(
                        String.format("[%d]; Квадрат со стороной: %.2f; Площадь: %.2f; Периметр: %.2f",
                                index, ((Square) figure).getSide(), figure.getArea(), figure.getPerimeter()));
            } else if (figure instanceof Rectangle) {
                view.printMessage(
                        String.format("[%d]; Прямоугольник с длиной %.2f и шириной %.2f; Площадь: %.2f; Периметр: %.2f",
                                index, ((Rectangle) figure).getLength(), ((Rectangle) figure).getWidth(),
                                figure.getArea(), figure.getPerimeter()));
            } else if (figure instanceof Circle) {
                view.printMessage(
                        String.format("[%d]; Круг с радиусом: %.2f; Площадь: %.2f; Длина окружности: %.2f",
                                index, ((Circle) figure).getRadius(), figure.getArea(), figure.getPerimeter()));
            }
            index++;
        }
    }

    public void printPerimeters() {
        for (Figure figure : figures.getFigures()) {
            if (figure instanceof Triangle) {
                view.printMessage(String.format("Периметр треугольника: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Square) {
                view.printMessage(String.format("Периметр квадрата: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Rectangle) {
                view.printMessage(String.format("Периметр прямоугольника: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Circle) {
                view.printMessage(String.format("Длина окружности: %.2f", figure.getPerimeter()));
            }
        }
    }

    public void printArea() {
        for (Figure figure : figures.getFigures()) {
            view.printMessage(String.format("Площадь: %.2f", figure.getArea()));
        }
    }
}