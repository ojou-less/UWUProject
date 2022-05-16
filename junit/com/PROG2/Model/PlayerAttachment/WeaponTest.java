package com.PROG2.Model.PlayerAttachment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void name() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.objName().equals("weaponName"));
    }

    @Test
    void setName() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setObjName("newWeaponName");
        assertTrue(weapon.objName().equals("newWeaponName"));
    }

    @Test
    void iconPath() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.iconPath().equals("weaponPath"));
    }

    @Test
    void setIconPath() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setIconPath("newWeaponPath");
        assertTrue(weapon.iconPath().equals("newWeaponPath"));
    }

    @Test
    void level() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.level() == 99);
    }

    @Test
    void setLevel() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setLevel(1);
        assertTrue(weapon.level() == 1);
    }

    @Test
    void hit() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.hit() == 55.23 + (55.23*(weapon.level()*0.2)));
    }

    @Test
    void setHit() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setHit(2.2);
        assertTrue(weapon.hit() == 2.2 + (2.2*(weapon.level()*0.2)));
    }

    @Test
    void range() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.range() == 7);
    }

    @Test
    void setRange() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setRange(2);
        assertTrue(weapon.range() == 2);
    }

    @Test
    void zen() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        assertTrue(weapon.zen() == 120);
    }

    @Test
    void setCost() {
        Weapon weapon = new Weapon(666, "weaponName", "weaponPath", 99,55.23, 7, 120);
        weapon.setCost(0);
        assertTrue(weapon.zen() == 0);
    }
}