package com.choumaxgames.planets;

import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.IResource;

import java.util.List;

public interface IPlanet {


    String getId();
    String getName();
    String getDescription();

    long getCrystals();
    void addCrystal(long crystal);

    List<IBuilding> getBuildings();
    List<IResource> getResources();

    IBuilding getBuildingByClazz(Class<? extends IBuilding> clazz);
    IResource getResourceByClazz(Class<? extends IResource> clazz);

    boolean canUpgradeNewPlanet();

    void run();
}
