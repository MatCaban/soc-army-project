package com.github.matcaban.army;

import com.github.matcaban.army.heroes.Hero;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<Hero> army;

    public Army(List<Hero> army){
        this.army = army;
    }

    public void addHero(Hero hero){
        this.army.add(hero);
    }

    public void report(){
        for (Hero hero: army){
            System.out.println(hero);
        }
    }
}
