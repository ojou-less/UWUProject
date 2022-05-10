package com.PROG2.Model.Database;

public class Useable {
    private int ID;

    public Useable(int ID) {
        this.ID = ID;
    }

    public int ID() {
        return ID;
    }

    public Useable setID(int ID) {
        this.ID = ID;
        return this;
    }
}
