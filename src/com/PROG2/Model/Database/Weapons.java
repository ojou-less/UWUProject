package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Weapons {
    private static ObservableList<Weapon> weapons = FXCollections.emptyObservableList();

    public Weapons() {
        ;
    }

    public static ObservableList<Weapon> weapons() {
        return weapons;
    }

    public static Weapon get(int i){
        return Weapons.weapons().get(i);
    }

    public static Armors setWeapons(ObservableList<Weapon> weapons) {
        Weapons.weapons = weapons;
        return null;
    }
    public static Armors add(Weapon weapon){
        weapons.add(weapon);
        return null;
    }
}
