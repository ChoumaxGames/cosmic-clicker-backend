package com.choumaxgames.resources.essences;

import com.choumaxgames.clicker.CosmicClicker;
import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.AbstractResource;

public abstract class AbstractEssence extends AbstractResource {

    protected Runnable getTask() {
        return () -> {
            for (IBuilding b : this.getMultipliers()) {
                CosmicClicker.getInstance().addEssences(b.getMultiplicator());
            }
        };
    };

}
