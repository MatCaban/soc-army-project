package com.github.matcaban.army.fight;

import com.github.matcaban.army.Army;

public class Fight {
    private Army attacker;
    private Army defender;

    public Fight(Army firstArmy, Army secondArmy) {

        // set who will attack first by random choosing from factions
        this.attacker = Faction.randomFaction() == firstArmy.getFaction()
                ? firstArmy
                : secondArmy;
        this.defender = attacker.getFaction() == firstArmy.getFaction()
                ? secondArmy
                : firstArmy;
    }


    public void fightStats(){
        System.out.println("-------" + this.attacker.getFaction() + " Army-------");
        this.attacker.report();

        System.out.println("\n-------" + this.defender.getFaction() + " Army-------");
        this.defender.report();
    }

    public void attackArmy(int roundIndex) {
        attacker.attack(defender);
        defender.removeDeadHero();

        // every third round it is possible for defender to heal ally
        if (roundIndex % 3 == 0) {
            defender.heal(defender);
        }

        Army temp = attacker;
        attacker = defender;
        defender = temp;
    }

}
