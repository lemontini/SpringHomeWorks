package com.montini.homework01.java.model;

import com.montini.homework01.java.entities.Ball;

public class Football implements Ball {

    @Override
    public long move(long meters) {

        System.out.printf("Ball moves " + meters + " m. ");
        return meters;
    }

}
