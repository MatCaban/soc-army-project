package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Resurrectionable;

import java.util.Random;

public class Hunter extends Hero implements Damageable, Resurrectionable {
    private static final int DAMAGE_DONE = 4;
    private static final int FULL_HEALTH = 6;
    public Hunter(String name) {
        super(name, Role.DAMAGE, DAMAGE_DONE, FULL_HEALTH);
    }


    // damage is calculating randomly chosen between 1 and max damage done
    @Override
    public int dealDamage(Hero enemy) {
        int damageDealt = new Random().nextInt(DAMAGE_DONE) + 1;
        System.out.println(this.getClass().getSimpleName() + " "
                + this.name + " deal " + damageDealt + " damage to " + enemy.getName());
        return damageDealt;
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " command his pet to get frenzy";
    }

    @Override
    public String resurrect() {
        return this.getClass().getSimpleName() + " "
                + this.name + " brings his pet back to life, now Hero is to week to attack.";
    }
}
