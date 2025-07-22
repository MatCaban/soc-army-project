package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Resurrectionable;

public class Hunter extends Hero implements Damageable, Resurrectionable {
    private static final int DAMAGE_DONE = 4;
    private static final int FULL_HEALTH = 3;
    public Hunter(String name) {
        super(name, Role.DAMAGE, DAMAGE_DONE, FULL_HEALTH);
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deals " + DAMAGE_DONE + " damage with piercing shot";
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
