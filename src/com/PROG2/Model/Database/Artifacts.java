package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Artifact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Artifacts {
    private static ObservableList<Artifact> artifacts = FXCollections.observableArrayList();

    public Artifacts() {
    }

    public static ObservableList<Artifact> artifacts() {
        return artifacts;
    }

    public static Artifact get(int i){
        return Artifacts.artifacts().get(i);
    }

    public static Artifacts setArtifacts(ObservableList<Artifact> artifacts) {
        Artifacts.artifacts = artifacts;
        return null;
    }
    public static Artifacts add(Artifact artifact){
        artifacts.add(artifact);
        return null;
    }
}
