package com.PROG2.Model.Events;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class GameEvent {

    private ObservableList<Trader> trader = FXCollections.observableArrayList();
    private int upperbound = 3;

    public void randomEvent(){
        Random randNum = new Random();
        int randy = randNum.nextInt(upperbound);

        switch(randy){
            case 1: System.out.println("event 1");
            case 2: System.out.println("event 2");
            case 3: System.out.println("Trader Event");
            default: ;
        }
    }
}
