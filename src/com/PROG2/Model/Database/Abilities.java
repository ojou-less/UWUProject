package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Klasse für das zwischenspeichern der Objekte vom Typ Ability
 * vor der Serialisierung.
 */
public class Abilities {
    private static ObservableList<Ability> effectList = FXCollections.observableArrayList();

    public Abilities() {
    }

    public static Abilities addEffect(Ability ability){
        effectList.add(ability);
        return null;
    }
    public static Ability get(int i){
        return Abilities.effectList().get(i);
    }


    public static ObservableList<Ability> effectList() {
        return effectList;
    }

    public static Abilities setEffectList(ObservableList<Ability> effectList) {
        Abilities.effectList = effectList;
        return null;
    }
}
