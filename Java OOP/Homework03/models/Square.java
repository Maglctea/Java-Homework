package models;

import java.util.Scanner;

public class Square extends BaseFigure {

    double a;

    public Square(double a) {
        this.a = a;
    }

    public Square() {}

    @Override
    public double Perimeter() {
        return a * 4;
    }

    @Override
    public double Area() {
        return a * a;
    }

    @Override
    public void PrintInfo() {
        System.out.println(String.format("c: %.2f", this.a));        
        super.PrintInfo();   
    }
    
    @Override
    public Square CreateView() throws FigureException {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("a: ");
        a = Double.parseDouble(in.nextLine());
        
        return new Square(a);
    }

    @Override
    public void EditView() {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("a: ");
        this.a = Double.parseDouble(in.nextLine());
    
    }
}
