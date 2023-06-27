package com.choumaxgames.resources;

import com.choumaxgames.buildings.IBuilding;

import java.util.List;

public interface IResource {

    String getName();

    String getDescription();

    void addMultiplier(IBuilding multiplier);

    float countGenerationPerMinute();

    List<IBuilding> getMultipliers();

    void generate(IResource thisRessource);



}
