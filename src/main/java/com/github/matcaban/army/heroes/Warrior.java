package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Tauntable;

public class Warrior extends Hero implements Tauntable {
    public Warrior(String name) {
        super(name, Role.TANK);
    }

    @Override
    public String taunt() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts 3 enemies";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " rise his shield to took huge amount of damage";
    }
}
