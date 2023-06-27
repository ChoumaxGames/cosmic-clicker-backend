package com.choumaxgames.clicker;

import com.choumaxgames.planets.IPlanet;

import java.util.List;

public interface IClicker {
    IPlanet getPlanetById(String id);
    IPlanet getPlanetByClazz(Class<? extends IPlanet> clazz);
    void addPlanets(IPlanet... planets);

    List<IPlanet> getPlanetList();

    IPlanet getCurrentPlanet();
    void setCurrentPlanet(IPlanet planet);

    long getEssences();
    void addEssences(long essences);

}
