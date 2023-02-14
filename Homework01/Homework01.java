package Homework01;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            Integer n = iScanner.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}