package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Player {
    private double level;
    private double mana;
    private Weapon weapon;
    private Artifact artifact01;
    private Artifact artifact02;
    private ClassTypes classesType;
    private int drawLimit;
    private Deck cards;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int zen;

    public Player(double level, double mana, Weapon weapon, Artifact artifact01, Artifact artifact02, ClassTypes classesType, int drawLimit, Deck cards, int zen) {
        this.level = level;
        this.mana = mana;
        this.weapon = weapon;
        this.artifact01 = artifact01;
        this.artifact02 = artifact02;
        this.classesType = classesType;
        this.drawLimit = drawLimit;
        this.cards = cards;
        this.zen = zen;
    }

    public double level() {
        return level;
    }

    public Player setLevel(double level) {
        this.level = level;
        return this;
    }

    public double mana() {
        return mana;
    }

    public Player setMana(double mana) {
        this.mana = mana;
        return this;
    }

    public Weapon weapon() {
        return weapon;
    }

    public Player setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Artifact artifact01() {
        return artifact01;
    }

    public Player setArtifact01(Artifact artifact01) {
        this.artifact01 = artifact01;
        return this;
    }

    public Artifact artifact02() {
        return artifact02;
    }

    public Player setArtifact02(Artifact artifact02) {
        this.artifact02 = artifact02;
        return this;
    }

    public ClassTypes classesType() {
        return classesType;
    }

    public Player setClassesType(ClassTypes classesType) {
        this.classesType = classesType;
        return this;
    }

    public int drawLimit() {
        return drawLimit;
    }

    public Player setDrawLimit(int drawLimit) {
        this.drawLimit = drawLimit;
        return this;
    }

    public Deck cards() {
        return cards;
    }

    public Player setCards(Deck cards) {
        this.cards = cards;
        return this;
    }

    public ObservableList<Ability> abilities() {
        return abilities;
    }

    public Player addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }
    public Player setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public int zen() {
        return zen;
    }

    public Player setZen(int zen) {
        this.zen = zen;
        return this;
    }
}
