package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EffectCards {
    private static ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();

    public EffectCards() {
    }

    public static ObservableList<EffectCard> getEffectCards() {
        return effectCards;
    }

    public static EffectCard get(int i){
        return EffectCards.getEffectCards().get(i);
    }

    public static EffectCards setEffectCards(ObservableList<EffectCard> effectCards) {
        EffectCards.effectCards = effectCards;
        return null;
    }

    public static EffectCards add(EffectCard effectCard){
        effectCards.add(effectCard);
        return null;
    }
}
