package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Tauntable;

public class Druid extends Hero implements Tauntable, Damageable {
    public Druid(String name) {
        super(name, Role.SUPPORT);
    }

    @Override
    public String taunt() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts one enemy";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " calls Ents for help";
    }

    @Override
    public String dealDamage() {
        return this.getClass().getSimpleName() + " "
                + this.name + " deal splash damage up to 4 enemies";
    }
}
