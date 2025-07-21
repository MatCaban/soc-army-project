package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Ressurectionable;

public class Shaman extends Hero implements Healable, Ressurectionable {
    public Shaman(String name) {
        super(name, Role.HEALER);
    }

    @Override
    public String heal() {
        return this.getClass().getSimpleName() + " "
                + this.name + " heal up to 3 friendly heroes for 1 HP";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " ask spirits for help, they send healing rain";
    }

    @Override
    public String ressurect() {
        return this.getClass().getSimpleName() + " "
                + this.name + " bring one dead hero to life, now he is exhousted and needs rest.";
    }
}
