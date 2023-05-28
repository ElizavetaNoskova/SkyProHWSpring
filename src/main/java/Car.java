public class Car extends Transport {
    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void start() {
        System.out.println("Автомобиль готов к поездке");
    }

}