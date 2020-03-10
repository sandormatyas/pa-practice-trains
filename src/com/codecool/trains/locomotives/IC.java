package com.codecool.trains.locomotives;

import java.util.Random;

public class IC extends Train {
    private static final float TICKETPRICE = 2f;
    public IC(int serialNumber) {
        super(serialNumber, 1200);
    }

    @Override
    public float calculateRevenue() {
        Random random = new Random();
        float revenue = 0;
        for (int day = 0; day < 30; day++) {
            int passengers = random.nextInt(135) + 115;
            revenue += passengers * TICKETPRICE;
            revenue += ((int) (passengers * 0.25)) * 2;
            if (random.nextInt(101) < 8) {
                revenue += ((int) (passengers * 0.2)) * 6;
            }
        }
        return revenue;
    }
}
