package com.stewsters.popSim;

import processing.core.PApplet;

public class GroundTile {

    GroundType groundType;

    public GroundTile(GroundType groundType){
        this.groundType = groundType;
    }

    public void draw(PApplet context, int x, int y){
        if(groundType==GroundType.GRASS)
            context.stroke(50,200,50);
        else if(groundType==GroundType.FOREST)
            context.stroke(10,100,50);
        else if (groundType == GroundType.HOUSE)
            context.stroke(200,200,200);
        else if (groundType == GroundType.WHEAT)
            context.stroke(245,222,179);
        else
            context.stroke(0);
        context.rect(x,y,1,1);
    }

}
