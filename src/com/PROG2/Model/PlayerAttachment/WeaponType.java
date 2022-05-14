package com.PROG2.Model.PlayerAttachment;

/**
 * Enum-Klasse ist dazu gemacht, damit die Waffen-Art verwenden kann. Es ist eine einfache Lösung, wenn Ich
 * enum-Objekte verwende.
 */
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
