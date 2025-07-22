package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Tauntable;

public class Druid extends Hero implements Tauntable, Damageable {
    private static final int DAMAGE_DONE = 1;
    private static final int TAUNT_CAPACITY = 1;
    private static final int SPLASH_DAMAGE_RANGE = 4;
    public Druid(String name) {
        super(name, Role.SUPPORT, DAMAGE_DONE);
    }

    @Override
    public String taunt() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts " + TAUNT_CAPACITY + " enemy";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " calls Ents for help";
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deal splash damage of " + DAMAGE_DONE + " up to " + SPLASH_DAMAGE_RANGE + " enemies";
    }
}
