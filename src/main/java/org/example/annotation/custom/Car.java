package org.example.annotation.custom;

public class Car {
    private final String model;
    // 1980 ~ 2025
    private final Integer year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car { " +
                "model = '" +model + "\'" +
                ", year = '" + year + "\'" +
                "}";
    }
}
