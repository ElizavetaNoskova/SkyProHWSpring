public class Bus extends Transport{
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void start() {
        System.out.println("Автобус готов к поездке");
    }
}