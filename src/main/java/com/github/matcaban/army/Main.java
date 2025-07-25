package com.github.matcaban.army;

import com.github.matcaban.army.fight.Faction;
import com.github.matcaban.army.fight.Fight;
import com.github.matcaban.army.heroes.*;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        Hero A_warrior = new Warrior("Aliance-Warrior");
        Hero A_paladin = new Paladin("Aliance-Paladin");
        Hero A_druid = new Druid("Aliance-Druid");
        Hero A_hunter = new Hunter("Aliance-Hunter");
        Hero A_priest = new Priest("Aliance-Priest");
        Hero A_warlock = new Warlock("Aliance-Warlock");

        Army alianceArmy = new Army(
                List.of(A_warrior, A_paladin, A_druid, A_hunter, A_priest, A_warlock), Faction.ALIANCE
        );

        Hero H_warrior = new Warrior("Horde-Warrior");
        Hero H_shaman = new Shaman("Horde-Shaman");
        Hero H_druid = new Druid("Horde-Druid");
        Hero H_hunter = new Hunter("Horde-Hunter");
        Hero H_priest = new Priest("Horde-Priest");
        Hero H_warlock = new Warlock("Horde-Warlock");

        Army hordeArmy = new Army(
                List.of(H_warrior, H_shaman, H_druid, H_hunter, H_priest, H_warlock), Faction.HORDE
        );

        Fight fight = new Fight(alianceArmy, hordeArmy);
        fight.fightStats();

        int roundCounter = 1;
        while (!hordeArmy.getArmy().isEmpty() && !alianceArmy.getArmy().isEmpty()) {

            // the fight ends when there are no more damageable heroes alive
            if (hordeArmy.areAllDamageableDead() || alianceArmy.areAllDamageableDead()) {
                break;
            }

            System.out.println("\n====Round " + roundCounter + " Start====\n");
            fight.attackArmy(roundCounter);
            System.out.println("\n====Round " + roundCounter + " Ends====\n");
            fight.fightStats();
            roundCounter++;
        }

        System.out.println(hordeArmy.getArmy().size() > alianceArmy.getArmy().size()
                ? "\n====HORDE WINS===="
                : "\n====ALIANCE WINS====");




//        System.out.println("\n-------TAUNT-------");
//        army.tautn();

//
//        System.out.println("\n-------DEAD ALLY NEED RESURRECTION-------");
//        army.resurrect();
//
//        System.out.println("\n-------ENEMIES DEALING HUGE AMOUNT OF DAMAGE SUPPORTS DO SOMETHING-------");
//        army.supportSpecialAbility();
//
//        System.out.println("\n-------OUR HEROES ARE EXHAUSTED HEALERS WE NEED YOU-------");
//        army.healerSpecialAbility();
//
//        System.out.println("\n-------ENEMIES GOING ENRAGE TANK PROTECT YOURSELF-------");
//        army.tankSpecialAbility();
//
//
//        System.out.println("\n-------ENEMIES ARE AT THE EDGE OF THEIR POWER, DAMAGERS ATTACK WITH FULL POWER-------");
//        army.damageSpecialAbility();

    }
}
