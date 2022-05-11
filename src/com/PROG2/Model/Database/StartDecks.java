package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Deck;
import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StartDecks {
    private static ObservableList<Deck> decks = FXCollections.observableArrayList();

    public StartDecks() {

    }

    public static ObservableList<Deck> decks() {
        return decks;
    }

    public static Deck get(int i){
        return StartDecks.decks().get(i);
    }
    public static StartDecks setDecks(ObservableList<Deck> decks) {
        StartDecks.decks = decks;
        return null;
    }

    public StartDecks add(Deck deck){
        decks.add(deck);
        return null;
    }
}
