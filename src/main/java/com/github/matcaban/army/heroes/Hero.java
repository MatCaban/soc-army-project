package com.github.matcaban.army.heroes;

import com.github.matcaban.army.Role;

public abstract class Hero {
    protected String name;
    protected Role role;

    public Hero(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public abstract String castSpecialAbility();

    @Override
    public String toString() {
        return Hero.class.getSimpleName() + " " +
                this.getClass().getSimpleName() + " " + this.name + " here. Type: - " + this.role;
    }


}
