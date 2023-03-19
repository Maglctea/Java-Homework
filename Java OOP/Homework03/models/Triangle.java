package models;

import java.util.Scanner;

public class Triangle extends BaseFigure {
    
    double a;
    double b;
    double c;


    public Triangle(double a, double b, double c) throws FigureException {
        if (a + b > c && a + c > c && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else
        throw new FigureException("Данная фигура невозможна!");        
    }


    public Triangle() throws FigureException {
        this(1, 1, 1);
    }


    @Override
    public double Perimeter() {
        return a + b + c;
    }


    @Override
    public double Area() {
        double p = this.Perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    @Override
    public void PrintInfo() {  
        System.out.println(String.format("a: %.2f", this.a));
        System.out.println(String.format("b: %.2f", this.b));
        System.out.println(String.format("c: %.2f", this.c));        
        super.PrintInfo();             
    }


    @Override
    public Triangle CreateView() throws FigureException {
        Scanner in = new Scanner(System.in);
        
        System.out.print("a: ");
        a = Double.parseDouble(in.nextLine());
        System.out.print("b: ");
        b = Double.parseDouble(in.nextLine());
        System.out.print("c: ");
        c = Double.parseDouble(in.nextLine());

        return new Triangle(a, b, c);
    }    

    @Override
    public void EditView() throws FigureException {
        Scanner in = new Scanner(System.in);
        
        System.out.print("a: ");
        Double a = Double.parseDouble(in.nextLine());
        System.out.print("b: ");
        Double b = Double.parseDouble(in.nextLine());
        System.out.print("c: ");
        Double c = Double.parseDouble(in.nextLine());

        Triangle t = new Triangle(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;
    }    
}
