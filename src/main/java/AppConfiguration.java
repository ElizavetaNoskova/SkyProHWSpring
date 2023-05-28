import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    Car car() {
        return new Car("Porsche", "S", 3.3);
    }

    @Bean
    Bus bus() {
        return new Bus("Mercedes", "A", 4);
    }

    @Bean
    Pickup pickup() {
        return new Pickup("UAZ", "X", 6);
    }

    @Bean
    Driver driverCar() {
        return new Driver("Никита", car());
    }

    @Bean
    Driver driverBus() {
        return new Driver("Стас", bus());
    }

    @Bean
    Driver driverPickup() {
        return new Driver("Максим", pickup());
    }
}