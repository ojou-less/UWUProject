package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.ClassTypes;
/**
 * Klasse für den Spielbaren Charakter "Dungeon Master" (auch Spieler 2). Erbt von Superklasse Player, genau wie der
 * Spielbare Chrakter "Adventurer". Dungeon Master unterscheidet sich von Adventurer in den Class Types.
 */
public class DungeonMaster extends Player{
    public DungeonMaster(double level, double mana, double health, double hitDamage, ClassTypes classesType, int drawLimit, int zen) {
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