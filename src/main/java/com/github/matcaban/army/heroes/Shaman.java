package com.github.matcaban.army.heroes;

import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Resurrectionable;

import java.util.Random;

public class Shaman extends Hero implements Healable, Resurrectionable {
    private static final int DAMAGE_DONE = 0;
    private static final int HEALING_DONE = 2;
    private static final int RESURRECTION_CAPACITY = 1;
    private static final int FULL_HEALTH = 3;
    public Shaman(String name) {
        super(name, Role.HEALER, DAMAGE_DONE, FULL_HEALTH);
    }

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
                + this.name + " ask spirits for help, they send healing rain";
    }

    @Override
    public String resurrect() {
        return this.getClass().getSimpleName() + " "
                + this.name + " bring " + RESURRECTION_CAPACITY + " dead hero to life, now he is exhausted and needs rest.";
    }
}
