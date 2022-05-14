package com.PROG2.Model.Events;

import com.PROG2.Model.Database.WarriorCards;
import com.PROG2.Model.PlayerAttachment.Armor;
import com.PROG2.Model.PlayerAttachment.Artifact;
import com.PROG2.Model.PlayerAttachment.Deck;
import com.PROG2.Model.PlayerAttachment.Weapon;
import com.PROG2.Start;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Klasse für den im Spiel zufällig erscheinenden Händler mit zufälligen Items, die gekauft werden können.
 */
public class Trader {
    private int[] IDs;
    private Deck cardsForSale = new Deck();
    private ObservableList<Artifact> artifactsForSale = FXCollections.observableArrayList();
    private ObservableList<Weapon> weaponsForSale = FXCollections.observableArrayList();
    private ObservableList<Armor> armorForSale = FXCollections.observableArrayList();


    public Trader(int[] IDs) {
        this.IDs = IDs;
        fillTrader();
    }

    private Trader fillTrader() {
        for (int i:
             this.IDs) {
            switch (i/100){
                case 0: cardsForSale.add(Start.warriorCards().get(i%100));
                case 1: cardsForSale.add(Start.effectCards().get(i%100));
                case 3: armorForSale.add(Start.armors().get(i%100));
                case 4: weaponsForSale.add(Start.weapons().get(i%100));
                case 5: artifactsForSale.add(Start.artifacts().get(i%100));
            }
        }
        return this;
    }

    public ObservableList<Weapon> getWeaponsForSale(){
        return weaponsForSale;
    }
    public ObservableList<Artifact> getArtifactsForSale(){
        return artifactsForSale;
    }

    public ObservableList<Armor> armorForSale() {
        return armorForSale;
    }

    public Deck getCardsForSale(){
        return cardsForSale;
    }
}
