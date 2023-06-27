package com.choumaxgames.buildings;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.planets.XyronPrime;
import com.choumaxgames.resources.IResource;
import com.choumaxgames.resources.crystals.SapCrystal;

public class Arboretum implements IBuilding {

    private int countPurchases = 0;

    public String getName() {
        return "Arboretum";
    }


    public Class<? extends IPlanet> getPlanet() {
        return XyronPrime.class;
    }

    public void setup(IResource resource) {
        resource.addMultiplier(this);
    }

    public int getPrice() {
        float multiplicator = 1.15f;
        float initialPrice = 100;
        double price = initialPrice * (Math.pow(multiplicator, getCountUpgrade()));

        return (int)price;
    }

    public void purchase() {
        this.countPurchases++;
    }

    public int getCountUpgrade() {
        return this.countPurchases;
    }


    public int getMultiplicator() {
        int baseGenerated = 5;
        double result = (getCountUpgrade() == 0) ? 0 : baseGenerated + getCountUpgrade() * 2;
        return (int) result;
    }

    public Class<? extends IResource> getRelatedResource() {
        return SapCrystal.class;
    }
}
