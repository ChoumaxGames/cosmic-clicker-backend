package com.choumaxgames.buildings;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.resources.IResource;

public interface IBuilding {

    String getName();
    Class<? extends IPlanet> getPlanet();
    int getPrice();
    void purchase();
    void setup(IResource resource);
    int getCountUpgrade();
    int getMultiplicator();
    Class<? extends IResource> getRelatedResource();
}
