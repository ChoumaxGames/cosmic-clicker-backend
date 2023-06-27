package com.choumaxgames.resources;

import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.planets.IPlanet;

import java.util.List;

public interface IResource {

    String getId();
    String getName();
    String getDescription();

    Class<? extends IPlanet> getPlanet();

    void addMultiplier(IBuilding multiplier);

    List<IBuilding> getMultipliers();

    void generate();

    void setGeneratingTime(long generatingTime);
    long getGeneratingTime();



}
