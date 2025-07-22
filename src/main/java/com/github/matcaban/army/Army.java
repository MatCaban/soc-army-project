package com.github.matcaban.army;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Resurrectionable;
import com.github.matcaban.army.commands.Tauntable;
import com.github.matcaban.army.heroes.Hero;
import com.github.matcaban.army.heroes.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {
    private List<Hero> army;

    public Army(List<Hero> army) {
        this.army = new ArrayList<>(army);
    }

    public List<Hero> getArmy() {
        return army;
    }

    public void report() {
        for (Hero hero : army) {
            System.out.println(hero);
        }
    }

    public void attack(Army enemyArmy) {
        for (Hero hero : this.army) {
            if (hero instanceof Damageable) {
                Hero enemyHero = getRandomHero(enemyArmy);
                int damageDealt = ((Damageable) hero).dealDamage(enemyHero);
                enemyHero.looseHP(damageDealt);
            }
        }
    }


    public void removeDeadHero() {
        army.removeIf(hero -> hero.getHealthPoints() <= 0);
    }

    private Hero getRandomHero(Army army) {
        int randomHeroIndex = new Random().nextInt(army.getArmy().size());
        return army.getArmy().get(randomHeroIndex);
    }

    public void tautn() {
        for (Hero hero : army) {
            if (hero instanceof Tauntable) {
                System.out.println(((Tauntable) hero).taunt());
            }
        }
    }

    public void heal() {
        for (Hero hero : army) {
            if (hero instanceof Healable) {
                System.out.println(((Healable) hero).heal());
            }
        }
    }

    public void resurrect() {
        for (Hero hero : army) {
            if (hero instanceof Resurrectionable) {
                System.out.println(((Resurrectionable) hero).resurrect());
            }
        }
    }

    public void supportSpecialAbility() {
        for (Hero hero : army) {
            if (hero.getRole() == Role.SUPPORT) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void tankSpecialAbility() {
        for (Hero hero : army) {
            if (hero.getRole() == Role.TANK) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void damageSpecialAbility() {
        for (Hero hero : army) {
            if (hero.getRole() == Role.DAMAGE) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void healerSpecialAbility() {
        for (Hero hero : army) {
            if (hero.getRole() == Role.HEALER) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

}
