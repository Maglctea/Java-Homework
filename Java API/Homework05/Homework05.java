import java.io.IOException;
import java.util.Scanner;





public class Homework05 {

    public static void main(String[] args) throws IOException {
        String path = "map.txt";
        int[][] map = Map.downLoadMap(path);

        Map.printMap(map);

        try (Scanner iScanner = new Scanner(System.in)) {
            Integer spawnX = 0;
            Integer spawnY = 0;

            while (map[spawnY][spawnX] == -1) {
                System.out.print("Введите X: ");
                spawnX = iScanner.nextInt();

                System.out.print("Введите Y: ");
                spawnY = iScanner.nextInt();

                if (spawnX > 0 && spawnY > 0 && spawnX < Map.countElements(path) && spawnY < Map.countLines(path)){
                    if (map[spawnY][spawnX] == -1) {
                        System.out.println("Ошибка! Координата спавна находится в стене");
                        spawnX = 0;
                        spawnY = 0;
                    }
                }
                else {
                        System.out.println("Ошибка! Координата спавна находится вне карты");
                        spawnX = 0;
                        spawnY = 0;
                    }
            }
            map[spawnY][spawnX] = 0;
            Map.exploreMap(map, spawnX, spawnY, 1);
        }
        Map.printMap(map);
    }
}
