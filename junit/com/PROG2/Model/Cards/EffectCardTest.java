package com.PROG2.Model.Cards;

import com.PROG2.Model.PlayerAttachment.Ability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EffectCardTest {

    @Test
    void cardAbility() {
        EffectCard ec = new EffectCard(1, "testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        ec.setCardAbility(new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(ec.cardAbility() != null);
    }

    @Test
    void setCardAbility() {
        EffectCard ec = new EffectCard(1,"testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        ec.setCardAbility(new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(ec.cardAbility() != null);
    }

    @Test
    void buyCost() {
        EffectCard ec = new EffectCard(1,"testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        assertTrue(ec.buyCost() == 69);
    }

    @Test
    void setBuyCost() {
        EffectCard ec = new EffectCard(1,"testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        ec.setBuyCost(70);
        assertTrue(ec.buyCost() == 70);
    }

    @Test
    void summonCost() {
        EffectCard ec = new EffectCard(1,"testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        assertTrue(ec.summonCost() == 420);
    }

    @Test
    void setSummonCost() {
        EffectCard ec = new EffectCard(1,"testEC", "testECPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4), 69, 420);
        ec.setSummonCost(421);
        assertTrue(ec.summonCost() == 421);
    }
}