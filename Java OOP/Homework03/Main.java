package homeworks.hw3;

import java.util.Scanner;

import homeworks.hw3.Models.Circle;
import homeworks.hw3.Models.FigureCollection;
import homeworks.hw3.Models.Rectangle;
import homeworks.hw3.Models.Square;
import homeworks.hw3.Models.Triangle;
import homeworks.hw3.Presenters.Menu;
import homeworks.hw3.Presenters.Presenter;
import homeworks.hw3.Views.View;

public class Main {

    public static void main(String[] args) {
        View view = new View(new Scanner(System.in));
        FigureCollection collection = new FigureCollection();
        Presenter presenter = new Presenter(view, collection);
        collection.addFigure(new Triangle(3, 2, 3));
        collection.addFigure(new Square(5));
        collection.addFigure(new Rectangle(2, 3));
        collection.addFigure(new Circle(5));
        Menu menu = new Menu(presenter, view);
        menu.start();

        // collection.printAllFigures();

    }

}
