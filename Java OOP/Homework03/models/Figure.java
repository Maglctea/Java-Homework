package models;

public interface Figure {
    double Perimeter();
    double Area();
    void PrintInfo();
    BaseFigure CreateView() throws FigureException;
    void EditView() throws FigureException;
    }