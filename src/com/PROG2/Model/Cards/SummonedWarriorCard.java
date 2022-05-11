package com.PROG2.Model.Cards;

import com.PROG2.Model.Database.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SummonedWarriorCard extends Usable {

    private double health;
    private double hitDamage;
    private double defense;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private final int hitRange;
    private final int moveRange;
    private final boolean canSummon;

    public SummonedWarriorCard(int ID, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon) {
        super(ID);
        this.health = health;
        this.hitDamage = hitDamage;
        this.defense = defense;
        this.hitRange = hitRange;
        this.moveRange = moveRange;
        this.canSummon = canSummon;
    }
    public SummonedWarriorCard addeffect(Ability ability){
        abilities.add(ability);
        this.active(ability);
        return this;
    }
    private SummonedWarriorCard active(Ability ability){
        this.health += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
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
