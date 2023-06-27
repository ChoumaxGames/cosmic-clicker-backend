package com.choumaxgames.buildings;

import com.choumaxgames.clicker.CosmicClicker;
import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.resources.IResource;

public abstract class AbstractBuilding implements IBuilding {

    protected float initialMoneyGenerated = 1f;
    protected float priceMultiplier       = 1f;
    protected float initialPrice          = 1f;

    protected int countPurchases = 0;

    public void setup() {
        IPlanet planet = CosmicClicker.getInstance().getPlanetByClazz(this.getPlanet());
        IResource resource = planet.getResourceByClazz(this.getResource());

        resource.addMultiplier(this);
        resource.generate();
    }

    public int getPrice() {
        double price = this.initialPrice * (Math.pow(this.priceMultiplier, getCountUpgrade()));

        return (int) price;
    }

    public void purchase() {

        this.countPurchases++;
    }

    public int getCountUpgrade() {
        return this.countPurchases;
    }


    public int getMultiplicator() {
        double result = (getCountUpgrade() == 0) ? 0 : this.initialMoneyGenerated + getCountUpgrade() * 2;
        return (int) result;
    }

}
