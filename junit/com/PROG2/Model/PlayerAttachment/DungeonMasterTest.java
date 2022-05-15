package com.PROG2.Model.PlayerAttachment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonMasterTest {

    @Test
    void getClassesType() {
        DungeonMaster dm = new DungeonMaster(2.2, 3.3, 120.0, 20.3, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 500);
        dm.setClassesType(new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)));
        assertTrue(dm.getClassesType() != null);
    }

    @Test
    void setClassesType() {
        DungeonMaster dm = new DungeonMaster(2.2, 3.3, 120.0, 20.3, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 500);
        dm.setClassesType(new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)));
        assertTrue(dm.getClassesType() != null);
    }
}