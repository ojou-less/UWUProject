package com.PROG2.Model.PlayerAttachment;

import com.PROG2.Model.Database.Usable;

public class OwnWeapon extends Usable {
    private String name;
    private String iconPath;
    private int level;
    private double hit;
    private int range;
    private int cost;

    public OwnWeapon(int ID, String name, String iconPath, int level, double hit, int range, int cost) {
        super(ID);
        this.name = name;
        this.iconPath = iconPath;
        this.level = level;
        this.hit = hit;
        this.range = range;
        this.cost = cost;
    }

    public String name() {
        return name;
    }

    public OwnWeapon setName(String name) {
        this.name = name;
        return this;
    }

    public String iconPath() {
        return iconPath;
    }

    public OwnWeapon setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    public int level() {
        return level;
    }

    public OwnWeapon setLevel(int level) {
        this.level = level;
        return this;
    }

    public double hit() {
        return hit+(hit*(level()*0.2));
    }

    public OwnWeapon setHit(double hit) {
        this.hit = hit;
        return this;
    }

    public int range() {
        return range;
    }

    public OwnWeapon setRange(int range) {
        this.range = range;
        return this;
    }

    public int zen() {
        return cost;
    }

    public OwnWeapon setCost(int cost) {
        this.cost = cost;
        return this;
    }
}
