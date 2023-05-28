public class Pickup extends Transport{
    public Pickup(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void start() {
        System.out.println("Пикап готов к поездке");
    }
}