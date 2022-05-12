package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Weapon;
import com.PROG2.Model.PlayerAttachment.WeaponType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Weapons {
    private static ObservableList<Weapon> weapons = FXCollections.emptyObservableList();
    // ----- List-Weapons
    // Swords
    private static Weapon swordOne = new Weapon(400,"Iron Sword", WeaponType.SWORD,10, 50);
    private static Weapon swordTwo = new Weapon(401,"Magestic Sword", WeaponType.SWORD,15, 200);
    private static Weapon swordThree = new Weapon(402,"Ezclak", WeaponType.SWORD,14, 180);
    private static Weapon swordFour = new Weapon(403,"Keine Ahnung", WeaponType.SWORD,20, 666);
    // Bows 421-436
    private static Weapon bowOne = new Weapon(421, "Classical Bow", WeaponType.BOW, 8, 50);
    // Axes 437-457
    private static Weapon axeOne = new Weapon(437, "Housemade Axe", WeaponType.AXE, 15, 50);
    // Spears 458-473
    private static Weapon spearOne = new Weapon(458, "Wood Spear", WeaponType.SPEAR, 10, 50);
    // Clubs 474-489
    private static Weapon clubOne = new Weapon(474, "Orge Club", WeaponType.CLUB, 9, 40);
    //----- End

    public Weapons() {
        ;
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
    public static Weapons add(Weapon weapon){
        weapons.add(weapon);
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
