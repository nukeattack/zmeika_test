package com.poison.zmeika.engine;

import aurelienribon.tweenengine.TweenManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.LinkedList;
import java.util.List;

public class GameObject {
    private List<GameObject> children;
    private static TweenManager tweenManager;

    public GameObject(){
        children = new LinkedList<GameObject>();
    }

    public void draw(float delta, SpriteBatch spriteBatch){
        for(int i = 0; i < children.size(); i++){
            children.get(i).draw(delta, spriteBatch);
        }
    }

    public void update(float delta){
        for(int i = 0; i < children.size(); i++){
            children.get(i).update(delta);
        }
    }

    public List<GameObject> getChildren() {
        return children;
    }

    public void addChild(GameObject gameObject){
        children.add(gameObject);
    }

    public static void setTweenManager(TweenManager tweenManager){
        GameObject.tweenManager = tweenManager;
    }

    public static TweenManager tweenManager(){
        return GameTweenManager.instance().getTweenManager();
    }
}
