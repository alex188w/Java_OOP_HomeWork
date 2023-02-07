import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
     * При решении этих задач следуйте принципам абстракции, инкапсуляции,
     * наследования, полиморфизма.
     * 1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int
     * температура.
     * 2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс
     * ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int
     * volume, int temperature), выдающий продукт, соответствующий имени, объему и
     * температуре.
     * 3. В main проинициализируйте несколько ГорячихНапитков и
     * АвтоматГорячихНапитков и позвольте покупателю купить товар.
     */
    public static void main(String[] args) {
        List<HotDrink> drinks = new LinkedList<>(List.of(
                new HotDrink(1, "Coffee", 200, 70, 200),
                new HotDrink(1, "Coffee", 200, 80, 200),
                new HotDrink(1, "Coffee", 200, 90, 200),
                new HotDrink(1, "Coffee", 400, 70, 300),
                new HotDrink(1, "Coffee", 400, 80, 300),
                new HotDrink(1, "Coffee", 400, 90, 300),
                new HotDrink(2, "Cappuccino", 200, 70, 200),
                new HotDrink(2, "Cappuccino", 200, 80, 200),
                new HotDrink(2, "Cappuccino", 200, 90, 200),
                new HotDrink(2, "Cappuccino", 400, 70, 300),
                new HotDrink(2, "Cappuccino", 400, 80, 300),
                new HotDrink(2, "Cappuccino", 400, 90, 300),
                new HotDrink(3, "Chocolate", 200, 90, 200),
                new HotDrink(3, "Chocolate", 200, 90, 200),
                new HotDrink(3, "Chocolate", 200, 90, 200),
                new HotDrink(3, "Chocolate", 400, 90, 300),
                new HotDrink(3, "Chocolate", 400, 90, 300),
                new HotDrink(3, "Chocolate", 400, 90, 300)));

        HotVendingMashine machine = new HotVendingMashine(drinks);

        machine.getDrink(getId(), getVolume(), getTemperature(), getPrice());
    }

    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: ");
        Integer drinkId = scanner.nextInt();

        return drinkId;
    }

    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обьем напитка(200 мл, 400 мл): ");
        Integer drinkVolume = scanner.nextInt();

        return drinkVolume;
    }

    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drintemperature = scanner.nextInt();

        return drintemperature;
    }

    private static Integer getPrice() {
        return null;
    }
}
