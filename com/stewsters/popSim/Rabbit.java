package com.stewsters.popSim;

import processing.core.PApplet;
import processing.core.PVector;

public class Rabbit extends Critter{

    public Rabbit(PVector location){
        super(location);
        maxSpeed = 1.f;
    }

    @Override
    public void react(PopulationSim context){
        //if on grass, eat it
        if(onTile != null && onTile.groundType == GroundType.GRASS)
        {
            onTile.groundType = GroundType.DIRT;
            energy ++;
        }else{
            //move randomly
            move(context, new PVector(1,1));
        }
    }

    public void draw(PApplet context) {
        context.stroke(255);
        context.line(location.x, location.y, location.x + 1, location.y + 1);
    }
}
