package com.choumaxgames.clicker;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.players.PlayerRecord;

import java.util.List;

public interface IClicker {
    IPlanet getPlanetById(String id);
    IPlanet getPlanetByClazz(Class<? extends IPlanet> clazz);
    void addPlanets(IPlanet... planets);

    List<IPlanet> getPlanetList();

    IPlanet getCurrentPlanet();
    PlayerRecord getPlayer();
    void setCurrentPlanet(IPlanet planet);
    void setPlayer(PlayerRecord player);

    long getEssences();
    void addEssences(long essences);

}
