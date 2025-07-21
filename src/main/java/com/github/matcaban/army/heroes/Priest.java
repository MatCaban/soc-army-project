package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Healable;

public class Priest extends Hero implements Healable {
    public Priest(String name) {
        super(name, Role.HEALER);
    }

    @Override
    public String heal() {
        return this.getClass().getSimpleName() + " "
                + this.name + " heal friendly hero for 4 HP";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " enter trance and radiate healing halo";
    }
}
