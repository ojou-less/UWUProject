package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.ClassTypes;

/**
 * Klasse für den Spielbaren Charakter "Adventurer". Erbt von Superklasse Player, genau wie der Spielbare
 * Chrakter "Dungeon Master". Adventurer unterscheidet sich von Dungeon Master in den Class Types.
 */
public class Adventurer extends Player{

//    private ClassTypes adventurerClassesType;
    public Adventurer(double level, double mana, double health, double hitDamage, ClassTypes classesType, int drawLimit, int zen) {
        super(level, mana, health, hitDamage, classesType, drawLimit, zen);
    }

    @Override
    public ClassTypes getClassesType() {
        return getClassesType();
    }

    public Player setClassesType(ClassTypes classesType) {
        this.setClassesType(classesType);
        return this;
    }
}
