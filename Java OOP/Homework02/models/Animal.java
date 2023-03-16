package models;

import java.util.Scanner;

public abstract class Animal {
    int height;
    int weight;
    String eyeColor;


    public Animal(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public Animal() {
        this(0, 0, null);
    }

    public Animal CreateView() {
        Scanner in = new Scanner(System.in);

        System.out.print("Рост: ");
        this.height = Integer.parseInt(in.nextLine());
        System.out.print("Вес: ");
        this.weight = Integer.parseInt(in.nextLine());
        System.out.print("Высота: ");
        this.eyeColor = in.nextLine();

        return this;
    }

    abstract void Say();

    public void PrintInfo() {
        System.out.println(String.format("Рост: %d", height));
        System.out.println(String.format("Вес: %d", weight));
        System.out.println(String.format("Цвет глаз: %s", eyeColor));
    }
}


