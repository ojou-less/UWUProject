package com.PROG2;


import com.PROG2.Model.Database.*;
import com.PROG2.Model.PlayerAttachment.Adventurer;
import com.PROG2.Model.PlayerAttachment.DungeonMaster;



public class Start {
    public static void main(String[] args) {
        if(InputClass.inputFill()){
            System.out.println(Abilities.effectList().toString());
            System.out.println(Armors.armors().toString());
            System.out.println(Artifacts.artifacts().toString());
            System.out.println(CharacterTypes.getClassTypes().toString());
            System.out.println(EffectCards.getEffectCards().toString());
            System.out.println(StartDecks.decks().toString());
            System.out.println(WarriorCards.warriorCards().toString());
            System.out.println(Weapons.weapons().toString()+"\n");
            DungeonMaster dungeonMaster = new DungeonMaster(1,10,50,2,CharacterTypes.getClassTypes().get(0),8,1000);
            dungeonMaster.setCards(StartDecks.decks().get(0));
            System.out.println(dungeonMaster.toString());
            Adventurer adventurer = new Adventurer(1,10,50,2,CharacterTypes.getClassTypes().get(0),8,1000);
            adventurer.setCards(StartDecks.decks().get(0));
            System.out.println(adventurer.toString());

        }


    }

}
