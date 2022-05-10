package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class DungeonMaster {
    private double level;
    private double mana;
    private Weapon weapon;
    private Artifact artifact1;
    private Artifact artifact2;
    private ClassTypes classesTypes;
    private int drawLimit;
    private Deck cards;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int zen;

    public double level() {
        return level;
    }

    public DungeonMaster setLevel(double level) {
        this.level = level;
        return this;
    }

    public double mana() {
        return mana;
    }

    public DungeonMaster setMana(double mana) {
        this.mana = mana;
        return this;
    }

    public Weapon weapon() {
        return weapon;
    }

    public DungeonMaster setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Artifact artifact1() {
        return artifact1;
    }

    public DungeonMaster setArtifact1(Artifact artifact1) {
        this.artifact1 = artifact1;
        return this;
    }

    public Artifact artifact2() {
        return artifact2;
    }

    public DungeonMaster setArtifact2(Artifact artifact2) {
        this.artifact2 = artifact2;
        return this;
    }

    public ClassTypes classesTypes() {
        return classesTypes;
    }

    public DungeonMaster setClassesTypes(ClassTypes classesTypes) {
        this.classesTypes = classesTypes;
        return this;
    }

    public int drawLimit() {
        return drawLimit;
    }

    public DungeonMaster setDrawLimit(int drawLimit) {
        this.drawLimit = drawLimit;
        return this;
    }

    public Deck cards() {
        return cards;
    }

    public DungeonMaster setCards(Deck cards) {
        this.cards = cards;
        return this;
    }

    public ObservableList<Ability> abilities() {
        return abilities;
    }

    public DungeonMaster addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }
    public DungeonMaster checkEffects(){
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
    public DungeonMaster setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public int zen() {
        return zen;
    }

    public DungeonMaster setZen(int zen) {
        this.zen = zen;
        return this;
    }
}