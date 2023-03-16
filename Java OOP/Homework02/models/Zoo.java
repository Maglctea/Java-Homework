package models;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    
    private ArrayList<Animal> animals = new ArrayList();

    public void Remove(int index) {
        animals.remove(index);
    }

    public void GetInfo(int index) {
        System.out.println("------------------");
        animals.get(index).PrintInfo();
    }

    public void GetInfo() {
        for (Animal animal : animals) {
            System.out.println("------------------");
            animal.PrintInfo();
        }
    }

    public void Add() {
        String animalString = "1). Кот.\n2). Собака.\n3). Курица\n3). Собака\n4). Аист\n5). Тигр.\n6). Волк.\n>>> ";
        System.out.println(animalString);

        Scanner in = new Scanner(System.in);
        int res = Integer.parseInt(in.nextLine());

        switch (res) {

            case 1:
            this.animals.add(new Cat().CreateView());
                break;
            
            case 2:
            this.animals.add(new Chicken().CreateView());
                break;
            
            case 3:
            this.animals.add(new Dog().CreateView());
                break;
        
            case 4:
            this.animals.add(new Stork().CreateView());
                break;

            case 5:
            this.animals.add(new Tiger().CreateView());
                break;
        
            case 6:
            this.animals.add(new Wolf().CreateView());
                break;

            default:
                System.out.println("Ошибка ввода");
                break;
        }
    }

    public void Say(int index) {
        animals.get(index).Say();
    }

    public void Say() {
        for (Animal animal : animals) {
            animal.Say();
        }
    }
}


