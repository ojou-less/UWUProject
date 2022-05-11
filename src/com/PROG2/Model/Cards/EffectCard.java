package com.PROG2.Model.Cards;

import com.PROG2.Model.Database.Usable;
import com.PROG2.Model.PlayerAttachment.Ability;

public class EffectCard extends Usable {
    private Ability cardAbility;
    private int summonCost;


    public EffectCard(int ID, Ability cardAbility, int summonCost) {
        super(ID);
        this.cardAbility = cardAbility;
        this.summonCost = summonCost;
    }

}
