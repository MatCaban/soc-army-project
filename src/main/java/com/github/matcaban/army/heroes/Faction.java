package com.github.matcaban.army.heroes;

import java.util.Random;

public enum Faction {
    ALIANCE, HORDE;

    private static final Faction[] factions = values();
    private static final Random random = new Random();

    public static Faction randomFaction() {
        return factions[random.nextInt(factions.length)];
    }
}
