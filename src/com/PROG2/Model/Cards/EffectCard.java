package com.PROG2.Model.Cards;

import com.PROG2.Model.Database.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;

public class EffectCard extends Usable {
    private Ability cardAbility;
    private int buyCost;
    private int summonCost;


    public EffectCard(int ID, Ability cardAbility, int buyCost, int summonCost) {
        super(ID);
        this.cardAbility = cardAbility;
        this.buyCost = buyCost;
        this.summonCost = summonCost;
    }

    public Ability cardAbility() {
        return cardAbility;
    }

    public EffectCard setCardAbility(Ability cardAbility) {
        this.cardAbility = cardAbility;
        return this;
    }

    public int buyCost() {
        return buyCost;
    }

    public EffectCard setBuyCost(int buyCost) {
        this.buyCost = buyCost;
        return this;
    }

    public int summonCost() {
        return summonCost;
    }

    public EffectCard setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }
}
