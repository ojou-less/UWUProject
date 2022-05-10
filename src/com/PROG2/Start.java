package com.PROG2;

import com.PROG2.Model.Database.*;

public class Start {
    private static Abilities abilities = new Abilities();
    private static Artifacts artifacts = new Artifacts();
    private static EffectCards effectCards = new EffectCards();
    private static WarriorCards warriorCards =new WarriorCards();
    private static Weapons weapons = new Weapons();
    private static Armors armors = new Armors();
    public static void main(String[] args) {


    }

    public static Abilities abilities() {
        return abilities;
    }

    public static void setAbilities(Abilities abilities) {
        Start.abilities = abilities;
    }

    public static Artifacts artifacts() {
        return artifacts;
    }

    public static void setArtifacts(Artifacts artifacts) {
        Start.artifacts = artifacts;
    }

    public static EffectCards effectCards() {
        return effectCards;
    }

    public static void setEffectCards(EffectCards effectCards) {
        Start.effectCards = effectCards;
    }

    public static WarriorCards warriorCards() {
        return warriorCards;
    }

    public static void setWarriorCards(WarriorCards warriorCards) {
        Start.warriorCards = warriorCards;
    }

    public static Weapons weapons() {
        return weapons;
    }

    public static void setWeapons(Weapons weapons) {
        Start.weapons = weapons;
    }

    public static Armors armors() {
        return armors;
    }

    public static void setArmors(Armors armors) {
        Start.armors = armors;
    }
}
