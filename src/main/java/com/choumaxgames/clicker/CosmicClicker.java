package com.choumaxgames.clicker;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.players.PlayerRecord;

import java.util.ArrayList;
import java.util.List;

public class CosmicClicker implements IClicker {

    private static IClicker _instance;

    private long          essenceCount  = 0L;
    private List<IPlanet> planets       = new ArrayList<>();
    private IPlanet       currentPlanet = null;

    public static IClicker getInstance() {
        if (_instance == null) {
            _instance = new CosmicClicker();
        }
        return _instance;
    }

    public void addPlanets(IPlanet... planets) {
        for (IPlanet planet : planets) {
            if (!this.planets.contains(planet)) {
                this.planets.add(planet);
            }
        }
    }

    public List<IPlanet> getPlanetList() {
        return this.planets;
    }

    public IPlanet getPlanetById(String id) {
        return this.getPlanetList().stream().filter(planet -> planet.getId().equals(id)).findFirst().orElse(null);
    }

    public IPlanet getPlanetByClazz(Class<? extends IPlanet> clazz) {
        return this.getPlanetList().stream().filter(planet -> planet.getClass().equals(clazz)).findFirst().orElse(null);
    }

    public IPlanet getCurrentPlanet() {
        return this.currentPlanet;
    }

    public PlayerRecord getPlayer() {
        return null;
    }

    public void setCurrentPlanet(IPlanet planet) {
        this.currentPlanet = planet;
    }

    public void setPlayer(PlayerRecord player) {

    }

    public long getEssences() {
        return this.essenceCount;
    }

    public void addEssences(long essences) {
        this.essenceCount += essences;
    }
    private CosmicClicker() {
    }
}
