package com.github.matcaban.army.fight;

import com.github.matcaban.army.Army;
import com.github.matcaban.army.heroes.Hero;

import java.util.List;
import java.util.Random;

public class Fight {
    private final Army aliance;
    private final Army horde;

    public Fight(Army aliance, Army horde) {
        this.aliance = aliance;
        this.horde = horde;
    }

    public void fightStats(){
        System.out.println("-------Aliance-------");
        this.aliance.report();

        System.out.println("\n-------Horde-------");
        this.horde.report();
    }

    public void attackArmy() {
        aliance.attack(horde);
        horde.removeDeadHero();
    }


}
