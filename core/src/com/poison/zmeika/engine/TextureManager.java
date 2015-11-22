package com.poison.zmeika.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class TextureManager {
    private Map<String, Texture> textureCache = new HashMap<String, Texture>();
    private static TextureManager instance;

    public static TextureManager instance(){
        if(instance == null){
            instance = new TextureManager();
        }
        return instance;
    }

    public Texture getTexture(String path){
        if(textureCache.containsKey(path)){
            return textureCache.get(path);
        }
        Texture texture;
        textureCache.put(path, texture = new Texture(Gdx.files.internal(path)));
        return texture;
    }
}
