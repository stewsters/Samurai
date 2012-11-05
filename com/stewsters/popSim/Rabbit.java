package com.stewsters.popSim;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.List;

public class Rabbit extends Critter {

//    PVector goal; // better than going to 1,1

    public Rabbit(PVector location) {
        super(location);
        maxSpeed = 1.f;
        maxEnergy = 5f;
        energy = 4f;
    }

    @Override
    public boolean react(PopulationSim context) {

        if (onTile == null) {
            onTile = context.findTile(location);
        }

        if (energy <= 0) {
            return true;
            //die
        } else if (energy > 4) {
            //reproduct
            PVector birthLocation = location.get();
            birthLocation.add(new PVector(3f, 3f));
            Rabbit child = new Rabbit(birthLocation);
            context.addCritter(child);
            energy -= 3;
        }

        //if on grass, eat it
        if (onTile != null && onTile.getGroundType() == GroundType.GRASS && energy < maxEnergy) {
            onTile.setGroundType(GroundType.DIRT);
            energy++;
        } else {
            //find a square nearby that has grass, make for it

            List<GroundTile> neighbors = context.findNeighbors(onTile, 4);

            PVector destination = null;
            for (GroundTile neighbor : neighbors) {
                if (neighbor.getGroundType() == GroundType.GRASS) {
                    destination = new PVector(neighbor.getxPos(), neighbor.getyPos());
                    break;
                }
            }

            if (destination == null)
                destination = new PVector(1, 1);


            move(context, destination);
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
