package com.github.matcaban.army;

import com.github.matcaban.army.commands.Tauntable;
import com.github.matcaban.army.heroes.Hero;
import com.github.matcaban.army.heroes.Paladin;
import com.github.matcaban.army.heroes.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Hero> army = new ArrayList<>();

        Hero warrior1 = new Warrior("war1");
        Hero paladin1 = new Paladin("paladin1");

        army.add(warrior1);
        army.add(paladin1);


        for (Hero hero: army) {
            System.out.println(hero);
        }
    }
}
