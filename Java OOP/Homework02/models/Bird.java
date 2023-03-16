package models;

import java.util.Scanner;

public abstract class Bird extends Animal {
    int flightAltitude;

    public Bird(int height, int weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public Bird() {
        this(0, 0, null, 0);
    }

    public Bird CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Высота полета: ");
        this.flightAltitude = Integer.parseInt(in.nextLine());

        return this;
    }
    
    void ToFly() {
        System.out.println(String.format("Я лечу на %d метрах", this.flightAltitude));
    }

    abstract void Say();
}
