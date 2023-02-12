import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer n = iScanner.nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}