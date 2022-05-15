package com.PROG2.Model.Events;

import com.PROG2.Model.Database.ClassTypes;
import com.PROG2.Model.PlayerAttachment.Adventurer;
import com.PROG2.Model.PlayerAttachment.DungeonMaster;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreasuresTest {

    @Test
    void player01() {
        Treasures treasure = new Treasures(new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassTypes(), 10, 500), new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        assertTrue(treasure.player01().mana() == 3.3);
    }

    @Test
    void setPlayer01() {
        Treasures treasure = new Treasures(new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassTypes(), 10, 500), new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        treasure.setPlayer01(new Adventurer(2.2, 3.4, 120.0, 20.3, new ClassTypes(), 10, 500));
        assertTrue(treasure.player01() != null);
    }

    @Test
    @Ignore
    void luck() {
        Treasures treasure = new Treasures(new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassTypes(), 10, 500), new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        //kp lo
    }

    @Test
    void player02() {
        Treasures treasure = new Treasures(new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassTypes(), 10, 500), new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        assertTrue(treasure.player02().mana() == 5.1);
    }

    @Test
    void setPlayer02() {
        Treasures treasure = new Treasures(new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassTypes(), 10, 500), new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        treasure.setPlayer02(new DungeonMaster(3.2, 5.1, 90.0, 20.3, new ClassTypes(), 10, 499));
        assertTrue(treasure.player01() != null);
    }
}