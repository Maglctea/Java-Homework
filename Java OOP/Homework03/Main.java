import java.util.Scanner;

import models.FigureException;
import models.FiguresControl;

public class Main {

    public static void main(String[] args) throws FigureException {      
        FiguresControl figuresControl = new FiguresControl();

        Scanner in = new Scanner(System.in);
        String menuString = "1). Добавить фигуру.\n2). Убрать фигуру\n3). Посмотреть информацию о фигуре\n4). Информация о всех фигурах\n5). Изменить фигуру.\n6). Отсортировать фигуры.\n0 - Выход.\n>>> ";
         

        System.out.print(menuString);
        int res = Integer.parseInt(in.nextLine());
        while (res != 0) {

            switch (res) {
                case 1:
                    figuresControl.Add();
                    break;                
                    
                case 2:
                    System.out.print("Введите номер фигуры\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {
                        figuresControl.Remove(res - 1);                        
                    } catch (Exception e) {
                        System.out.println("Фигура не обнаружена");
                    }
                    break;

                case 3:                    
                    System.out.print("Введите номер фигуры\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {
                        figuresControl.GetInfo(res - 1);                        
                    } catch (Exception e) {
                        System.out.println("Фигура не обнаружена");
                    }
                    break;
        
                case 4:
                    figuresControl.GetInfo();
                    break;

                case 5:
                    System.out.print("Введите номер фигуры\n>>> ");
                    res = Integer.parseInt(in.nextLine());
                    try {
                        figuresControl.Edit(res - 1);                        
                    } catch (Exception e) {
                        System.out.println("Фигура не обнаружена");
                    }
                    break;
                
                case 6:
                    figuresControl.Sort();
                    break;

                default:                
                    System.out.println("Ошибка ввода");
                    break;
            }
            
            System.out.print(menuString);
            res = Integer.parseInt(in.nextLine());
        }
    }
}