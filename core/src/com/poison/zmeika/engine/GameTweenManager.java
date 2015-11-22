package com.poison.zmeika.engine;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import com.poison.zmeika.engine.geometry.Vec2;
import com.poison.zmeika.engine.geometry.Vector2TweenAccessor;

public class GameTweenManager {
    private static GameTweenManager instance;
    private TweenManager tweenManager;

    public GameTweenManager(){

    }

    public void init(){
        Tween.registerAccessor(Vec2.class, new Vector2TweenAccessor());
        setTweenManager(new TweenManager());
    }

    public static GameTweenManager instance(){
        if(instance == null){
            instance = new GameTweenManager();
        }
        return instance;
    }

    public TweenManager getTweenManager() {
        return tweenManager;
    }

    public void setTweenManager(TweenManager tweenManager) {
        this.tweenManager = tweenManager;
    }
}
