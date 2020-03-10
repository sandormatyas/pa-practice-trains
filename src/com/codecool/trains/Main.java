package com.codecool.trains;

import com.codecool.trains.locomotives.Train;

public class Main {

    public static void main(String[] args) {
        TrainCompany MAV = new TrainCompany();

        for (int i = 0; i < 24; i++) {
            MAV.update();
            System.out.println("The sum of money is: " + MAV.getRevenue());
        }
    }
}
