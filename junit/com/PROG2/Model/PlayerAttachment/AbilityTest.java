package com.PROG2.Model.PlayerAttachment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbilityTest {

    @Test
    void timer() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.timer() == 2);
    }

    @Test
    void setTimer() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setTimer(7);
        assertTrue(ability.timer() == 7);
    }

    @Test
    void countAbility() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.countAbility().equals(ability.timer()-1));
    }

    @Test
    void name() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.name().equals("der name"));
    }

    @Test
    void setName() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        String newName = "der neue name";
        ability.setName(newName);
        assertTrue(ability.name().equals(newName));
    }

    @Test
    void iconPath() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.iconPath().equals("der iconpath"));
    }

    @Test
    void setIconPath() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        String newPath = "der neue name";
        ability.setIconPath(newPath);
        assertTrue(ability.iconPath().equals(newPath));
    }

    @Test
    void increaseHealth() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.increaseHealth() == 1.1);
    }

    @Test
    void setIncreaseHealth() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setIncreaseHealth(11.11);
        assertTrue(ability.increaseHealth() == 11.11);
    }

    @Test
    void increaseMana() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.increaseMana() == 1.2);
    }

    @Test
    void setIncreaseMana() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setIncreaseMana(22.22);
        assertTrue(ability.increaseMana() == 22.22);
    }

    @Test
    void increaseDamage() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.increaseDamage() == 1.3);
    }

    @Test
    void setIncreaseDamage() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setIncreaseDamage(33.33);
        assertTrue(ability.increaseDamage() == 33.33);
    }

    @Test
    void increaseArmor() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.increaseArmor() == 1.4);
    }

    @Test
    void setIncreaseArmor() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setIncreaseArmor(44.44);
        assertTrue(ability.increaseArmor() == 44.44);
    }

    @Test
    void increaseDrawLimit() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        assertTrue(ability.increaseDrawLimit() == 4);
    }

    @Test
    void setIncreaseDrawLimit() {
        Ability ability = new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4);
        ability.setIncreaseDrawLimit(5);
        assertTrue(ability.increaseDrawLimit() == 5);
    }
}