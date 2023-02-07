import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotVendingMashine implements VendingMashine {

    private List<HotDrink> drinks = new LinkedList<>();

    public HotVendingMashine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    HotDrink userdrink = null;

    @Override
    public void getDrink(Integer id, Integer volume, Integer temperature, Integer price) {

        int count = 0;
        int change = 0;
        for (HotDrink drink : drinks) {
            if (drink.getId().equals(id)) {
                if (drink.getVolume().equals(volume)) {
                    if (drink.getTemperature().equals(temperature)) {

                        System.out.println("Ваш напиток стоит: " + drink.getPrice() + " рублей");
                        System.out.println("Автомат принимает копюры достоинством 100, 200, 500 и 1000 рублей");
                        int money = getMoney();
                        if (money >= drink.getPrice()) {
                            userdrink = drink;
                            count++;
                            change = money - drink.getPrice();
                        } else
                            System.out.println("Вы внесли нежостаточное количество денег");
                    }
                }
            }
        }

        if (count > 0) {
            System.out.println("Возьмите Ваш напиток: " + userdrink);
            System.out.println("Возьмите Вашу сдачу: " + change + " рублей");
        } else
            System.out.println("К сожалению, напитка с такими параметрами - нет!");

    }

    public static Integer getMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую Вы вносите: ");
        Integer money = scanner.nextInt();

        return money;
    }

}
