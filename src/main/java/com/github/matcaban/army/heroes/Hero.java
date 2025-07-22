package com.github.matcaban.army.heroes;

public abstract class Hero {
    protected String name;
    protected int damage;
    protected Role role;
    protected int maxHealthPoints;
    protected int currentHealthPoints;

    public Hero(String name, Role role, int damage, int maxHealthPoints) {
        this.name = name;
        this.role = role;
        this.damage = damage;
        this.maxHealthPoints = maxHealthPoints;
        this.currentHealthPoints = maxHealthPoints;
    }


    public Role getRole() {
        return role;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public String getName() {
        return name;
    }

    public void looseHP(int damage) {
        this.currentHealthPoints -= damage;
    }

    public void healHP(int healing) {
        if ((this.currentHealthPoints + healing) > this.maxHealthPoints) {
            this.currentHealthPoints = this.maxHealthPoints;
        } else {
            this.currentHealthPoints += healing;
        }
    }

    public abstract String castSpecialAbility();

    @Override
    public String toString() {
        return Hero.class.getSimpleName() + " " +
                this.getClass().getSimpleName() + " " + this.name + " here. Type: - " + this.role
                + ", Health: " + this.currentHealthPoints;
    }


}
