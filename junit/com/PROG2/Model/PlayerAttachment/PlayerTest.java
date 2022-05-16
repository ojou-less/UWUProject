package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.Usable;
import javafx.collections.ObservableList;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void addEffect() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.addEffect(new Ability(1, 2, "der name", "der iconpath", 222.22, 1.2, 1.3, 1.4,4));
        assertTrue(player.checkEffects() != null);
    }

    @Test
    void inventory() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.addInventory(new Usable(17, "ibuprofen", "ibupath"));
        assertTrue(player.inventory() != null);
    }

    @Test
    @Ignore
    void setIntventory() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.addInventory(new Usable(17, "ibuprofen", "ibupath")); //kein set inventory
        assertTrue(player.inventory() != null);
    }

    @Test
    void addInventory() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.addInventory(new Usable(17, "ibuprofen", "ibupath"));
        assertTrue(player.inventory() != null);
    }

    @Test
    void checkEffects() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.addEffect(new Ability(1, 2, "der name", "der iconpath", 222.22, 1.2, 1.3, 1.4,4));
        assertTrue(player.checkEffects() != null);
    }

    @Test
    void level() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.level() == 3.2);
    }

    @Test
    void setLevel() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setLevel(420.69);
        assertTrue(player.level() == 420.69);
    }

    @Test
    void mana() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.mana() == 4.2);
    }

    @Test
    void setMana() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setMana(69.420);
        assertTrue(player.mana() == 69.420);
    }

    @Test
    void health() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.health() == 5.2);
    }

    @Test
    void setHealth() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setHealth(69.420);
        assertTrue(player.health() == 69.420);
    }

    @Test
    void hitDamage() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.hitDamage() == 6.2);
    }

    @Test
    void setHitDamage() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setHitDamage(69.420);
        assertTrue(player.hitDamage() == 69.420);
    }

    @Test
    void weapon() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setWeapon(new Weapon(70, "a weapon", "a testpath", 56, 98.76, 10, 100));
        assertFalse(player.weapon().equals(null));
    }

    @Test
    void setWeapon() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setWeapon(new Weapon(70, "a weapon", "a testpath", 56, 98.76, 10, 100));
        assertFalse(player.weapon().equals(null));
    }

    @Test
    void armor() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArmor(new Armor(5, "cringe armor", "cringe path", 17.17));
        assertFalse(player.armor().equals(null));
    }

    @Test
    void setArmor() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArmor(new Armor(5, "cringe armor", "cringe path", 17.17));
        assertFalse(player.armor().equals(null));
    }

    @Test
    void artifact01() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArtifact01(new Artifact(600, "testArtefakt", "testpfad", 80.99, 7.123, 7.09, 1.2, 3));
        assertFalse(player.artifact01().equals(null));
    }

    @Test
    void setArtifact01() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArtifact01(new Artifact(600, "testArtefakt", "testpfad", 80.99, 7.123, 7.09, 1.2, 3));
        assertFalse(player.artifact01().equals(null));
    }

    @Test
    void artifact02() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArtifact02(new Artifact(601, "testArtefakt", "testpfad", 80.99, 7.123, 7.09, 1.2, 3));
        assertFalse(player.artifact02().equals(null));
    }

    @Test
    void setArtifact02() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setArtifact02(new Artifact(601, "testArtefakt", "testpfad", 80.99, 7.123, 7.09, 1.2, 3));
        assertFalse(player.artifact02().equals(null));
    }

    @Test
    void getClassesType() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertFalse(player.getClassesType().equals(null));
    }

    @Test
    void setClassesType() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setClassesType(new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)));
        assertFalse(player.getClassesType().equals(null));
    }

    @Test
    void drawLimit() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setDrawLimit(11);
        assertTrue(player.drawLimit() + player.addDrawLimit() == 11);
    }

    @Test
    void setDrawLimit() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setDrawLimit(12);
        assertTrue(player.drawLimit() + player.addDrawLimit() == 12);
    }

    @Test
    void cards() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setCards(new Deck());
        assertTrue(player.cards() != null);
    }

    @Test
    void setCards() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        player.setCards(new Deck());
        assertTrue(player.cards() != null);
    }

    @Test
    void abilities() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.abilities() != null);
    }

    @Test
    void setAbilities() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        ObservableList<Ability> abilList = player.abilities();
        player.setAbilities(abilList);
        assertFalse(player.abilities().equals(null));
    }

    @Test
    void zen() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        assertTrue(player.zen() == 420);
    }

    @Test
    void setZen() {
        Player player = new Player(3.2, 4.2, 5.2, 6.2, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 420);
        int derNeueZenWertYauw = 666;
        player.setZen(derNeueZenWertYauw);
        assertTrue(player.zen() == derNeueZenWertYauw);
    }
}