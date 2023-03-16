package models;

import java.util.Scanner;

public class Cat extends Pet {

    boolean presenceOfWool;

    public Cat(int height, int weight, String eyeColor, String nickname, String breed, Boolean vaccinations, String coatColor, String birthDay, boolean presenceOfWool) {
            super(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, birthDay);
            this.presenceOfWool = presenceOfWool;
    }

    public Cat() {
        
    }
    
    public Cat CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in, "CP866");
        
        System.out.print("Наличие шерсти (true/false): ");
        this.vaccinations = Boolean.parseBoolean(in.nextLine());

        return this;
    }


    @Override
    void Say() {        
        System.out.println("Мяу");
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println(String.format("Наличие шерсти: %b", presenceOfWool));
    }
    
}
