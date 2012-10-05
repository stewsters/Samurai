package com.stewsters.samurai.utility;

import javax.vecmath.Tuple2i;

public class Distance {
    public static double getDistance(Tuple2i t1, Tuple2i t2) {
        return Math.sqrt(((t1.x - t2.x) ^ 2 + (t1.y - t2.y) ^ 2));
    }

    public static int getDistanceSquared(Tuple2i t1, Tuple2i t2) {
        return ((t1.x - t2.x) ^ 2 + (t1.y - t2.y) ^ 2);
    }
}
