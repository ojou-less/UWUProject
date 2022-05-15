package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import com.PROG2.Model.PlayerAttachment.WeaponType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * Klasse für den Zwischenspeicher der Objekte vom Typ Weapon
 * vor der Serialisierung.
 */
public class Weapons {
    private static ObservableList<Weapon> weapons = FXCollections.emptyObservableList();
    // ----- List-Weapons
    // Swords
    private final static Weapon swordOne = new Weapon(400,"Iron Sword", WeaponType.SWORD,10, 1,50);
    private final static Weapon swordTwo = new Weapon(401,"Majestic Sword", WeaponType.SWORD,15, 1, 200);
    private final static Weapon swordThree = new Weapon(402,"Ezclak", WeaponType.SWORD,14, 1, 180);
    private final static Weapon swordFour = new Weapon(403,"Dungeon Excalibur", WeaponType.SWORD,20, 1, 666);
    // Bows 421-436
    private final static Weapon bowOne = new Weapon(421, "Classical Bow", WeaponType.BOW, 8, 1, 50);
    // Axes 437-457
    private final static Weapon axeOne = new Weapon(437, "Housemade Axe", WeaponType.AXE, 15, 0.6, 50);
    // Spears 458-473
    private final static Weapon spearOne = new Weapon(458, "Wood Spear", WeaponType.SPEAR, 10, 0.8, 50);
    // Clubs 474-489
    private final static Weapon clubOne = new Weapon(474, "Orge Club", WeaponType.CLUB, 9, 0.6, 40);
    //----- End

    public Weapons() {

    }

    public static ObservableList<Weapon> weapons() {
        return weapons;
    }

    public static Weapon get(int i){
        return Weapons.weapons().get(i);
    }

    public static Weapons setWeapons(ObservableList<Weapon> weapons) {
        Weapons.weapons = weapons;
        return null;
    }

    /**
     * add() Methode speichert die Waffen, die in Attribute deklariert und initialisiert wurden.
     */
    public static Weapons add(){
        weapons.add(swordOne);
        weapons.add(swordTwo);
        weapons.add(swordThree);
        weapons.add(swordFour);
        weapons.add(bowOne);
        weapons.add(axeOne);
        weapons.add(spearOne);
        weapons.add(clubOne);
        return null;
    }
}
