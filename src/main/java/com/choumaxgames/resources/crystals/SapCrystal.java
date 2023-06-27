package com.choumaxgames.resources.crystals;

import com.choumaxgames.planets.IPlanet;
import com.choumaxgames.planets.XyronPrime;

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
