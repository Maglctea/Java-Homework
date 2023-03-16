package models;

import java.util.Scanner;

public abstract class WildAnimal extends Animal {
    String habitat;
    String dateOfLocation;

    public WildAnimal(int height, int weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }

    public WildAnimal() {
        this(0, 0, null, null, null);
    }

    public WildAnimal CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in, "CP866");

        System.out.print("Место обитания: ");
        this.habitat = in.nextLine();
        System.out.print("Дата рождения: ");
        this.dateOfLocation = in.nextLine();

        return this;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println(String.format("Место обитания: %s", habitat));
        System.out.println(String.format("Дата нахождения: %s", dateOfLocation));
    }


}
