package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ WarriorCard
 * vor der Serialisierung.
 */
public class WarriorCards {
    private static ObservableList<SummonedWarriorCard> warriorCards = FXCollections.observableArrayList();

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
    public static void add(SummonedWarriorCard summonedWarriorCard){
        warriorCards.add(summonedWarriorCard);
    }
}
