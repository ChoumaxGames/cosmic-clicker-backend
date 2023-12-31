package com.choumaxgames.planets;

import com.choumaxgames.buildings.Arboretum;
import com.choumaxgames.resources.crystals.SapCrystal;

/**
 * First Planet
 */
public class XyronPrime extends AbstractPlanet {

    public static final String PLANET_ID = "P-XP";

    public XyronPrime() {
        resources.add(new SapCrystal());
        buildings.add(new Arboretum());
    }

    @Override
    public String getId() {
        return PLANET_ID;
    }

    public String getName() {
        return "XyronPrime";
    }

    public String getDescription() {
        return "Xyron Prime est une planète recouverte de jungles luxuriantes et abritant une flore et une faune extrêmement diversifiées. " +
               "Les vastes forêts cachent de précieuses ressources naturelles et des secrets mystérieux.";
    }
}
