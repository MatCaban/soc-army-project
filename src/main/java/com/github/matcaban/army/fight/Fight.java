package com.github.matcaban.army.fight;

import com.github.matcaban.army.Army;
import com.github.matcaban.army.heroes.Hero;

import java.util.List;

public class Fight {
    Army aliance;
    Army horde;

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
}
