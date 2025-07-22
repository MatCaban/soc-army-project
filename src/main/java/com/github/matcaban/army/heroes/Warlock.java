package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Damageable;

public class Warlock extends Hero implements Damageable {
    private static final int DAMAGE_DONE = 4;
    private static final int FULL_HEALTH = 4;
    public Warlock(String name) {
        super(name, Role.DAMAGE, DAMAGE_DONE);
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deals " + DAMAGE_DONE + " damage with shadowbolt";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " summon fellhound from other dimension";
    }
}
