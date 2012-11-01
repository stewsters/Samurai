package com.stewsters.popSim;

import processing.core.PApplet;
import processing.core.PVector;

public class Rabbit extends Critter{

    public Rabbit(PVector location){
        super(location);
        maxSpeed = 1.f;
        maxEnergy = 5f;
        energy = 4f;
    }

    @Override
    public boolean react(PopulationSim context){

        if(energy <=0)
        {
            return true;
            //die
        }else if( energy > 4){
            //reproduct
            PVector birthLocation = location.get();
            birthLocation.add(new PVector(3f,3f));
            Rabbit child = new Rabbit(birthLocation);
            context.addCritter(child);
            energy -= 3;
        }


        //if on grass, eat it
        if(onTile != null && onTile.groundType == GroundType.GRASS && energy < maxEnergy)
        {
            onTile.groundType = GroundType.DIRT;
            energy ++;
        }else{
            //move randomly
            move(context, new PVector(1,1));
            energy -= 0.1;
        }

        //living expense
        energy -= 0.1;
        return false;
    }

    public void draw(PApplet context) {
        context.stroke(255);
        context.line(location.x, location.y, location.x + 1, location.y + 1);
    }
}
