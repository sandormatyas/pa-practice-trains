package com.codecool.trains.locomotives;

import java.util.Random;

public class Freight extends Train {
    public Freight(int serialNumber) {
        super(serialNumber, 1000);
    }

    @Override
    public float calculateRevenue() {
        int revenue = 500;
        if (new Random().nextInt(101) < 35) {
            revenue += 110;
        }
        return revenue;
    }
}
