package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * Klasse für das zwischenspeichern der Objekte vom Typ WarriorCard
 * vor der Serialisierung.
 */
public class WarriorCards {
    private static ObservableList<SummonedWarriorCard> warriorCards = FXCollections.emptyObservableList();

    public WarriorCards() {
    }

    public static ObservableList<SummonedWarriorCard> warriorCards() {
        return warriorCards;
    }

    public static SummonedWarriorCard get(int i){
        return WarriorCards.warriorCards().get(i);
    }

    public static WarriorCards setWarriorCards(ObservableList<SummonedWarriorCard> warriorCards) {
        WarriorCards.warriorCards = warriorCards;
        return null;
    }
    public static WarriorCards add(SummonedWarriorCard summonedWarriorCard){
        warriorCards.add(summonedWarriorCard);
        return null;
    }
}
