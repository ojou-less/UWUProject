package com.PROG2.Model.PlayerAttachment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    @Test
    void health() {
        Armor armor = new Armor(5, "cringe armor", "cringe path", 17.17);
        assertTrue(armor.health() == 6.66);
    }

    @Test
    void setHealth() {
        Armor armor = new Armor(5, "cringe armor", "cringe path", 17.17);
        double testwert = 7.77;
        armor.setHealth(testwert);
        assertTrue(armor.health() == testwert);
    }

    @Test
    void addHealth() {
        Armor armor = new Armor(5, "cringe armor", "cringe path", 17.17);
        assertTrue(armor.addHealth() == 0);
    }

    @Test
    void setAddHealth() {
        Armor armor = new Armor(5, "cringe armor", "cringe path", 17.17);
        double neuAddHP = 1.1;
        armor.setAddHealth(neuAddHP);
        assertTrue(armor.addHealth() == neuAddHP);
    }
}