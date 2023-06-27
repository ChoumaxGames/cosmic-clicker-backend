package com.choumaxgames;

import com.choumaxgames.planets.XyronPrime;
import com.choumaxgames.resources.crystals.SapCrystal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CosmicClicker cc = new CosmicClicker();
        cc.addPlanet(new XyronPrime());

        cc.getLastPlanet().run();

        cc.getLastPlanet().getBuildings().get(0).purchase();

        boolean purchased = false;

        while(true) {

            System.out.println(SapCrystal.getCount());
            if(SapCrystal.getCount() > 500f && !purchased) {
                purchased = true;
                cc.getLastPlanet().getBuildings().get(0).purchase();
            }

            Thread.sleep(950);



        }
    }
}