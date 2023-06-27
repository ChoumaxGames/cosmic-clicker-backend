package com.choumaxgames.planets;

import com.choumaxgames.buildings.Arboretum;
import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.IResource;
import com.choumaxgames.resources.crystals.SapCrystal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * First Planet
 */
public class XyronPrime implements IPlanet {

    List<IBuilding> buildings = new ArrayList<>();
    List<IResource> resources = new ArrayList<>();

    public XyronPrime() {
        resources.add(new SapCrystal());
        buildings.add(new Arboretum());
    }


    public String getName() {
        return "XyronPrime";
    }

    public String getDescription() {
        return "Xyron Prime est une planète recouverte de jungles luxuriantes et abritant une flore et une faune extrêmement diversifiées. " +
                "Les vastes forêts cachent de précieuses ressources naturelles et des secrets mystérieux.";
    }

    public List<IBuilding> getBuildings() {
        return buildings;
    }

    public List<IResource> getResources() {
        return resources;
    }

    public boolean canUpgradeNewPlanet() {
        return false;
    }

    public void run() {

        for (IBuilding b : this.getBuildings()) {
            Optional<? extends IResource> resource = this.getResources().stream().filter(clazz -> clazz.getClass() == b.getRelatedResource()).findFirst();

            if(resource.isPresent()) {
                IResource r = resource.get();
                b.setup(r);
                r.generate(r);
            }
        }
    }
}
