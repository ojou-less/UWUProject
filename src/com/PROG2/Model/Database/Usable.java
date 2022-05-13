package com.PROG2.Model.Database;

public class Usable {
    private int ID;

    public Usable(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Usable setID(int ID) {
        this.ID = ID;
        return this;
    }
}
