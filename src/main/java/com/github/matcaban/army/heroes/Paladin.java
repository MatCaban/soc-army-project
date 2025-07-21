package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Tauntable;

public class Paladin extends Hero implements Tauntable, Healable {
    public Paladin(String name) {
        super(name, Role.SUPPORT);
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " cast bubble to become invincible for 2 seconds";
    }

    @Override
    public String command() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts one enemy and heal friendly hero 1 HP";
    }
}
