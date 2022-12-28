package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    String brand;
    String model;
    int weight;
    Driver driver = new Driver();
    Engine engine = new Engine();

    public Car() {
    }

    public Car(String brand, String model, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println(brand + " Go");
    }

    public void stop() {
        System.out.println(brand + " Stop");
    }

    public void turnRight() {
        System.out.println(brand + " Right turn");
    }

    public void turnLeft() {
        System.out.println(brand + " Left turn");
    }

    @Override
    public String toString() {
        return
                driver +
                        "\n<<<Car>>>" +
                        "\nBrand: " + brand +
                        "\nModel: " + model +
                        "\nWeight kg: " + weight +
                        "\nEngine" + engine;
    }
}
