package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Artifact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Artifacts {
    private ObservableList<Artifact> artifacts = FXCollections.observableArrayList();

    public Artifacts(ObservableList<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public ObservableList<Artifact> artifacts() {
        return artifacts;
    }

    public Artifact get(int i){
        return this.artifacts().get(i);
    }

    public Artifacts setArtifacts(ObservableList<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public Artifacts add(Artifact artifact){
        artifacts.add(artifact);
        return this;
    }
}
