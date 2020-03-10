package com.codecool.trains.locomotives;

public abstract class Train {
    private int serialNumber;
    private int cost;

    public Train(int serialNumber, int cost) {
        this.serialNumber = serialNumber;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public abstract float calculateRevenue();

    public float getRevenue() {
        return calculateRevenue() - cost;
    }
}
