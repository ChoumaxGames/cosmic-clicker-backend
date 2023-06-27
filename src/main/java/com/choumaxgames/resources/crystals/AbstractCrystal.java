package com.choumaxgames.resources.crystals;

import com.choumaxgames.clicker.CosmicClicker;
import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.AbstractResource;

public abstract class AbstractCrystal extends AbstractResource {

    protected Runnable getTask() {
        return () -> {
            for (IBuilding b : this.getMultipliers()) {
                CosmicClicker.getInstance().getPlanetByClazz(this.getPlanet()).addCrystal(b.getMultiplicator());
            }
        };
    };

}
