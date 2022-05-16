package com.PROG2.Model.Cards;

import com.PROG2.Model.PlayerAttachment.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Niclas Rieckers
 * Klasse fürs erzeugen eines SummonedWarriorCard Objektes. Erbt von Klasse Usable, da SummonedWarriorCard zu
 * den vom Spieler nutzbaren Items gehört.
 */
public class SummonedWarriorCard extends Usable {
    /**
     * Wert fuers Leben von der Beschwoerten Karte.
     */
    private double health;
    /**
     * Wert fuers hitDamage der Beschwoerenen Karte.
     */
    private double hitDamage;
    /**
     * Wert der Verteidigung der zu Beschwoerenen Karte.
     */
    private double defense;
    /**
     * Ansammlung von Ability's um mehrere Effekte zu stappeln.
     */
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int hitRange;
    private int moveRange;
    private int summonCost;
    private int buyCost;
    /**
     * Konstruktor für SummonedWarriorCard
     * @param ID
     * Initialiesierung von ID zur abrufung der Effekt Karte
     * @param objName
     * Initialiesierung vom Objekt Namen.
     * @param iconPath
     * Initialiesierung vom Pfad zum Icon.
     * @param health
     * Initialiesierung vom Leben.
     * @param hitDamage
     * Initialiesierung vom hitDamage
     * @param defense
     * Initialiesierung vom Verteidigungswert
     * @param hitRange
     * Initialiesierung von der Entfernung fuer den Schaden.
     * @param moveRange
     * Initialiesierung von der Bewegungsentfernung pro Zug
     * @param summonCost
     * Initialiesierung vom Mana Kosten Wert um diese Karte zu Beschwoeren.
     * @param buyCost
     * Initialiesierung vom Mana Aufbrauch der bei Beschwoerung benoetigt wird.
     */
    public SummonedWarriorCard(int ID, String objName, String iconPath, double health, double hitDamage, double defense, int hitRange, int moveRange, int summonCost, int buyCost) {
        super(ID, objName, iconPath);
        this.health = health;
        this.hitDamage = hitDamage;
        this.defense = defense;
        this.abilities = abilities;
        this.hitRange = hitRange;
        this.moveRange = moveRange;
        this.summonCost = summonCost;
        this.buyCost = buyCost;
    }



    /**
     * Methode für das anfügen eines Effektes an die WarriorCard.
     * Ein Effekt kann die stärke der Karte mithilfe des hinzufügen einer Ability beeinflussen.
     * @param ability
     * Dieser Effekt wird dieser karte nun hinzugefuegt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
     */
    public SummonedWarriorCard addeffect(Ability ability){
        abilities.add(ability);
        this.active(ability);
        return this;
    }
    /**
     * Methode für das Aktievieren eines Effektes an die WarriorCard.
     * Ein Effekt kann die stärke der Karte mithilfe des hinzufügen einer Ability beeinflussen.
     * @param ability
     * Dieser Effekt wird dieser karte nun hinzugefuegt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
     */
    private SummonedWarriorCard active(Ability ability){
        this.health += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
        return this;
    }

    /**
     * Getter, welcher den Health Status der Warrior Card zurückgibt.
     * @return health
     * Es wird ein Wert fuers Leben der Karte zurueck gegeben
     */
    public double health() {
        return health;
    }

    /**
     * Setter für Health der SummonedWarriorCard
     * @param health
     * Es wird der health Wert gesetzt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
     */
    public SummonedWarriorCard setHealth(double health) {
        this.health = health;
        return this;
    }

    /**
     * Getter für HitDamage
     * @return hitDamage
     * Es wird der hitDamage zurueck gegeben.
     */
    public double hitDamage() {
        return hitDamage;
    }

    /**
     * Setter für HitDamage
     * @param hitDamage
     * Es wird der Wert hitDamage gesetzt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
     */
    public SummonedWarriorCard setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    /**
     * Getter für Defense
     * @return defense
     * Es wird der Verteidigungs Wert zurueck gegeben.
     */
    public double defense() {
        return defense;
    }


    /**
     * Setter für Defense
     * @param defense
     * Es wird der Verteidigungs Wert gesetzt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
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
     * Es wird eine ObservableList gesetzt.
     * @return SummonedWarriorCard
     * Es wird eine Instanz der Klasse SummonedWarriorCard zurueck gegeben.
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
     * Getter für den Preis der Warrior Karten
     * @return int
     * Es wird der Preis fuer die Warrior Karte zurueck gegeben.
     */
    public int buyCost() {
        return buyCost;
    }

    /**
     * Setter für den Preis der Warrior Karten
     * @param buyCost
     * Es wird der Preis fuer die Warrior Karte gesetzt.
     * @return buyCost
     * Es wird eine neue Instanz von Warrior Karte zuruek gegeben.
     */
    public SummonedWarriorCard setBuyCost(int buyCost) {
        this.buyCost = buyCost;
        return this;
    }

    /**
     * Getter für die Manakosten für die Benutzung der Warrior Karten auf dem Spielfeld
     * @return int
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird zurueck gegeben.
     */
    public int summonCost() {
        return summonCost;
    }

    /**
     * Setter für die Manakosten für die Benutzung der Warrior Karten auf dem Spielfeld
     * @param summonCost
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird gesetzt.
     * @return EffectCard
     * Es wird eine neue Instanz von Warrior Karte zuruek gegeben.
     */
    public SummonedWarriorCard setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }

    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "SummonedWarriorCard{" +
                "health=" + health +
                ", hitDamage=" + hitDamage +
                ", defense=" + defense +
                ", abilities=" + abilities +
                ", hitRange=" + hitRange +
                ", moveRange=" + moveRange +
                ", canSummon=" + summonCost +
                ", buyCost=" + buyCost +
                '}';
    }
}
