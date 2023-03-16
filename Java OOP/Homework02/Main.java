import java.util.Scanner;
import models.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Scanner in = new Scanner(System.in);
        String menuString = "1). Добавить животное.\n2). Убрать животное\n3). Посмотреть информацию о животном\n4). Голос животного\n5). Информация о всех животных\n6). Голоса всех животных.\n0 - Выход.\n>>> ";
         

        System.out.print(menuString);
        int res = Integer.parseInt(in.nextLine());
        while (res != 0) {

            switch (res) {
                case 1:
                    zoo.Add();
                    break;                
                    
                case 2:
                    System.out.print("Введите номер животного\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {
                        zoo.Remove(res - 1);                        
                    } catch (Exception e) {
                        System.out.print("Животное не обнаружено");
                    }
                    break;

                case 3:                    
                    System.out.print("Введите номер животного\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {
                        zoo.GetInfo(res - 1);                        
                    } catch (Exception e) {
                        System.out.print("Животное не обнаружено");
                    }
                    break;
            
                case 4:
                    System.out.print("Введите номер животного\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {                        
                        zoo.Say(res - 1);                        
                    } catch (Exception e) {                        
                        System.out.print("Животное не обнаружено");
                    }
                    break;
        
                case 5:
                    zoo.GetInfo();
                    break;

                case 6:
                    zoo.Say();
                    break;

                default:                
                    System.out.print("Ошибка ввода");
                    break;
            }
            
            System.out.print(menuString);
            res = Integer.parseInt(in.nextLine());
        }
    }
    
}
