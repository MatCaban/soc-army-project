package com.github.matcaban.army.fight;

import com.github.matcaban.army.Army;
import com.github.matcaban.army.heroes.Faction;

public class Fight {
    private final Army firstArmy;
    private final Army secondArmy;
    private Army attacker;
    private Army deffender;

    public Fight(Army firstArmy, Army secondArmy) {
        this.firstArmy = firstArmy;
        this.secondArmy = secondArmy;
        this.attacker = Faction.randomFaction() == firstArmy.getFaction()
                ? firstArmy
                : secondArmy;
        this.deffender = attacker.getFaction() == firstArmy.getFaction()
                ? secondArmy
                : firstArmy;
    }


    public void fightStats(){
        System.out.println("-------Aliance-------");
        this.firstArmy.report();

        System.out.println("\n-------Horde-------");
        this.secondArmy.report();
    }

    public void attackArmy() {
        attacker.attack(deffender);
        deffender.removeDeadHero();
        Army temp = attacker;
        attacker = deffender;
        deffender = temp;
    }


}
