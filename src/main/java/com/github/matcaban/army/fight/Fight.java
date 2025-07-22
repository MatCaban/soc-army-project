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

        // set who will attack first by random choosing from factions
        this.attacker = Faction.randomFaction() == firstArmy.getFaction()
                ? firstArmy
                : secondArmy;
        this.deffender = attacker.getFaction() == firstArmy.getFaction()
                ? secondArmy
                : firstArmy;
    }


    public void fightStats(){
        System.out.println("-------Aliance Army-------");
        this.firstArmy.report();

        System.out.println("\n-------Horde Army-------");
        this.secondArmy.report();
    }

    public void attackArmy(int roundIndex) {
        attacker.attack(deffender);
        deffender.removeDeadHero();

        // every third round it is possible for deffender to heal ally
        if (roundIndex % 3 == 0) {
            deffender.heal(deffender);
        }

        Army temp = attacker;
        attacker = deffender;
        deffender = temp;
    }

}
