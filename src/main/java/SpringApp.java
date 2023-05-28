import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Car car = context.getBean(Car.class);
        car.start();
        Bus bus = context.getBean(Bus.class);
        bus.start();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();

        Driver driverCar = context.getBean("driverCar",Driver.class);
        driverCar.startTheCar();

        Driver driverBus = context.getBean("driverBus",Driver.class);
        driverBus.startTheCar();

        Driver driverPickup = context.getBean("driverPickup",Driver.class);
        driverPickup.startTheCar();
    }
}