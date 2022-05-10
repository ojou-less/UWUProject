package com.PROG2.Model.Events;

import com.PROG2.Model.PlayerAttachment.Artifact;
import com.PROG2.Model.PlayerAttachment.Deck;
import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Trader {
    private Weapon weapon;
    private Deck cards;
    private ObservableList<Artifact> artifactsForSale = FXCollections.observableArrayList();
    private ObservableList<Weapon> weaponsForSale = FXCollections.observableArrayList();
    private ObservableList<Deck> cardsForSale =FXCollections.observableArrayList();
    private int[][] posOnDungeonMap; //nullable

    public ObservableList<Weapon> getWeaponsForSale(){
        return weaponsForSale;
    }
    public ObservableList<Artifact> getArtifactsForSale(){
        return artifactsForSale;
    }
    public ObservableList<Deck> getCardsForSale(){
        return cardsForSale;
    }
    //setter für for sale random...?
    //position auf der map auch...?
    //hallo ayham.
    //hallo Mark
}
