package com.choumaxgames.buildings;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.resources.IResource;

public interface IBuilding {

    String getId();

    String getName();

    String getDescription();

    Class<? extends IPlanet> getPlanet();

    Class<? extends IResource> getResource();

    int getPrice();

    void purchase();

    int getCountUpgrade();

    int getMultiplicator();

    void setup();
}
