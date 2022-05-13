package com.PROG2.Model.PlayerAttachment;

public enum WeaponType {
    AXE('A'),
    BOW('B'),
    CLUB('C'),
    SPEAR('S'),
    SWORD('W');

    final char c;
    WeaponType(char c) {
        this.c = c;
    }
}
