package com.stewsters.popSim;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class Critter {

    //position
    PVector location;
    GroundTile onTile;

    float maxLifeSpan;
    float repRate;
    float energy;
    float maxEnergy = 1;
    float maxSpeed = 0.f;

    public Critter(PVector location) {
        this.location = location;
    }

    //move
    public void move(PopulationSim context, PVector destination) {
        //take yourself out of the old square, update to be in the new one.
        PVector velocity = destination.get();
        velocity.sub(location);
        velocity.scaleTo(maxSpeed);
        location.add(velocity);
        onTile = context.findTile(location);

    }

    public void draw(PApplet context) {
        context.line(location.x, location.y, location.x + 1, location.y + 1);
    }

    public abstract void react(PopulationSim context);
}
