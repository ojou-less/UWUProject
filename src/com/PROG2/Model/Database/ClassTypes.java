package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import com.PROG2.Model.PlayerAttachment.ClassType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * Klasse für das zwischenspeichern der Objekte vom Typ ClassType
 * vor der Serialisierung.
 */
public class ClassTypes {

    private static ObservableList<ClassType> classTypes = FXCollections.observableArrayList();
    public ClassTypes(){

    }
    public static ObservableList<ClassType> getClassTypes() {
        return classTypes;
    }

    public static void get(int i){
        classTypes.get(i);
    }

    public static void add(ClassType classType){
        classTypes.add(classType);

    }
}
