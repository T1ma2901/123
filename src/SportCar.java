import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class SportCar extends Car {
    int maxSpeed;


    public SportCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCar(String brand, String model, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, model, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMaxSpeed km/h: " + maxSpeed;
    }
}
