package com.choumaxgames.resources.crystals;

import com.choumaxgames.buildings.IBuilding;
import com.choumaxgames.resources.IResource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SapCrystal implements ICrystal {

    public static int crystals = 0;
    private final List<IBuilding> multipliers = new ArrayList<>();
    private boolean isGenerating = false;

    public String getName() {
        return "Cristaux de Sève";
    }

    public String getDescription() {
        return null;
    }

    public void addMultiplier(IBuilding multiplier) {
        this.multipliers.add(multiplier);
    }

    public List<IBuilding> getMultipliers() {
        return this.multipliers;
    }

    public float countGenerationPerMinute() {
        return 0;
    }

    public static float getCount() {
        return crystals;
    }

    public void generate(IResource r) {

        if (isGenerating) return;

        isGenerating = true;

        Thread t = new Thread(() -> {
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

            Runnable task = () -> {
                for (IBuilding b : r.getMultipliers()) {
                    crystals += b.getMultiplicator();
                }
            };


            scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
        });

        t.start();
    }
}
