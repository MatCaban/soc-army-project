package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Ressurectionable;

public class Hunter extends Hero implements Damageable, Ressurectionable {
    public Hunter(String name) {
        super(name, Role.DAMAGE);
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deals 5 damage with piercing shot";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " command his pet to get frenzy";
    }

    @Override
    public String ressurect() {
        return this.getClass().getSimpleName() + " "
                + this.name + " brings his pet back to life, now Hero is to week to attack.";
    }
}
