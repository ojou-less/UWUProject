package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Cards.EffectCard;
import com.PROG2.Model.Cards.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static com.PROG2.util.MyIO.*;

public class Deck {
    private final ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();
    private final ObservableList<SummonedWarriorCard> summonedWarriorCards = FXCollections.observableArrayList();


    public EffectCard draweffect(){
        return effectCards.get((random(0,99999999)%(effectCards.size()-1)));
    }
    public SummonedWarriorCard drawSummon(){
        return summonedWarriorCards.get((random(0,99999999)%(summonedWarriorCards.size()-1)));
    }

    public void add(EffectCard addedCard){
        effectCards.add(addedCard);
    }
    public void add(SummonedWarriorCard addedCard){
        summonedWarriorCards.add(addedCard);
    }

    public ObservableList<EffectCard> getEffectCards() {
        return effectCards;
    }

    public ObservableList<SummonedWarriorCard> getSummonedWarriorCards() {
        return summonedWarriorCards;
    }

    public void removeEffect(EffectCard e){
        effectCards.remove(effectCards.indexOf(e));
    }

}
