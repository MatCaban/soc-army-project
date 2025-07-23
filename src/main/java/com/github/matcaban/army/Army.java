package com.github.matcaban.army;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Resurrectionable;
import com.github.matcaban.army.commands.Tauntable;
import com.github.matcaban.army.fight.Faction;
import com.github.matcaban.army.heroes.Hero;
import com.github.matcaban.army.heroes.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {
    private final List<Hero> army;
    private final Faction faction;

    public Army(List<Hero> army, Faction faction) {
        this.army = new ArrayList<>(army);
        this.faction = faction;
    }

    public List<Hero> getArmy() {
        return army;
    }

    public Faction getFaction() {
        return faction;
    }

    public void report() {
        for (Hero hero : army) {
            System.out.println(hero);
        }
    }

    // attack a random alive hero from an enemy army
    public void attack(Army enemyArmy) {
        System.out.println("----" + this.faction + " is attacking " + enemyArmy.getFaction() + "----");
        for (Hero hero : this.army) {
            if (hero instanceof Damageable damageableHero) {
                Hero enemyHero = getRandomHero(enemyArmy);
                int damageDealt = damageableHero.dealDamage(enemyHero);
                enemyHero.looseHP(damageDealt);
            }
        }
    }

    // heal a random alive hero from ally
    public void heal(Army ally) {
        System.out.println("\n----" + this.faction + " is healing allies ----");
        for (Hero hero : this.army) {
            if (hero instanceof Healable healableHero) {
                Hero allyHero = getRandomHero(ally);
                int healingDone = healableHero.heal(allyHero);
                allyHero.healHP(healingDone);
            }
        }
    }


    public void removeDeadHero() {
        army.removeIf(hero -> hero.getCurrentHealthPoints() <= 0);
    }

    private Hero getRandomHero(Army army) {
        int randomHeroIndex = new Random().nextInt(army.getArmy().size());
        return army.getArmy().get(randomHeroIndex);
    }


    public boolean areAllDamageableDead() {
        for (Hero hero: army) {
            if (hero instanceof Damageable) {
                return false;
            }
        }
        return true;
    }

    public void tautn() {
        for (Hero hero : army) {
            if (hero instanceof Tauntable tauntableHero) {
                System.out.println(tauntableHero.taunt());
            }
        }
    }

    public void resurrect() {
        for (Hero hero : army) {
            if (hero instanceof Resurrectionable resurrectionableHero) {
                System.out.println(resurrectionableHero.resurrect());
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
