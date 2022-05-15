package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.ClassTypes;
import com.PROG2.Model.Database.Usable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;

/**
 * Superklasse für alle im Spiel vorhandenen spielbaren Charakter.
 */
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
    private ObservableList<Usable> intventory = FXCollections.observableArrayList();


    public Player(double level, double mana, double health, double hitDamage, ClassTypes classesType, int drawLimit, int zen) {
        this.level = level;
        this.mana = mana;
        this.health = health;
        this.hitDamage = hitDamage;
        this.classesType = classesType;
        this.drawLimit = drawLimit;
        this.zen = zen;
    }

    /**
     * Methode für das hinzufügen eines Effektes zum Spieler.
     * @param ability
     * @return
     */
    public Player addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }

    /**
     * Methode für das Entfernen von Effekten vom Spieler.
     * @param ability
     * @return
     */
    private Player delEffect(Ability ability){
        this.addHealth -= (this.health() * ability.increaseHealth());
        this.hitDamage -= (this.hitDamage() * ability.increaseDamage());
        this.mana -= (this.mana() * ability.increaseMana());
        this.armor.setAddHealth(this.armor.addHealth()-(this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit -= ability.increaseDrawLimit();
        return this;
    }

    public ObservableList<Usable> intventory() {
        return intventory;
    }

    public Player setIntventory(ObservableList<Usable> intventory) {
        this.intventory = intventory;
        return this;
    }
    public Player addInventory(Usable e){
        this.intventory().add(e);
        return this;
    }

    /**
     * hilfe man was????????????
     * @param ability
     * @return
     */
    private Player addingEffect(Ability ability){
        this.addHealth += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
        this.mana += (this.mana() * ability.increaseMana());
        this.armor.setAddHealth((this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit += ability.increaseDrawLimit();
        return this;
    }
    public Player checkEffects(){   //keine ahnung was diese Methode genau macht
        for (Ability ability:
                abilities) {
            if(ability.timer()==0){
                this.abilities.remove(ability);
                this.delEffect(ability);

            }else {
                ability = ability.countAbility();
            }
        }
        return this;
    }

    /**
     * Getter für Level.
     * @return level
     */
    public double level() {
        return level;
    }

    /**
     * Setter für Level
     * @param level
     * @return level
     */
    public Player setLevel(double level) {
        this.level = level;
        return this;
    }

    /**
     * Getter für Mana
     * @return mana
     */
    public double mana() {
        return mana+addMana;
    }

    /**
     * Setter für mana
     * @param mana
     * @return mana
     */
    public Player setMana(double mana) {
        this.mana = mana;
        return this;
    }

    /**
     * Getter für Lebenspunkte
     * @return health
     */
    public double health() {
        return health+addHealth;
    }

    /**
     * Setter für Lebenspunkte
     * @param health
     * @return health
     */
    public Player setHealth(double health) {
        this.health = health;
        return this;
    }

    /**
     * Getter für Hit Damage
     * @return hitDamage
     */
    public double hitDamage() {
        return hitDamage+addHitDamage;
    }

    /**
     * Setter für Hit Damage
     * @param hitDamage
     * @return hitDamage
     */
    public Player setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    /**
     * Getter für Weapon
     * @return weapon
     */
    public Weapon weapon() {
        return weapon;
    }

    /**
     * Setter für Weapon
     * @param weapon
     * @return weapon
     */
    public Player setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    /**
     * Getter für Armor
     * @return armor
     */
    public Armor armor() {
        return armor;
    }

    /**
     * Setter für Armor
     * @param armor
     * @return armor
     */
    public Player setArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    /**
     * Getter für das erste Artefakt
     * @return artifact01
     */
    public Artifact artifact01() {
        return artifact01;
    }

    /**
     * Setter für das erste Artefakt
     * @param artifact01
     * @return artifact01
     */
    public Player setArtifact01(Artifact artifact01) {
        this.artifact01 = artifact01;
        return this;
    }

    /**
     * Getter für das zweite Artefakt
     * @return artifact02
     */
    public Artifact artifact02() {
        return artifact02;
    }

    /**
     * Setter für das zweite Artefakt
     * @param artifact02
     * @return artifact02
     */
    public Player setArtifact02(Artifact artifact02) {
        this.artifact02 = artifact02;
        return this;
    }

    public ClassTypes getClassesType() {
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
