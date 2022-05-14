package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import com.PROG2.Model.PlayerAttachment.ClassType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * Klasse für das zwischenspeichern der Objekte vom Typ ClassType
 * vor der Speicherung.
 */
public class ClassTypes {

    private ObservableList<ClassType> classTypes = FXCollections.observableArrayList();
    public ClassTypes(){

    }
    public ObservableList<ClassType> getClassTypes() {
        return classTypes;
    }

    public ClassType get(int i){
        return this.classTypes.get(i);
    }

    public ClassTypes add(ClassType classType){
        classTypes.add(classType);
        return null;
    }
}
