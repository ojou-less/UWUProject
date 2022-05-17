package com.PROG2;


import com.PROG2.Model.Database.Abilities;
import com.PROG2.Model.Database.InputClass;


public class Start {
    public static void main(String[] args) {
        if(InputClass.inputFill()){
            Abilities.effectList().toString();
            //Player player = new Player(1,10,5.0,2);
        }


    }

}
