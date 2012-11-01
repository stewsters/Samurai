package com.stewsters.popSim;

import processing.core.PVector;

public class Wolf extends Critter {
    public Wolf(PVector location) {
        super(location);
    }

    public boolean react(PopulationSim context) {
        return false;
    }
}
