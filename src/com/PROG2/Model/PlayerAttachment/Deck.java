package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.EffectCard;
import com.PROG2.Model.SummonedWarriorCard;
import javafx.collections.ObservableList;
import static com.PROG2.util.MyIO.*;

public class Deck {
    private ObservableList<EffectCard> effectCards;
    private ObservableList<SummonedWarriorCard> summonedWarriorCards;

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
