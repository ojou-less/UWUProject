package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import com.PROG2.Model.PlayerAttachment.ClassType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ClassTypes {

    private static ObservableList<ClassType> classTypes = FXCollections.observableArrayList();
    public ClassTypes(){

    }
    public static ObservableList<ClassType> getClassTypes() {
        return classTypes;
    }

    public static ClassType get(int i){
        return ClassTypes.getClassTypes().get(i);
    }

    public static EffectCards setEffectCards(ObservableList<ClassType> classTypes) {
        ClassTypes.classTypes = classTypes;
        return null;
    }

    public static ClassTypes add(ClassType classType){
        classTypes.add(classType);
        return null;
    }
}
