package com.github.matcaban.army.commands;

import com.github.matcaban.army.heroes.Hero;

public interface Healable {
    int heal(Hero ally);
}
