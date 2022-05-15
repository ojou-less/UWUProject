package com.PROG2.Model.Cards;

import com.PROG2.Model.Database.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;

/**
 * Klasse für die erzeugung eines "EffectCard" Objektes. Erbt von Klasse Usable, da EffectCard zu den vom
 * Spieler nutzbaren Items gehört.
 */
public class EffectCard extends Usable {
    private Ability cardAbility;
    private int buyCost;
    private int summonCost;


    /**
     * Konstruktor für EffectCard
     * @param ID
     * @param cardAbility
     * @param buyCost
     * @param summonCost
     */
    public EffectCard(int ID, Ability cardAbility, int buyCost, int summonCost) {
        super(ID);
        this.cardAbility = cardAbility;
        this.buyCost = buyCost;
        this.summonCost = summonCost;
    }

    /**
     * Getter für cardAbility
     * @return cardAbility
     */
    public Ability cardAbility() {
        return cardAbility;
    }

    /**
     * Setter für cardAbility
     * @param cardAbility
     * @return cardAbility
     */
    public EffectCard setCardAbility(Ability cardAbility) {
        this.cardAbility = cardAbility;
        return this;
    }

    /**
     * Getter für den Preis der Effekt Karten
     * @return buyCost
     */
    public int buyCost() {
        return buyCost;
    }

    /**
     * Setter für den Preis der Effekt Karten
     * @param buyCost
     * @return buyCost
     */
    public EffectCard setBuyCost(int buyCost) {
        this.buyCost = buyCost;
        return this;
    }

    /**
     * Getter für die Manakosten für die Benutzung der Effekt Karten auf dem Spielfeld
     * @return summonCost
     */
    public int summonCost() {
        return summonCost;
    }

    /**
     * Setter für die Manakosten für die Benutzung der Effekt Karten auf dem Spielfeld
     * @param summonCost
     * @return summonCost
     */
    public EffectCard setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }

    @Override
    public String toString() {
        return "EffectCard{" +
                "cardAbility=" + cardAbility.toString() +
                ", buyCost=" + buyCost +
                ", summonCost=" + summonCost +
                '}';
    }
}
