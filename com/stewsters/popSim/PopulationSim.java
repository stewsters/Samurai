package com.stewsters.popSim;

import com.stewsters.utils.SimplexNoise;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.*;

public class PopulationSim extends PApplet {

    public static final int MAX_X = 200;
    public static final int MAX_Y = 200;
    public static GroundTile[][] ground;

    public static final double scaleFactor = 50;
    public static final double scaleFactor2 = 100;
    public LinkedHashMap<Long, Critter> critters;
    LinkedList<Critter> moreCritters;
    private static Long maxCritterId = 0l;

    public static Long getCritterId() {
        return maxCritterId++;
    }

    @Override
    public void setup() {
        size(MAX_X, MAX_Y);
        frameRate(10);
        ground = new GroundTile[MAX_X][MAX_Y];
        for (int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {

                double density = SimplexNoise.noise(x / scaleFactor, y / scaleFactor) + SimplexNoise.noise(x / scaleFactor2, y / scaleFactor2) / 2;

//                System.out.println(density);

                GroundType groundType;
                if (density < 0.0)
                    groundType = GroundType.FOREST;
                else if (density < .75)
                    groundType = GroundType.GRASS;
                else
                    groundType = GroundType.HOUSE;

                ground[x][y] = new GroundTile(groundType, x, y);

            }
        }
        moreCritters = new LinkedList<Critter>();
        critters = new LinkedHashMap<Long, Critter>();
        for (int i = 0; i < 100; i++) {

            Rabbit rabbit = new Rabbit(new PVector(random(0, MAX_X), random(0, MAX_Y)));
            critters.put(rabbit.getId(), rabbit);
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

        Iterator<Critter> newCritters = moreCritters.iterator();
        while (newCritters.hasNext()) {
            Critter crit = newCritters.next();
            critters.put(crit.id, crit);
            newCritters.remove();
        }

        System.out.println(critters.size());
        Iterator<Critter> critteritter = critters.values().iterator();
        while (critteritter.hasNext()) {
            Critter critter = critteritter.next();

            if (critter.react(this)) {
                critteritter.remove();
            }

            critter.draw(this);
        }
    }

    public void addCritter(Critter critter) {
        moreCritters.add(critter);
    }

    public GroundTile findTile(PVector location) {
        int xPos = (int) location.x;
        int yPos = (int) location.y;
        return ground[Math.max(Math.min(xPos, MAX_X - 1), 0)][Math.max(Math.min(yPos, MAX_Y - 1), 0)];
    }

    public List<GroundTile> findNeighbors(GroundTile onTile, int i) {
//        System.out.println(onTile.getxPos() + " " + onTile.getyPos());
        LinkedList<GroundTile> groundTiles = new LinkedList<GroundTile>();
        for (int x = Math.max(0, onTile.getxPos() - i); x < Math.min(onTile.getxPos() + i, MAX_X - 1); x++) {
            for (int y = Math.max(0, onTile.getyPos() - i); y < Math.min(onTile.getyPos() + i, MAX_Y - 1); y++) {
                groundTiles.add(ground[x][y]);
            }
        }
        return groundTiles;
    }
}