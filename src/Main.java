import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("Tom", "Hanks", 35, 17);
        Engine engine = new Engine("MAN Truck & Bus", 85);
        Lorry lorry = new Lorry("MAN", "TGX 18.680 V8", 8425, engine, driver, 18000);

        Driver driver1 = new Driver("Zlatan", "Ibrahimovic", 39, 15);
        Engine engineSpCar = new Engine("Audi/Lamborghini V10", 602);
        SportCar sportCar = new SportCar("Lamborghini", "Huracan", 1553, driver1, engineSpCar, 325);

        Car[] car = new Car[]{lorry, sportCar};
        for (Car s : car) {
            System.out.println(s);
            s.start();
            s.stop();
            s.turnLeft();
            s.turnRight();
        }

    }
}
// Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.
// details и Driver в пакете com.company.professions.Класс Driver содержит поля
// - ФИО, стаж вождения.Класс Engine содержит поля - мощность, производитель.
// Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
// мотор типа Engine. Методы start()stop(), turnRight()turnLeft() которые выводят на печать:
// "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(),
// который выводит полную информацию об автомобиле, ее водителе и моторе.
// Создать производный от Car класс  - Lorry (грузовик), характеризуемый
// также грузоподъемностью кузова.Создать производный от Car класс - SportCar,
// характеризуемый также предельной скоростью.Пусть класс Driver расширяет класс Person.