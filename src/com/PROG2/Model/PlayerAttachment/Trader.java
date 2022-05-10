package com.PROG2.Model.PlayerAttachment;

import javafx.collections.ObservableList;

public class Trader {
    private Weapon weapon;
    private Deck cards;
    private ObservableList<Artifact> artifactsForSale;
    private ObservableList<Weapon> weaponsForSale;
    private ObservableList<Deck> cardsForSale;
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
    //hallo ayham
}
