package com.codecool.trains;

import com.codecool.trains.locomotives.Freight;
import com.codecool.trains.locomotives.IC;
import com.codecool.trains.locomotives.Passenger;
import com.codecool.trains.locomotives.Train;

import java.util.HashSet;
import java.util.Set;

public class TrainCompany {
    private Set<Train> trains = new HashSet<>();
    private int revenue = 0;

    public TrainCompany() {
        //create 2 of each
//        trains.add(new IC(1234));
//        trains.add(new IC(1235));
        trains.add(new Freight(1111));
//        trains.add(new Freight(1112));
//        trains.add(new Passenger(1212));
//        trains.add(new Passenger(1213));
    }

    public void update() {
        for (Train train: trains) {
            revenue += train.getRevenue();
        }
    }

    public int getRevenue() {
        return revenue;
    }
}
