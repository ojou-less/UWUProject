package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Weapons {
    private ObservableList<Weapon> weapons = FXCollections.emptyObservableList();

    public Weapons() {
        ;
    }

    public ObservableList<Weapon> weapons() {
        return weapons;
    }

    public Weapon get(int i){
        return this.weapons().get(i);
    }

    public Armors setWeapons(ObservableList<Weapon> weapons) {
        this.weapons = weapons;
        return this;
    }
    public Armors add(Weapon weapon){
        weapons.add(weapon);
        return this;
    }
}
