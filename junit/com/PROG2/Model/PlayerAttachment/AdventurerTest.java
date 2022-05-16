package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.ClassTypes;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdventurerTest {

    @Test
    void getClassesType() {
        Adventurer adventurer = new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 500);
        adventurer.setClassesType(new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)));
        assertTrue(adventurer.getClassesType() != null);
    }

    @Test
    void setClassesType() {
        Adventurer adventurer = new Adventurer(2.2, 3.3, 120.0, 20.3, new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)), 10, 500);
        adventurer.setClassesType(new ClassType("advName", "advIcoPath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4)));
        assertTrue(adventurer.getClassesType() != null);
    }
}