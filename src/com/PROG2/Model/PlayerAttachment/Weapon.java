package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.Useable;

/** To-Do-List:
 *  Methode herstellen für Waffen und Eigenschaften einzelnen Waffen
 *  .json für neue Methode
 *  upgrade- und purcharseWeapon-Methode vollständigen
 *
 *  Ideen & feedback: (Wenn du Idee oder feedback hast für diese Klasse, kannst du unten in die Kommentare)
 *
 *
 *
 */

public class Weapon extends Useable {
    //----------------------------Attributes----------------------------
    //: External classes
    private Player player;
    private DungeonMaster dungeonMaster;

    //: Main attribute
    private String weaponName;

    public Weapon(int ID) {
        super(ID);
    }

    private enum weaponType {SWORD, BOW, SPEAR, AXE, CLUB,};
    private int weaponLevel;

    //: Combat attribute
    private double hitDamage;
    //private double sideEffect;

    //: Shop
    private int zen;
    private double weaponPrice;
    private double upgradePrice;

    //: Simulation (Prüfen, ob die Waffen kaufen kann oder upgraden kann) (Ohne GUI)
    private boolean purcharseWeaponAccepted;
    private boolean canUpgradeWeapon;

    //--------------------------Getter & Setter----------------------------
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponLevel() {
        return weaponLevel;
    }
    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public double getHitDamage() {
        return hitDamage;
    }
    public void setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
    }

    public int getZen() {
        return zen;
    }
    public void setZen(int zen) {
        this.zen = zen;
    }

    public double getWeaponPrice() {
        return weaponPrice;
    }
    public void setWeaponPrice(double weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public double getUpgradePrice() {
        return upgradePrice;
    }

    public void setUpgradePrice(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    //---------------------------Methods--------------------------------


    public void purcharseWeapon(double weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public void upgradeWeapon(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

}
