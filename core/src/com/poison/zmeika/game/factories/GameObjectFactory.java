package com.poison.zmeika.game.factories;

import com.poison.zmeika.engine.GameTweenManager;
import com.poison.zmeika.game.objects.SampleGameObject;

/**
 * Created by Stanislav_Rogovskyi on 11/19/2015.
 */
public class GameObjectFactory {
    public SampleGameObject createSampleGameObject(){
        SampleGameObject result = new SampleGameObject();
        result.setTweenManager(GameTweenManager.instance().getTweenManager());
        return result;
    }
}
