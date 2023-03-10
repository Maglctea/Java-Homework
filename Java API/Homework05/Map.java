import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Map {

    static int countLines(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int count = 0;
            while (bufferedReader.readLine() != null) {
                count++;
            }
            return count;
        }
    }

    static int countElements(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return 0;
            }
            return line.split(" ").length;
        }
    }
    
    static int[][] downLoadMap(String path) throws IOException {

        int[][] map = new int[countLines(path)][countElements(path)];

        FileReader fileReader = new FileReader(path);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String currentLine;
            int line = 0;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] arrayLine = currentLine.split(" ");

                for (int i = 0; i < arrayLine.length; i++) {
                    map[line][i] = Integer.parseInt(arrayLine[i]);
                }
                line++;
            }
        }

        return map;
    }

    static void exploreMap(int[][] map, int x, int y, int count) {
        if (map[y - 1][x] != -1 && (map[y - 1][x] >= count || map[y - 1][x] == -2)) {
            map[y - 1][x] = count;
            exploreMap(map, x, y - 1, count + 1);
        }
        if (map[y][x + 1] != -1 && (map[y][x + 1] >= count || map[y][x + 1] == -2)) {
            map[y][x + 1] = count;
            exploreMap(map, x + 1, y, count + 1);
        }
        if (map[y + 1][x] != -1 && (map[y + 1][x] >= count || map[y + 1][x] == -2)) {
            map[y + 1][x] = count;
            exploreMap(map, x, y + 1, count + 1);
        }
        if (map[y][x - 1] != -1 && (map[y][x - 1] >= count || map[y][x - 1] == -2)) {
            map[y][x - 1] = count;
            exploreMap(map, x - 1, y, count + 1);
        }
    }

    static void printMap(int[][] map) {
        for (int[] y : map) {
            for (int x : y) {
                switch (x) {
                    case -1:
                        System.out.print("#|");
                        break;
                    case -2:
                        System.out.print(" |");
                        break;
                    default:
                        System.out.print(x + "|");
                        break;
                }
            }
            System.out.println();
        }
    }

    
}
