package com.PROG2.Model.PlayerAttachment;

public class Armor {
    private double health;
    private double addHealth = 0;

    public Armor(double health) {
        this.health = health;
    }

    public double health() {
        return health;
    }

    public Armor setHealth(double health) {
        this.health = health;
        return this;
    }

    public double addHealth() {
        return addHealth;
    }

    public Armor setAddHealth(double addHealth) {
        this.addHealth = addHealth;
        return this;
    }
}
