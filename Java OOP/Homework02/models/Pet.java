package models;

import java.util.Scanner;

public abstract class Pet extends Animal {
    String nickname;
    String breed;
    Boolean vaccinations;
    String coatColor;
    String birthDay;


    public Pet(int height, int weight, String eyeColor, String nickname, String breed, Boolean vaccinations, String coatColor, String birthDay) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor= coatColor;
        this.birthDay = birthDay;
    }

    
    public Pet() {
        this(0, 0, null, null, null, false, null, null);
    }
    

    public Pet CreateView() {
        super.CreateView();
        Scanner in = new Scanner(System.in, "CP866");

        System.out.print("Кличка: ");
        this.nickname = in.nextLine();
        System.out.print("Порода: ");
        this.breed = in.nextLine();
        System.out.print("Наличие прививок (true/false): ");
        this.vaccinations = Boolean.parseBoolean(in.nextLine());
        System.out.print("Цвет шерсти: ");
        this.coatColor = in.nextLine();
        System.out.print("Дата рождения: ");
        this.birthDay = in.nextLine();

        return this;
    }

    abstract void Say();


    public void PrintInfo() {
        super.PrintInfo();
        System.out.println(String.format("Вид: %s", nickname));
        System.out.println(String.format("Порода: %s", breed));
        System.out.println(String.format("Привитость: %b", vaccinations));
        System.out.println(String.format("Цвет шерсти: %s", coatColor));
        System.out.println(String.format("День рождения: %s", birthDay));
    }
    
    void ShowAffection(){
        System.out.println(String.format("Вы приласкали %s", this.nickname));
    }
}
