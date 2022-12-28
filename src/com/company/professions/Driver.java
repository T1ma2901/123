package com.company.professions;

public class Driver extends Person {
    private int drivingExperience;

    public Driver() {
    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public Driver(String firstName, String lastName, int age, int drivingExperience) {
        super(firstName, lastName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }


    @Override
    public String toString() {
        return "\n<<<Driver>>>" + super.toString() +
                "\nDriving Experience: " + drivingExperience;
    }
}

