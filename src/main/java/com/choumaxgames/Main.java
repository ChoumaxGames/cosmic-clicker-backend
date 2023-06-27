package com.choumaxgames;

import com.choumaxgames.Clicker.CosmicClicker;
import com.choumaxgames.Clicker.IClicker;
import com.choumaxgames.planets.XyronPrime;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        IClicker cosmicClicker = CosmicClicker.getInstance();

        cosmicClicker.addPlanets(new XyronPrime());
        cosmicClicker.setCurrentPlanet(cosmicClicker.getPlanetById(XyronPrime.PLANET_ID));
        cosmicClicker.getCurrentPlanet().getBuildings().get(0).purchase();
        cosmicClicker.getCurrentPlanet().run();



        boolean purchased = false;

        while(true) {

            System.out.println("Essences: " + cosmicClicker.getCurrentPlanet().getCrystals());
            if(cosmicClicker.getCurrentPlanet().getCrystals() > 30f && !purchased) {
                purchased = true;
                cosmicClicker.getCurrentPlanet().getBuildings().get(0).purchase();
            }

            Thread.sleep(950);
        }
    }
}