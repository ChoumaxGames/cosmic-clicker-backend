package com.choumaxgames;

import com.choumaxgames.api.ApiManager;
import com.choumaxgames.api.ApiUser;
import com.choumaxgames.clicker.CosmicClicker;
import com.choumaxgames.clicker.IClicker;
import com.choumaxgames.planets.XyronPrime;
import com.choumaxgames.players.PlayerRankRecord;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        IClicker cosmicClicker = CosmicClicker.getInstance();

        cosmicClicker.addPlanets(new XyronPrime());
        cosmicClicker.setCurrentPlanet(cosmicClicker.getPlanetById(XyronPrime.PLANET_ID));
        cosmicClicker.getCurrentPlanet().getBuildings().get(0).purchase();
        cosmicClicker.getCurrentPlanet().run();

        cosmicClicker.setPlayer(ApiUser.getPlayer("61b37486-70b8-48bb-9c0d-cb754418f965"));



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