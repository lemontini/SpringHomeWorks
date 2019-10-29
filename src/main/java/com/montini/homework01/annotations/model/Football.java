package com.montini.homework01.annotations.model;

import com.montini.homework01.annotations.entities.Ball;
import org.springframework.stereotype.Component;

@Component
public class Football implements Ball {

    @Override
    public long move(long meters) {

        System.out.printf("Ball moves " + meters + " m. ");
        return meters;

    }

}
