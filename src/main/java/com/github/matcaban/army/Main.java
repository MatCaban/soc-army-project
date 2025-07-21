package com.github.matcaban.army;

import com.github.matcaban.army.commands.Tauntable;
import com.github.matcaban.army.heroes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Hero warrior1 = new Warrior("war1");
        Hero warrior2 = new Warrior("par2");
        Hero paladin1 = new Paladin("pala1");
        Hero paladin2 = new Paladin("pala2");
        Hero druid1 = new Druid("druid1");
        Hero druid2 = new Druid("druid2");
        Hero hunter1 = new Hunter("hunt1");
        Hero hunter2 = new Hunter("hunt2");
        Hero priest1 = new Priest("priest1");
        Hero priest2 = new Priest("priest2");
        Hero shaman1 = new Shaman("shami1");
        Hero shaman2 = new Shaman("shami2");
        Hero warlock1 = new Warlock("warlock1");
        Hero warlock2 = new Warlock("warlock2");

        Army army = new Army(
                List.of(warrior1, warrior2, paladin1,paladin2, druid1,druid2,hunter1, hunter2,priest1,priest2, shaman1,shaman2,warlock1, warlock2)
        );

        army.report();
    }
}
