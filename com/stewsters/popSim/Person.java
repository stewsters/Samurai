package com.stewsters.popSim;

import processing.core.PVector;

public class Person extends Critter {

    public Person(PVector location) {
        super(location);
    }

    public boolean react(PopulationSim context) {
        return false;
    }
}
