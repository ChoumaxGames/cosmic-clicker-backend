package com.choumaxgames.buildings;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.planets.XyronPrime;
import com.choumaxgames.resources.IResource;
import com.choumaxgames.resources.crystals.SapCrystal;

public class Arboretum extends AbstractBuilding {

    protected float initialMoneyGenerated = 5f;
    protected float priceMultiplier       = 1.15f;
    protected float initialPrice          = 100f;

    public String getId() {
        return "B-ARB";
    }

    public String getName() {
        return "Arboretum";
    }

    public String getDescription() {
        return null;
    }

    public Class<? extends IPlanet> getPlanet() {
        return XyronPrime.class;
    }

    public Class<? extends IResource> getResource() {
        return SapCrystal.class;
    }
}
