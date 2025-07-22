package com.github.matcaban.army.heroes;

public abstract class Hero {
    protected String name;
    protected int damage;
    protected Role role;
    protected int healthPoints;

    public Hero(String name, Role role, int damage, int healthPoints) {
        this.name = name;
        this.role = role;
        this.damage = damage;
        this.healthPoints = healthPoints;
    }


    public Role getRole() {
        return role;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public void looseHP(int damage) {
        this.healthPoints -= damage;
    }

    public abstract String castSpecialAbility();

    @Override
    public String toString() {
        return Hero.class.getSimpleName() + " " +
                this.getClass().getSimpleName() + " " + this.name + " here. Type: - " + this.role
                + ", Health: " + this.healthPoints;
    }


}
