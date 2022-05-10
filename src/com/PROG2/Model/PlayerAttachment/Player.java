package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Ability;
import com.PROG2.Model.Database.ClassTypes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Player {
    private double level;
    private double mana;
    private double health;
    private double hitDamage;
    private Weapon weapon;
    private Artifact artifact01;
    private Artifact artifact02;
    private ClassTypes classesType;
    private int drawLimit;
    private Deck cards;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int zen;
    private Armor armor;



    public Player addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }
    private Player active(Ability ability){
        this.health += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
        this.mana += (this.mana() * ability.increaseMana());
        this.armor.get
        return this;
    }
    public Player checkEffects(){
        for (Ability ability:
                abilities) {
            if(ability.timer()==0){
                this.abilities.remove(ability);
            }else {
                ability = ability.countAbility();
            }
        }
        return this;
    }
}
