package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Armor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Armors {
    private ObservableList<Armor> armors = FXCollections.emptyObservableList();

    public Armors() {
        ;
    }

    public ObservableList<Armor> armors() {
        return armors;
    }

    public Armor get(int i) {
        return this.armors().get(i);
    }

    public Armors setArmors(ObservableList<Armor> armors) {
        this.armors = armors;
        return this;
    }

    public Armors add(Armor armor) {
        armors.add(armor);
        return this;
    }
}