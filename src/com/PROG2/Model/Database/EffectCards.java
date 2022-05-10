package com.PROG2.Model.Database;

import com.PROG2.Model.EffectCard;
import com.PROG2.Model.PlayerAttachment.Deck;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EffectCards {
    private ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();

    public EffectCards(ObservableList<EffectCard> effectCards) {
        this.effectCards = effectCards;
    }

    public ObservableList<EffectCard> effectCards() {
        return effectCards;
    }

    public EffectCard get(int i){
        return this.effectCards().get(i);
    }

    public EffectCards setEffectCards(ObservableList<EffectCard> effectCards) {
        this.effectCards = effectCards;
        return this;
    }

    public EffectCards add(EffectCard effectCard){
        effectCards.add(effectCard);
        return this;
    }
}
