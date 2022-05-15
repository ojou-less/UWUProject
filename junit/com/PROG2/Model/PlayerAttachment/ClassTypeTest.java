package com.PROG2.Model.PlayerAttachment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTypeTest {

    @Test
    void getName() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(type.getName().equals("classtypename"));
    }

    @Test
    void setName() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        String newname = "poggers";
        type.setName(newname);
        assertTrue(type.getName().equals(newname));
    }

    @Test
    void getIconpath() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(type.getIconpath().equals("icopath"));
    }

    @Test
    void setIconpath() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        String newpath = "icodifferentpath";
        type.setIconpath(newpath);
        assertTrue(type.getIconpath().equals(newpath));
    }

    @Test
    void getAbilityID() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(type.getAbilityID() == 1);
    }

    @Test
    void getAbility() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        assertTrue(type.getAbility() != null);
    }

    @Test
    void setAbility() {
        ClassType type = new ClassType("classtypename", "icopath", new Ability(1, 2, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.4,4));
        type.setAbility(new Ability(177013, 900, "der name", "der iconpath", 1.1, 1.2, 1.3, 1.7,4));
        assertTrue(type.getAbilityID() == 177013);
    }
}