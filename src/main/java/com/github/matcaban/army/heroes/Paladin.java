package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Tauntable;

import java.util.Random;

public class Paladin extends Hero implements Tauntable, Healable {
    private static final int DAMAGE_DONE = 0;
    private static final int TAUNT_CAPACITY = 1;
    private static final int HEALING_DONE = 2;
    private static final int BUBBLE_DURATION = 2;
    private static final int FULL_HEALTH = 6;
    public Paladin(String name) {
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
                + this.name + " cast bubble to become invincible for " + BUBBLE_DURATION + " seconds";
    }

    // healing is calculating randomly between 1 and max healing done
    @Override
    public int heal(Hero ally) {
        int healingDone = new Random().nextInt(HEALING_DONE) +1;
        System.out.println(this.getClass().getSimpleName() + " "
                + this.name + " heal friendly hero " + ally.getName() + " of " + healingDone + " HP");
        return healingDone;
    }
}
