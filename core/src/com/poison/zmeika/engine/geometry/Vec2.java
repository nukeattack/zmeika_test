package com.poison.zmeika.engine.geometry;

public class Vec2 {
    // constants for tween engine to determine which field will be used in interpolation
    public static final int POSITION_X = 1;
    public static final int POSITION_Y = 2;
    public static final int POSITION_XY = 3;

    private float x = 0;
    private float y = 0;

    public Vec2(float x, float y){
        this.setX(x);
        this.setY(y);
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
