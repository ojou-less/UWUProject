package com.PROG2.Model.Cards;

import com.PROG2.Model.PlayerAttachment.Ability;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummonedWarriorCardTest {

    @Test
    void addeffect() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.addeffect(new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(swc.abilities() != null);
    }

    @Test
    void health() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.health() == 2.1);
    }

    @Test
    void setHealth() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.setHealth(69.420);
        assertTrue(swc.health() == 69.420);
    }

    @Test
    void hitDamage() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.hitDamage() == 2.2);
    }

    @Test
    void setHitDamage() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.setHitDamage(2.33);
        assertTrue(swc.hitDamage() == 2.33);
    }

    @Test
    void defense() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.defense() == 2.3);
    }

    @Test
    void setDefense() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.setDefense(3.22);
        assertTrue(swc.defense() == 3.22);
    }

    @Test
    void abilities() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.setAbilities(swc.abilities());
        assertTrue(swc.abilities() != null);
    }

    @Test
    void setAbilities() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        swc.setAbilities(swc.abilities());
        assertTrue(swc.abilities() != null);
    }

    @Test
    void hitRange() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.hitRange() == 10);
    }

    @Test
    void moveRange() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.moveRange() == 11);
    }

    @Test
    void canSummon() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.canSummon());
    }

    @Test
    void buyCost() {
        SummonedWarriorCard swc = new SummonedWarriorCard(2,"testEC", "testECPath", 2.1, 2.2, 2.3, 10, 11, true, 666);
        assertTrue(swc.buyCost() == 666);
    }
}