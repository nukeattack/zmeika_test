package com.poison.zmeika.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.poison.zmeika.engine.GameObject;
import com.poison.zmeika.game.objects.SampleGameObject;

public class GameLevel extends GameObject {
    private int width = 10;
    private int height = 10;

    public GameLevel(){
        addChild(new SampleGameObject());
    }

    @Override
    public void draw(float delta, SpriteBatch spriteBatch) {
        super.draw(delta, spriteBatch);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }
}
