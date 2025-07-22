package com.github.matcaban.army;

import com.github.matcaban.army.commands.Damageable;
import com.github.matcaban.army.commands.Healable;
import com.github.matcaban.army.commands.Resurrectionable;
import com.github.matcaban.army.commands.Tauntable;
import com.github.matcaban.army.heroes.Hero;
import com.github.matcaban.army.heroes.Role;

import java.util.List;

public class Army {
    List<Hero> army;

    public Army(List<Hero> army){
        this.army = army;
    }

    public void report(){
        for (Hero hero: army){
            System.out.println(hero);
        }
    }

//    public void attack(){
//        for (Hero hero: army) {
//            if (hero instanceof Damageable){
//                System.out.println(((Damageable) hero).dealDamage());
//            }
//        }
//    }

    public void tautn() {
        for (Hero hero: army) {
            if (hero instanceof Tauntable){
                System.out.println(((Tauntable) hero).taunt());
            }
        }
    }

    public void heal() {
        for (Hero hero: army) {
            if (hero instanceof Healable) {
                System.out.println(((Healable) hero).heal());
            }
        }
    }

    public void resurrect() {
        for (Hero hero: army) {
            if (hero instanceof Resurrectionable) {
                System.out.println(((Resurrectionable) hero).resurrect());
            }
        }
    }

    public void supportSpecialAbility() {
        for (Hero hero: army) {
            if (hero.getRole() == Role.SUPPORT) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void tankSpecialAbility() {
        for (Hero hero: army) {
            if (hero.getRole() == Role.TANK) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void damageSpecialAbility() {
        for (Hero hero: army) {
            if (hero.getRole() == Role.DAMAGE) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

    public void healerSpecialAbility() {
        for (Hero hero: army) {
            if (hero.getRole() == Role.HEALER) {
                System.out.println(hero.castSpecialAbility());
            }
        }
    }

}
