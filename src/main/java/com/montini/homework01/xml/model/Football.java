package com.montini.homework01.xml.model;

import com.montini.homework01.xml.entities.Ball;

public class Football implements Ball {

    @Override
    public long move(long meters) {

        System.out.printf("Ball moves " + meters + " m. ");
        return meters;
    }

}
