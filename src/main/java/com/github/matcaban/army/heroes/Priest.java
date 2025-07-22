package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Healable;

public class Priest extends Hero implements Healable {
    private static final int DAMAGE_DONE = 0;
    private static final int HEALING_DONE = 4;
    public Priest(String name) {
        super(name, Role.HEALER, DAMAGE_DONE);
    }

    @Override
    public String heal() {
        return this.getClass().getSimpleName() + " "
                + this.name + " heal friendly hero for " + HEALING_DONE + " HP";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " enter trance and radiate healing halo";
    }
}
