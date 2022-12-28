import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Lorry extends Car {
    int loadCapacity;

    public Lorry(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Lorry(String brand, String model, int weight, Engine engine, Driver driver, int loadCapacity) {
        super(brand, model, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLoad Capacity kg: " + loadCapacity;
    }
}
