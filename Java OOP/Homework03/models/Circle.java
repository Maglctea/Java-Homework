package models;

import java.util.Scanner;

public class Circle extends BaseFigure {
    double radius;

    @Override
    public double Perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double Area() {
        return 2 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void PrintInfo() {       
        System.out.println(String.format("Радиус: %.2f", this.radius)); 
        
        super.PrintInfo();        
    }

    @Override
    public Circle CreateView() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Радиус круга: ");
        this.radius = Double.parseDouble(in.nextLine());

        return this;
    }

    @Override
    public void EditView() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Радиус круга: ");
        this.radius = Double.parseDouble(in.nextLine());
    }   

    

}
