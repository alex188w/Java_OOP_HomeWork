public class HotDrink extends Drink {
    private Integer temperature;
    private Integer price;

    public HotDrink(Integer id, String name, Integer volume, Integer temperature, Integer price) {
        super(id, name, volume);
        this.temperature = temperature;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " HotDrink [temperature = " + temperature + " ] " + " HotDrink price = " + price
                + " руюлей";
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getPrice() {
        return price;
    }
}
