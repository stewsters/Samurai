package com.stewsters.popSim;

import com.stewsters.utils.SimplexNoise;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class PopulationSim extends PApplet {

    public static final int MAX_X = 500;
    public static final int MAX_Y = 500;
    public static GroundTile[][] ground;

    public static final double scaleFactor = 100;

    public ArrayList<Critter> critters;

    @Override
    public void setup() {
        size(MAX_X, MAX_Y);
        frameRate(10);
        ground = new GroundTile[MAX_X][MAX_Y];
        for (int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {

                double density = SimplexNoise.noise(x / scaleFactor, y / scaleFactor);

//                System.out.println(density);

                GroundType groundType;
                if (density < 0.0)
                    groundType = GroundType.FOREST;
                else if (density < .75)
                    groundType = GroundType.GRASS;
                else
                    groundType = GroundType.HOUSE;

                ground[x][y] = new GroundTile(groundType);

            }
        }

        critters = new ArrayList<Critter>();
        for (int i = 0; i < 100; i++){
            critters.add(new Rabbit(new PVector(random(0,MAX_X),random(0,MAX_Y))));
        }
    }

    @Override
    public void draw() {
        background(0);
        for (int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {
                ground[x][y].draw(this, x, y);
            }
        }
        for (Critter critter : critters) {
            critter.react(this);
            critter.draw(this);
        }
    }

    public GroundTile findTile(PVector location){
        int xPos = (int)location.x;
        int yPos = (int)location.y;
        return ground[xPos][yPos];
    }
}