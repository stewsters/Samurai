package com.stewsters.popSim;

import processing.core.PApplet;

public class GroundTile {

    private GroundType groundType;
    private int xPos;
    private int yPos;


    public GroundTile(GroundType groundType, int x, int y) {
        this.xPos = x;
        this.yPos = y;
        this.groundType = groundType;
    }

    public void draw(PApplet context, int x, int y) {
        if (groundType == GroundType.GRASS)
            context.stroke(50, 200, 50);
        else if (groundType == GroundType.DIRT)
            context.stroke(146, 111, 91);
        else if (groundType == GroundType.FOREST)
            context.stroke(10, 100, 50);
        else if (groundType == GroundType.HOUSE)
            context.stroke(200, 200, 200);
        else if (groundType == GroundType.WHEAT)
            context.stroke(245, 222, 179);
        else
            context.stroke(0);
        context.rect(x, y, 1, 1);
    }

    public void grow() {
        if (groundType == GroundType.DIRT) {
            groundType = GroundType.GRASS;
        }
    }


    //getters and setters
    public GroundType getGroundType() {
        return groundType;
    }

    public void setGroundType(GroundType groundType) {
        this.groundType = groundType;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

}
