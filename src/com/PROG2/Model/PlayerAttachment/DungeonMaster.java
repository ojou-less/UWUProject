package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.ClassTypes;

public class DungeonMaster extends Player{
    public DungeonMaster(double level, double mana, double health, double hitDamage, ClassTypes classesType, int drawLimit, int zen) {
        super(level, mana, health, hitDamage, classesType, drawLimit, zen);
    }
    //TODO hälfte der class types gehört dem dm, andere dem player
}