package com.choumaxgames;

import com.choumaxgames.planets.IPlanet;

import java.util.ArrayList;
import java.util.List;

public class CosmicClicker {

    private final List<IPlanet> planets = new ArrayList<>();
    private final long essenceCount = 0L;
    private final long score = 0L;

    public CosmicClicker() {

    }

    IPlanet getLastPlanet() {
        return planets.get(planets.size() - 1);
    }

    void addPlanet(IPlanet planet) {
        if (!planets.contains(planet)) {
            planets.add(planet);
        }
    }

    long getScore() {
        return this.score;
    }

    long getEssence() {
        return this.essenceCount;
    }


}
