package com.poison.zmeika.screens;

import aurelienribon.tweenengine.Tween;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.poison.zmeika.engine.GameObject;
import com.poison.zmeika.engine.GameTweenManager;
import com.poison.zmeika.game.GameLevel;


public class GameScreen implements Screen {
    GameObject rootObject;
    OrthographicCamera camera;
    SpriteBatch mainBatch;

    public GameScreen(){
        rootObject = new GameLevel();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 600);
        mainBatch = new SpriteBatch();
    }

    @Override
    public void show() {
        Gdx.app.log(this.getClass().getSimpleName(), "show");
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        mainBatch.begin();
        rootObject.draw(delta, mainBatch);
        mainBatch.end();
        rootObject.update(delta);
        Gdx.app.log(this.getClass().getSimpleName(), "update");
        GameTweenManager.instance().getTweenManager().update(delta);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(this.getClass().getSimpleName(), "resize");
    }

    @Override
    public void pause() {
        Gdx.app.log(this.getClass().getSimpleName(), "pause");
    }

    @Override
    public void resume() {
        Gdx.app.log(this.getClass().getSimpleName(), "resume");
    }

    @Override
    public void hide() {
        Gdx.app.log(this.getClass().getSimpleName(), "hide");
    }

    @Override
    public void dispose() {
        Gdx.app.log(this.getClass().getSimpleName(), "dispose");
    }
}
