package com.PROG2.Model.PlayerAttachment;

/**
 * Enum-Klasse ist kreiert, damit die Waffen unterschiedlich getrennt werden.
 * Wenn Ich ein neues Schwert erzeuge, verwende Ich diese Waffe als SWORD oder 'W'
 *
 * Die enum haben auch ein char Deklaration, wenn ich mit if-case oder switch-case wie in Klasse Weapon arbeite.
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
