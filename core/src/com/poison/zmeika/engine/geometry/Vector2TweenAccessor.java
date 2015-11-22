package com.poison.zmeika.engine.geometry;

import aurelienribon.tweenengine.TweenAccessor;

public class Vector2TweenAccessor implements TweenAccessor<Vec2>{
    @Override
    public int getValues(Vec2 target, int tweenType, float[] returnValues) {
        switch (tweenType) {
            case Vec2.POSITION_X: returnValues[0] = target.getX(); return 1;
            case Vec2.POSITION_Y: returnValues[0] = target.getY(); return 1;
            case Vec2.POSITION_XY:
                returnValues[0] = target.getX();
                returnValues[1] = target.getY();
                return 2;
            default: assert false; return -1;
        }
    }

    @Override
    public void setValues(Vec2 target, int tweenType, float[] newValues){
        switch (tweenType) {
            case Vec2.POSITION_X: target.setX(newValues[0]); break;
            case Vec2.POSITION_Y: target.setY(newValues[0]); break;
            case Vec2.POSITION_XY:
                target.setX(newValues[0]);
                target.setY(newValues[1]);
                break;
            default: assert false; break;
        }
    }
}
