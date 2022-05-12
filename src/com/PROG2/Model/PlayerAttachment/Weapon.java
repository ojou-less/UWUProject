package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.Usable;

import java.util.Random;

/** To-Do-List:
 *  Methode herstellen für Waffen und Eigenschaften einzelnen Waffen
 *  .json für neue Methode
 *  upgrade- und purcharseWeapon-Methode vollständigen
 *
 * Git test
 */

public class Weapon extends Usable {
    //----------------------------Attributes----------------------------
    //: Main attribute ---------------------------
    int ID;
    String weaponName;
    WeaponType weaponType;
    int[] weaponLevel = {1, 2, 3}; //Wie in Spiel hat 3 Levels
    //: Combat attribute -------------------------8o
    double hitDamage;
    //private double sideEffect;
    //: Shop --------------------------
    public double zen;
    private double purchasePrice = zen;
    private final double sellPrice = purchasePrice * 0.8;
    private double upgradePrice = zen;
    private final boolean[] hasWeapon = {false, true};
    //: Simulation (Prüfen, ob die Waffen kaufen kann oder upgraden kann) (Ohne GUI)
    private boolean purcharseWeaponAccepted;
    private boolean canUpgradeWeapon;

    public Weapon(int ID, String weaponName, WeaponType weaponType, double hitDamage, double zen) {
        super(ID);
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.hitDamage = hitDamage;
        this.zen = zen;
    }

    //--------------------------Getter & Setter----------------------------
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int[] getWeaponLevel() {
        return weaponLevel;
    }
    public void setWeaponLevel(int[] weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public double getHitDamage() {
        return hitDamage;
    }
    public void setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
    }

    public double getZen() {
        return zen;
    }
    public void setZen(double zen) {
        this.zen = zen;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double weaponPrice) {
        this.purchasePrice = weaponPrice;
    }

    public double getUpgradePrice() {
        return upgradePrice;
    }

    public void setUpgradePrice(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    //---------------------------Methods--------------------------------

    public void weaponHit(double hitDamage, int[] weaponLevel) throws Exception {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        /* weaponHit: Die Waffen werden zufällige Damage verursachen, je höher der Waffenlevel ist
         *  desto schädlicher die Waffen sind.
         */
        for (int i = 0; i <= weaponLevel.length; i++) {
            int r1 = 1;
            int r2 = (int) (r1 * 1.6);
            Random randomDamage = new Random(r1);
            if (i == 1) {
                hitDamage = hitDamage * randomDamage.nextDouble(r1, r2);
            } else if (i == 2) {
                hitDamage = hitDamage * randomDamage.nextDouble(r1+1, r2);
            } else if (i == 3) {
                hitDamage = hitDamage * randomDamage.nextDouble(r1+2, r2+2);
            } else {
                System.out.println("ERROR 1823: Weapon is corrupted, no level detected please " +
                        "report this to our development team: ");
            }
        }
    }
}

