package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Damageable;

public class Warlock extends Hero implements Damageable {
    public Warlock(String name) {
        super(name, Role.DAMAGE);
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deals 4 damage with shadowbolt";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " summon fellhound from other dimension";
    }
}
