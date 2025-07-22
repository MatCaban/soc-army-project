package com.github.matcaban.army;

import com.github.matcaban.army.heroes.*;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        Hero warrior1 = new Warrior("war1");
        Hero paladin1 = new Paladin("pala1");
        Hero druid1 = new Druid("druid1");
        Hero hunter1 = new Hunter("hunt1");
        Hero priest1 = new Priest("priest1");
        Hero shaman1 = new Shaman("shami1");
        Hero warlock1 = new Warlock("warlock1");

        Army army = new Army(
                List.of(warrior1, paladin1, druid1, hunter1, priest1, shaman1, warlock1)
        );

        System.out.println("-------REPORT-------");
        army.report();

        System.out.println("\n-------ATTACK-------");
        army.attack();

        System.out.println("\n-------TAUNT-------");
        army.tautn();

        System.out.println("\n-------HEAL-------");
        army.heal();

        System.out.println("\n-------DEAD ALLY NEED RESURRECTION-------");
        army.resurrect();

        System.out.println("\n-------ENEMIES DEALING HUGE AMOUNT OF DAMAGE SUPPORTS DO SOMETHING-------");
        army.supportSpecialAbility();

        System.out.println("\n-------OUR HEROES ARE EXHAUSTED HEALERS WE NEED YOU-------");
        army.healerSpecialAbility();

        System.out.println("\n-------ENEMIES GOING ENRAGE TANK PROTECT YOURSELF-------");
        army.tankSpecialAbility();


        System.out.println("\n-------ENEMIES ARE AT THE EDGE OF THEIR POWER, DAMAGERS ATTACK WITH FULL POWER-------");
        army.damageSpecialAbility();

    }
}
