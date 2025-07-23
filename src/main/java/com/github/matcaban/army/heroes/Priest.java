package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Healable;

import java.util.Random;

public class Priest extends Hero implements Healable {
    private static final int DAMAGE_DONE = 0;
    private static final int HEALING_DONE = 3;
    private static final int FULL_HEALTH = 4;
    public Priest(String name) {
        super(name, Role.HEALER, DAMAGE_DONE, FULL_HEALTH);
    }


    // healing is calculating randomly chosen between 1 and max healing done
    @Override
    public int heal(Hero ally) {
        int healingDone = new Random().nextInt(HEALING_DONE) +1;
        System.out.println(this.getClass().getSimpleName() + " "
                + this.name + " heal friendly hero " + ally.getName() + " of " + healingDone + " HP");
        return healingDone;
    }

    @Override
    public String castSpecialAbility() {
        return this.getClass().getSimpleName() + " "
                + this.name + " enter trance and radiate healing halo";
    }
}
