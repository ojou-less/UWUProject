package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * Klasse für den Zwischenspeicher der Objekte vom Typ Weapon
 * vor der Serialisierung.
 */
public class Weapons {
    private static ObservableList<Weapon> weapons = FXCollections.emptyObservableList();

    public static ObservableList<Weapon> weapons() {
        return weapons;
    }

    public static Weapon get(int i){
        return Weapons.weapons().get(i);
    }

    public static Weapons setWeapons(ObservableList<Weapon> weapons) {
        Weapons.weapons = weapons;
        return null;
    }

    /**
     * add() Methode speichert die Waffen, die in Attribute deklariert und initialisiert wurden.
     */
    public static Weapons add(Weapon e){
        Weapons.weapons.add(e);
        return null;
    }
}
