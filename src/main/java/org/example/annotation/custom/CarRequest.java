package org.example.annotation.custom;

import org.example.annotation.custom.annotation.YearRange;

public class CarRequest {
    private final String model;
    @YearRange(min = 2000, max = 2025)
    private final Integer year;

    public CarRequest(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
