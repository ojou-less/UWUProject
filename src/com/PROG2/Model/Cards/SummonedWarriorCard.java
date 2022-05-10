package com.PROG2.Model.Cards;

import com.PROG2.Model.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SummonedWarriorCard {
    private int ID;
    private double health;
    private double hitDamage;
    private double defense;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private final int hitRange;
    private final int moveRange;
    private final boolean canSummon;

    public SummonedWarriorCard(int ID, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon) {
        this.ID = ID;
        this.health = health;
        this.hitDamage = hitDamage;
        this.defense = defense;
        this.hitRange = hitRange;
        this.moveRange = moveRange;
        this.canSummon = canSummon;
    }
    public SummonedWarriorCard addeffect(Ability ability){
        abilities.add(ability);
        return this;
    }
    public int ID() {
        return ID;
    }

    public SummonedWarriorCard setID(int ID) {
        this.ID = ID;
        return this;
    }

    public double health() {
        return health;
    }

    public SummonedWarriorCard setHealth(double health) {
        this.health = health;
        return this;
    }

    public double hitDamage() {
        return hitDamage;
    }

    public SummonedWarriorCard setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    public double defense() {
        return defense;
    }

    public SummonedWarriorCard setDefense(double defense) {
        this.defense = defense;
        return this;
    }

    public ObservableList<Ability> abilities() {
        return abilities;
    }

    public SummonedWarriorCard setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public int hitRange() {
        return hitRange;
    }

    public int moveRange() {
        return moveRange;
    }

    public boolean canSummon() {
        return canSummon;
    }
}
