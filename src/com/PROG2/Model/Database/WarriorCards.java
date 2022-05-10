package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import com.PROG2.Model.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class WarriorCards {
    private ObservableList<SummonedWarriorCard> warriorCards = FXCollections.emptyObservableList();

    public WarriorCards(ObservableList<SummonedWarriorCard> warriorCards) {
        this.warriorCards = warriorCards;
    }

    public ObservableList<SummonedWarriorCard> warriorCards() {
        return warriorCards;
    }

    public SummonedWarriorCard get(int i){
        return this.warriorCards().get(i);
    }

    public WarriorCards setWarriorCards(ObservableList<SummonedWarriorCard> warriorCards) {
        this.warriorCards = warriorCards;
        return this;
    }
    public WarriorCards add(SummonedWarriorCard summonedWarriorCard){
        warriorCards.add(summonedWarriorCard);
        return this;
    }
}
