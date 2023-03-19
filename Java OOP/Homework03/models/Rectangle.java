package models;

import java.util.Scanner;

public class Rectangle extends BaseFigure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        
    }

    @Override
    public double Perimeter() {
        return 2 * (a + b);
    }
    @Override
    public double Area() {
        return a * b;
    }

    @Override
    public void PrintInfo() {
        System.out.println(String.format("a: %.2f", this.a));
        System.out.println(String.format("b: %.2f", this.b));
        super.PrintInfo();

    }

    @Override
    public Rectangle CreateView() throws FigureException {
        Scanner in = new Scanner(System.in);
        
        System.out.print("a: ");
        a = Double.parseDouble(in.nextLine());
        System.out.print("b: ");
        b = Double.parseDouble(in.nextLine());

        return new Rectangle(a, b);
    }

    @Override
    public void EditView() {
        Scanner in = new Scanner(System.in);  

        System.out.print("a: ");
        this.a = Double.parseDouble(in.nextLine());
        System.out.print("b: ");
        this.b = Double.parseDouble(in.nextLine());
    }
}
