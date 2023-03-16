package models;

import java.util.Scanner;

public class Chicken extends Bird {

    public Chicken(int height, int weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    public Chicken() {
    }

    public Chicken CreateView() {
        super.CreateView();
        return this;
    }

    @Override
    void Say() {
        System.out.println("Ко-ко-ко");
    }
    
}
