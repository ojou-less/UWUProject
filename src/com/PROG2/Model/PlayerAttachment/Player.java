package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.ClassTypes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;

public class Player implements Serializable {
    private double level;
    private double mana;
    private double addMana = 0;
    private double health;
    private double addHealth = 0;
    private double hitDamage;
    private double addHitDamage = 0;
    private Weapon weapon;
    private Armor armor;
    private Artifact artifact01;
    private Artifact artifact02;
    private ClassTypes classesType;
    private int drawLimit;
    private int addDrawLimit = 0;
    private Deck cards;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int zen = 0;


    public Player(double level, double mana, double health, double hitDamage, ClassTypes classesType, int drawLimit, int zen) {
        this.level = level;
        this.mana = mana;
        this.health = health;
        this.hitDamage = hitDamage;
        this.classesType = classesType;
        this.drawLimit = drawLimit;
        this.zen = zen;
    }

    public Player addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }
    private Player delEffect(Ability ability){
        this.addHealth -= (this.health() * ability.increaseHealth());
        this.hitDamage -= (this.hitDamage() * ability.increaseDamage());
        this.mana -= (this.mana() * ability.increaseMana());
        this.armor.setAddHealth(this.armor.addHealth()-(this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit -= ability.increaseDrawLimit();
        return this;
    }
    private Player addingEffect(Ability ability){
        this.addHealth += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
        this.mana += (this.mana() * ability.increaseMana());
        this.armor.setAddHealth((this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit += ability.increaseDrawLimit();
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

    public double level() {
        return level;
    }

    public Player setLevel(double level) {
        this.level = level;
        return this;
    }

    public double mana() {
        return mana+addMana;
    }

    public Player setMana(double mana) {
        this.mana = mana;
        return this;
    }

    public double health() {
        return health+addHealth;
    }

    public Player setHealth(double health) {
        this.health = health;
        return this;
    }

    public double hitDamage() {
        return hitDamage+addHitDamage;
    }

    public Player setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    public Weapon weapon() {
        return weapon;
    }

    public Player setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Armor armor() {
        return armor;
    }

    public Player setArmor(Armor armor) {
        this.armor = armor;
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
        return drawLimit + addDrawLimit;
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
