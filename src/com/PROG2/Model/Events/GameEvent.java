package com.PROG2.Model.Events;

import com.PROG2.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class GameEvent {

    private ObservableList<Trader> trader = FXCollections.observableArrayList();
    private int maxEventAmount = 3;

    public void randomEvent(){
        int randy = MyIO.random(1, 3);

        switch(randy){
            case 1: System.out.println("event 1");
            case 2: System.out.println("event 2");
            case 3: System.out.println("Trader Event");
            default: ;
        }
    }
}
