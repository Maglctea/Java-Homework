/**
 * Homework01
 */
public class Main {

    public static void main(String[] args) {
        
        Milk milk = new Milk("Кубанское", 45, 1, "литр", 1, 3, "22.01.2023");
        System.out.println(milk);

        Lemonade lemonade = new Lemonade("Буратино", 32, 1, "мл", 500);
        System.out.println(lemonade);

        Bread bread = new Bread("Бородинский", 25, 3, "шт", "22.04.2023", "пшеничная");
        System.out.println(bread);

        Egg egg = new Egg("Курочка Ряба", 85, 1, "упаковка", "26.04.2023", 10);
        System.out.println(egg);

        MedicalMask mask = new MedicalMask("Ваше здоровье",150, 5, "шт", 100);
        System.out.println(mask);

        ToiletPaper toiletPaper = new ToiletPaper("Нежная",150, 5, "шт", 100, 2);
        System.out.println(toiletPaper);

        Diaper diaper = new Diaper("Моя радость", 550, 30, "шт", 0, true, 300, 600, 5, "для нежной кожи");
        System.out.println(diaper);

        Nipple nipple = new Nipple("Карамелька", 150, 1, "шт", 0, true);
        System.out.println(nipple);
    }
}