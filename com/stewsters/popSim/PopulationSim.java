package com.stewsters.popSim;

import com.stewsters.utils.SimplexNoise;
import processing.core.PApplet;

public class PopulationSim extends PApplet {

    public static final int MAX_X = 1000;
    public static final int MAX_Y = 1000;
    public static GroundTile[][] ground;

    public static final double scaleFactor = 100;

    @Override
    public void setup() {
        size(MAX_X,MAX_Y);
        frameRate(1);
        ground = new GroundTile[MAX_X][MAX_Y];
        for (int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {

                double density = SimplexNoise.noise(x / scaleFactor, y / scaleFactor);

                System.out.println(density);

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
    }

    @Override
    public void draw(){
        background(0);
        for (int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {
                ground[x][y].draw(this,x,y);
            }
        }
    }


}
