package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Ability;
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
    private ObservableList<Ability> abilities;
    private int zen;


    //gettis&settis
    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Artifact getArtifact1() {
        return artifact1;
    }

    public void setArtifact1(Artifact artifact1) {
        this.artifact1 = artifact1;
    }

    public Artifact getArtifact2() {
        return artifact2;
    }

    public void setArtifact2(Artifact artifact2) {
        this.artifact2 = artifact2;
    }

    public ClassTypes getClassesTypes() {
        return classesTypes;
    }

    public void setClassesTypes(ClassTypes classesTypes) {
        this.classesTypes = classesTypes;
    }

    public int getDrawLimit() {
        return drawLimit;
    }

    public void setDrawLimit(int drawLimit) {
        this.drawLimit = drawLimit;
    }

    public Deck getCards() {
        return cards;
    }

    public void setCards(Deck cards) {
        this.cards = cards;
    }

    public ObservableList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
    }

    public int getZen() {
        return zen;
    }

    public void setZen(int zen) {
        this.zen = zen;
    }
}
