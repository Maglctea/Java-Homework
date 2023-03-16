package models;

import java.util.Scanner;

public class Wolf extends WildAnimal {
    protected boolean leader;

    public Wolf(int height, int weight, String eyeColor, String habitat, String dateOfLocation, boolean leader) {
        super(height, weight, eyeColor, habitat, dateOfLocation);

        this.leader = leader;
    }

    public Wolf() {
    }

    public Wolf CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in, "CP866");

        System.out.print("Лидер стаи (true/false): ");
        this.leader = Boolean.parseBoolean(in.nextLine());

        return this;
    }

    @Override
    void Say() {
        System.out.println("Ауууу");
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println(String.format("Глава стаи: %b", this.leader));
    }
    
}
