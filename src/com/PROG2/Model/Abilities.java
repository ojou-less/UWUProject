package com.PROG2.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Abilities {
    private ObservableList<Ability> effectList = FXCollections.observableArrayList();

    public Abilities() {
    }
    public Abilities addEffect(Ability ability){
        effectList.add(ability);
        return this;
    }
    public ObservableList<Ability> effectList() {
        return effectList;
    }

    public Abilities setEffectList(ObservableList<Ability> effectList) {
        this.effectList = effectList;
        return this;
    }
}
