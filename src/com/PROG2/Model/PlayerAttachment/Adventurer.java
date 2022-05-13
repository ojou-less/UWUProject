package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.ClassTypes;

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
