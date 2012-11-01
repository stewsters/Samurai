package com.stewsters.popSim;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class Critter {

    Long id;
    //position
    PVector location;
    GroundTile onTile;

    float maxLifeSpan;
    float repRate;
    float energy =1;
    float maxEnergy = 1;
    float maxSpeed = 0.f;

    public Critter(PVector location) {
        this.location = location;
        this.id = PopulationSim.getCritterId();
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

    public abstract boolean react(PopulationSim context);

    public Long getId(){
        return id;
    }
}
