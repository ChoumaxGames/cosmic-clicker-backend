package com.choumaxgames.planets;

import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.IResource;

import java.util.List;

public interface IPlanet {

    String getName();
    String getDescription();
    List<IBuilding> getBuildings();
    List<IResource> getResources();
    boolean canUpgradeNewPlanet();

    void run();
}
