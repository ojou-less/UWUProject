package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Deck;
import com.PROG2.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StartDecks {
    private ObservableList<Deck> decks = FXCollections.observableArrayList();

    public StartDecks() {

    }

    public ObservableList<Deck> decks() {
        return decks;
    }

    public Deck get(int i){
        return this.decks().get(i);
    }
    public StartDecks setDecks(ObservableList<Deck> decks) {
        this.decks = decks;
        return this;
    }

    public StartDecks add(Deck deck){
        decks.add(deck);
        return this;
    }
}
