package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.Useable;

import java.util.Random;

/** To-Do-List:
 *  Methode herstellen für Waffen und Eigenschaften einzelnen Waffen
 *  .json für neue Methode
 *  upgrade- und purcharseWeapon-Methode vollständigen
 *
 * Git test
 */

public class Weapon extends Useable {
    //----------------------------Attributes----------------------------
    //: External classes
    private Player player;
    private DungeonMaster dungeonMaster;

    //: Main attribute ---------------------------
    String weaponName;
    private enum weaponType {SWORD, BOW, SPEAR, AXE, CLUB,};
    int[] weaponLevel = {1, 2, 3}; //Wie in Spiel hat 3 Levels
    //: Combat attribute -------------------------
    double hitDamage;
    private Random randomDamage;
    //private double sideEffect;
    //: Shop --------------------------
    private int zen;
    private double weaponPrice;
    private double upgradePrice;
    private final boolean[] hasWeapon = {false, true};
    //: Simulation (Prüfen, ob die Waffen kaufen kann oder upgraden kann) (Ohne GUI)
    private boolean purcharseWeaponAccepted;
    private boolean canUpgradeWeapon;

    public Weapon(int ID) {
        super(ID);
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

    public void weaponHit(double hitDamage, int[] weaponLevel, Exception e) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        /* weaponHit: Die Waffen werden zufällige Damage verursachen, je höher der Waffenlevel ist
         *  desto schädlicher die Waffen sind.
         */
        for (int i = 0; i <= weaponLevel.length; i++) {
            if (i == 1) {
                hitDamage = hitDamage * randomDamage.nextDouble(1, 1.6);
            } else if (i == 2) {
                hitDamage = hitDamage * randomDamage.nextDouble(2, 3.2);
            } else if (i == 3) {
                hitDamage = hitDamage * randomDamage.nextDouble(3, 5);
            } else {
                System.out.println("ERROR 1823: Weapon is corrupted, no level detected please " +
                        "report this to our development team: ");
                e.printStackTrace();
            }
        }
    }
    public void purcharseWeapon(double weaponPrice, int p) {
        this.weaponPrice = weaponPrice;

        if (hasWeapon[p] = true) {
            System.out.println("You have already purchased this weapon. Buy other weapon!");
            return;
        }


    }

    public void upgradeWeapon(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

}
