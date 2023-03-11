package Homework02;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework02 {

    private static int getValue(String symbol, File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");

                if (symbol.equals(splitLine[0])) {
                    return Integer.parseInt(splitLine[1]);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return -1;
    }

    private static float pow(int a, int b) {
        float s = 1;
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                s *= a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                s /= a;
            }
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outFile = new File("output.txt");

        int a = getValue("a", inputFile);
        int b = getValue("b", inputFile);

        try (FileWriter writer = new FileWriter(outFile)) {
            writer.write(String.valueOf(pow(a, b)));
            writer.flush();
        }
    }

}
