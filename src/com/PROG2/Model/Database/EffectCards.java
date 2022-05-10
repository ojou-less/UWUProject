package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EffectCards {
    private ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();

    public EffectCards() {
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
