package com.PROG2.Model.Cards;

import com.PROG2.Model.Database.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Klasse fürs erzeugen eines SummonedWarriorCard Objektes. Erbt von Klasse Usable, da SummonedWarriorCard zu
 * den vom Spieler nutzbaren Items gehört.
 */
public class SummonedWarriorCard extends Usable {

    private double health;
    private double hitDamage;
    private double defense;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private final int hitRange;
    private final int moveRange;
    private final boolean canSummon;
    private final int buyCost;

    /**
     * Konstruktor für SummonedWarriorCard
     * @param ID
     * @param health
     * @param hitDamage
     * @param defense
     * @param hitRange
     * @param moveRange
     * @param canSummon
     * @param buyCost
     */
    public SummonedWarriorCard(int ID, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon, int buyCost) {
        super(ID);
        this.health = health;
        this.hitDamage = hitDamage;
        this.defense = defense;
        this.hitRange = hitRange;
        this.moveRange = moveRange;
        this.canSummon = canSummon;
        this.buyCost = buyCost;
    }

    /**
     * Methode für das anfügen eines Effektes an die WarriorCard.
     * Ein Effekt kann die stärke der Karte mithilfe des hinzufügen einer Ability beeinflussen.
     * @param ability
     * @return ability
     */
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

    /**
     * Getter, welcher den Health Status der Warrior Card zurückgibt.
     * @return health
     */
    public double health() {
        return health;
    }

    /**
     * Setter für Health der SummonedWarriorCard
     * @param health
     * @return health
     */
    public SummonedWarriorCard setHealth(double health) {
        this.health = health;
        return this;
    }

    /**
     * Getter für HitDamage
     * @return hitDamage
     */
    public double hitDamage() {
        return hitDamage;
    }

    /**
     * Setter für HitDamage
     * @param hitDamage
     * @return hitDamage
     */
    public SummonedWarriorCard setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    /**
     * Getter für Defense
     * @return defense
     */
    public double defense() {
        return defense;
    }


    /**
     * Setter für Defense
     * @param defense
     * @return defense
     */
    public SummonedWarriorCard setDefense(double defense) {
        this.defense = defense;
        return this;
    }

    /**
     * Getter für Abilities
     * @return ObservableList mit abilities
     */
    public ObservableList<Ability> abilities() {
        return abilities;
    }

    /**
     * Setter für Abilities
     * @param abilities
     * @return ObservableList mit abilities
     */
    public SummonedWarriorCard setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    /**
     * Getter für hitRange
     * @return hitRange
     */
    public int hitRange() {
        return hitRange;
    }

    /**
     * Getter für moveRange
     * @return moveRange
     */
    public int moveRange() {
        return moveRange;
    }

    /**
     * Getter für den canSummon boolean. Muss True sein, damit eine Karte beschworen werden kann.
     * @return canSummon boolean
     */
    public boolean canSummon() {
        return canSummon;
    }

    /**
     * Getter für die Kaufkosten der WarriorCard
     * @return buyCost
     */
    public int buyCost() {
        return buyCost;
    }
}
