package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Tauntable;

import java.util.Random;

public class Druid extends Hero implements Tauntable, Damageable {
    private static final int DAMAGE_DONE = 3;
    private static final int TAUNT_CAPACITY = 1;
    private static final int FULL_HEALTH = 7;
    public Druid(String name) {
        super(name, Role.SUPPORT, DAMAGE_DONE, FULL_HEALTH);
    }

    @Override
    public String taunt() {
        return this.getClass().getSimpleName() + " "
                + this.name + " taunts " + TAUNT_CAPACITY + " enemy";
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " calls Ents for help";
    }

    // damage is calculating randomly chosen between 1 and max damage done
    @Override
    public int dealDamage(Hero enemy) {
        int damageDealt = new Random().nextInt(DAMAGE_DONE) + 1;
        System.out.println(this.getClass().getSimpleName() + " "
                + this.name + " deal " + damageDealt + " damage to " + enemy.getName());
        return damageDealt;
    }
}
