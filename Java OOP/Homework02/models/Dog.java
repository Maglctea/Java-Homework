package models;

import java.util.Scanner;

public class Dog extends Pet {

    boolean trained;

    public Dog(int height, int weight, String eyeColor, String nickname, String breed, Boolean vaccinations,
            String coatColor, String birthDay, boolean trained) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, birthDay);
        this.trained = trained;
    }

    public Dog() {
    }

    public Dog CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in, "CP866");

        System.out.print("Тренирована (true/false): ");
        this.trained = Boolean.parseBoolean(in.nextLine());

        return this;
    }

    @Override
    void Say() {
        System.out.println("Гав");
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println(String.format("Тренирована: %b", trained));
    }

    void ToTrain() {
        System.out.println(String.format("Вы потренировали %s", super.nickname));
    }
    
}
