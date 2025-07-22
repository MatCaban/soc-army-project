package com.github.matcaban.army;

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
        Hero A_shaman = new Shaman("Aliance-Shaman");
        Hero A_warlock = new Warlock("Aliance-Warlock");

        Army alianceArmy = new Army(
                List.of(A_warrior, A_paladin, A_druid, A_hunter, A_priest, A_shaman, A_warlock)
        );

        Hero H_warrior = new Warrior("Horde-Warrior");
        Hero H_paladin = new Paladin("Horde-Paladin");
        Hero H_druid = new Druid("Horde-Druid");
        Hero H_hunter = new Hunter("Horde-Hunter");
        Hero H_priest = new Priest("Horde-Priest");
        Hero H_shaman = new Shaman("Horde-Shaman");
        Hero H_warlock = new Warlock("Horde-Warlock");

        Army hordeArmy = new Army(
                List.of(H_warrior, H_paladin, H_druid, H_hunter, H_priest, H_shaman, H_warlock)
        );

        Fight fight = new Fight(alianceArmy, hordeArmy);
        fight.fightStats();

        while (!hordeArmy.getArmy().isEmpty()) {
            System.out.println("\n====Round Start====");
            fight.attackArmy();
            System.out.println("\n====Round Ends====\n");
            fight.fightStats();
        }



//
//        System.out.println("\n-------ATTACK-------");
//        army.attack();
//
//        System.out.println("\n-------TAUNT-------");
//        army.tautn();
//
//        System.out.println("\n-------HEAL-------");
//        army.heal();
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
