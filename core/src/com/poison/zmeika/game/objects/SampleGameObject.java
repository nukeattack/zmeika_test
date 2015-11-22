package com.poison.zmeika.game.objects;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.equations.Bounce;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.poison.zmeika.engine.GameObject;
import com.poison.zmeika.engine.GameTweenManager;
import com.poison.zmeika.engine.TextureManager;
import com.poison.zmeika.engine.geometry.Vec2;

public class SampleGameObject extends GameObject {
    private Texture texture;
    private Sprite sprite;
    private Vec2 position = new Vec2(0,0);

    public SampleGameObject(){
        texture = TextureManager.instance().getTexture("badlogic.jpg");
        sprite = new Sprite(texture);
        Tween.to(position, Vec2.POSITION_XY, 42.0f).target(400, 300).ease(Bounce.OUT).start(tweenManager());
    }

    @Override
    public void draw(float delta, SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
        sprite.setPosition(position.getX(), position.getY());
        super.draw(delta, spriteBatch);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }
}
