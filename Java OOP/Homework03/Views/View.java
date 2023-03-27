package homeworks.hw3.Views;

import java.util.Scanner;

public class View {
    Scanner scanner;

    public View(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
