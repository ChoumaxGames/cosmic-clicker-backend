package com.choumaxgames.resources.crystals;

import com.choumaxgames.Clicker.CosmicClicker;
import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.planets.XyronPrime;
import com.choumaxgames.resources.IResource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SapCrystal extends AbstractCrystal {

    public String getId() {
        return "C-SAPCRYSTAL";
    }
    public String getName() {
        return "Cristaux de Sève";
    }

    public String getDescription() {
        return null;
    }

    @Override
    public Class<? extends IPlanet> getPlanet() {
        return XyronPrime.class;
    }
}
