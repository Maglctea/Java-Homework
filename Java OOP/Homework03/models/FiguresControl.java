package models;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FiguresControl {

    private ArrayList<BaseFigure> figures = new ArrayList();

    public void Remove(int index) {
        figures.remove(index);
    }

    public void GetInfo(int index) {
        System.out.println("------------------");
        figures.get(index).PrintInfo();
    }

    public void GetInfo() {
        for (BaseFigure BaseFigure : figures) {
            System.out.println("------------------");
            BaseFigure.PrintInfo();
        }
    }

    public void Sort() {
        Collections.sort(this.figures);
    }

    public void Edit(int index) throws FigureException {
        BaseFigure figure = this.figures.get(index);
        figure.EditView();        
    }

    public void Add() throws FigureException {
        String BaseFigureString = "1). Треугольник.\n2). Квадрат.\n3). Прямоугольник\n4). Круг.\n>>> ";
        System.out.print(BaseFigureString);

        Scanner in = new Scanner(System.in);
        int res = Integer.parseInt(in.nextLine());

        switch (res) {

            case 1:
            this.figures.add(new Triangle().CreateView());
                break;
            
            case 2:
            this.figures.add(new Square().CreateView());
                break;
            
            case 3:
            this.figures.add(new Rectangle().CreateView());
                break;
        
            case 4:
            this.figures.add(new Circle().CreateView());
                break;

            default:
                System.out.println("Ошибка ввода");
                break;
        }
    }
}
