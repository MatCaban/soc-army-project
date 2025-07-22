package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Damageable;

import java.util.Random;

public class Warlock extends Hero implements Damageable {
    private static final int DAMAGE_DONE = 5;
    private static final int FULL_HEALTH = 4;
    public Warlock(String name) {
        super(name, Role.DAMAGE, DAMAGE_DONE, FULL_HEALTH);
    }


    // damage is calculating randomly between 1 and max damage done
    @Override
    public int dealDamage(Hero enemy) {
        int damageDealt = new Random().nextInt(DAMAGE_DONE) + 1;
        System.out.println(this.getClass().getSimpleName() + " "
                + this.name + " deal " + damageDealt + " damage to " + enemy.getName());
        return damageDealt;
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " summon fellhound from other dimension";
    }
}
