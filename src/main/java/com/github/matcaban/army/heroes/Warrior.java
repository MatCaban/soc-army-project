package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Tauntable;

public class Warrior extends Hero implements Tauntable {
    private static final int DAMAGE_DONE = 0;
    private static final int FULL_HEALTH = 9;
    private static final int TAUNT_CAPACITY = 3;
    public Warrior(String name) {
        super(name, Role.TANK, DAMAGE_DONE, FULL_HEALTH);
    }

    @Override
    public String taunt() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts " + TAUNT_CAPACITY + " enemies";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " rise his shield to took huge amount of damage";
    }
}
