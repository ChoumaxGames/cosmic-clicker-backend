package com.choumaxgames.resources.essences;

import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.planets.XyronPrime;

import java.util.List;

public class SylvanEssence extends AbstractEssence{

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Class<? extends IPlanet> getPlanet() {
        return XyronPrime.class;
    }
}
