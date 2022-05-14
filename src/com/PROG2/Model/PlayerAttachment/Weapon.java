package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.Usable;

import java.util.Random;

public class Weapon extends Usable {
    //----------------------------Attributes----------------------------
    //: Main attribute ---------------------------
    String weaponName;
    WeaponType weaponType;
    int[] weaponLevel = {1, 2, 3}; //Wie in Spiel hat 3 Levels
    //: Combat attribute -------------------------8o
    public double hitDamage;
    public double hitSpeed;
    //: Shop --------------------------
    char c;
    public double zen;
    //: Simulation

    public Weapon(int ID, String weaponName, WeaponType weaponType, double hitDamage, double hitSpeed, double zen) {
        super(ID);
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.hitDamage = hitDamage;
        this.hitSpeed = hitSpeed;
        this.zen = zen;

        try {
            weaponHit(weaponType, hitDamage, weaponLevel, hitSpeed);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //---------------------------Methods--------------------------------

    /**
     *
     * @param weaponType
     * @param hitDamage
     * @param weaponLevel
     * @param hitSpeed
     *
     * Hier wird alle Hits von verschiedenen Waffen getrennt durch eine switch-case. Alle cases werden unterschiedliche
     * Hit-Methode aufgerufen.
     *
     * Jeder Hit sollte ein bisschen stärker oder schwächer schlagen, einige sogar muss bestimmte Schlaggeschwindigkeit
     * erreichen, wenn sie treffen wollen (Axe, Clubs). Je langsamer ist die Geschwindigkeit, desto höhere Chance der Gegner hat,
     * die Hit ausweichen.
     *
     * Bogen und Spear werden mit einem Range, Bogen haben bis 3 Blocken, Spear bis 2. Je nähe der Gegner ist, desto der Hit schwächer ist,
     * aber hat höhere Chance zu treffen, je weiter der Gegner ist, desto weniger Chance hat, zu treffen, aber der Hit ist stärker.
     */
    public void weaponHit(WeaponType weaponType, double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.weaponType = weaponType;
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;

        switch (c) {
            case 'A':
                axeHit(hitDamage,weaponLevel,hitSpeed);
            case 'B':
                bowHitSpeedRange(3, hitDamage, weaponLevel, hitSpeed);
            case 'C':
                axeHit(hitDamage,weaponLevel,hitSpeed);
            case 'S':
                spearHit(2, hitDamage, weaponLevel, hitSpeed);
            case 'W':
                swordHit(hitDamage, weaponLevel);
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

    }

    /**
     *
     * @param hitDamage
     * @param weaponLevel
     *
     * Das Schwert benötigt keine Trefferchance, weil sie immer treffen, je höher der Level einer Waffe hat, desto
     * stärker die Hits sind.
     */
    public void swordHit(double hitDamage, int[] weaponLevel) {
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
                hitDamage = hitDamage * randomDamage.nextDouble(r1+1, r2+1);
            } else if (i == 3) {
                hitDamage = hitDamage * randomDamage.nextDouble(r1+2, r2+2);
            } else {
                System.out.println("ERROR 1823: Weapon level not detected. Please " +
                        "report this to our development team: ");
            }
        }
    }

    /**
     * Die axeHit-Methode gilt für Axe und Schläger, wie oben bei weaponHit und swordHit erklärt wurde, je höher
     * die Level einer Waffe hat, desto stärker die Hits sind. Aber auch jeder Hit kann höhere oder tiefere Trefferchance
     * haben. Je tiefer der Trefferchance ist, desto der Gegner höhere Chance hat, dieser Hit auszuweichen.
     * Sie haben aber stärkere hitDamage als ein Schwert.
     *
     * @param hitDamage
     * @param weaponLevel
     * @param hitSpeed
     */

    public void axeHit(double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;
        /* weaponHit: Die Waffen werden zufällige Damage verursachen, je höher der Waffenlevel ist
         *  desto schädlicher die Waffen sind.
         */
        for (int i = 0; i <= weaponLevel.length; i++) {
            int r1 = 1;
            int r2 = (int) (r1 * 1.6);
            Random randomHit = new Random(r1);
            if (i == 1) {
                hitDamage = hitDamage * randomHit.nextDouble(r1, r2);
                hitSpeed = hitSpeed * randomHit.nextDouble(hitSpeed * 0.8,hitSpeed * 1.2);
            } else if (i == 2) {
                hitDamage = hitDamage * randomHit.nextDouble(r1+1, r2+1);
                hitSpeed = hitSpeed * randomHit.nextDouble(hitSpeed * 0.8,hitSpeed * 1.2);
            } else if (i == 3) {
                hitDamage = hitDamage * randomHit.nextDouble(r1+2, r2+2);
                hitSpeed = hitSpeed * randomHit.nextDouble(hitSpeed * 0.8,hitSpeed * 1.2);
            } else {
                System.out.println("ERROR 1823: Weapon level not detected. Please " +
                        "report this to our development team: ");
            }
        }
    }

    /**
     * Wie oben in weaponHit erklärt, Spear hat einen Range, also ein
     *
     * @param range
     * @param hitDamage
     * @param weaponLevel
     * @param hitSpeed
     */

    public void spearHit(int range, double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;

        for(int s = 0; s <= range; s++) {
            for(int l = 0; l <= weaponLevel.length; l++) {
                int r1 = 1;
                int r2 = (int) (r1 * 1.6);
                Random random = new Random(r1);
                // Range 1
                if (s == 1 && l == 1) {
                    hitDamage = hitDamage * random.nextDouble(r1, r2 + 0.2);
                }
                else if (s == 1 && l == 2) {
                    hitDamage = hitDamage * random.nextDouble(r1 + 1, r2 + 1.2);
                }
                else if (s == 1 && l == 3) {
                    hitDamage = hitDamage * random.nextDouble(r1 + 2, r2 * 2.2);
                }
                // Range 2
                else if (s == 2 && l == 1) {
                    hitDamage = hitDamage * random.nextDouble(r1 * 1.2, r2 * 1.2);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed*1.2);
                }
                else if (s == 2 && l == 2) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.2)*1.5, r2 * 1.5);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed*1.2);
                }
                else if (s == 2 && l == 3) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.2)*3, r2 * 3);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed*1.2);
                }
                // Error-Message
                else {
                    System.out.println("ERROR 1824: Weapon level and/other range not detected. Please " +
                            "report this to our development team: ");
                }
            }
        }
    }

    public void bowHitSpeedRange(int range, double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;

        for(int s = 0; s <= range; s++) {
            for(int l = 0; l <= weaponLevel.length; l++) {
                int r1 = 1;
                int r2 = (int) (r1 * 1.6);
                Random random = new Random(r1);
                // Range 1
                if (s == 1 && l == 1) {
                    hitDamage = hitDamage * random.nextDouble(r1, r2 + 0.2);
                }
                else if (s == 1 && l == 2) {
                    hitDamage = hitDamage * random.nextDouble(r1 + 1, r2 + 1.2);
                }
                else if (s == 1 && l == 3) {
                    hitDamage = hitDamage * random.nextDouble(r1 + 2, r2 * 2.2);
                }
                // Range 2
                else if (s == 2 && l == 1) {
                    hitDamage = hitDamage * random.nextDouble(r1 * 1.2, r2 * 1.2);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed);
                }
                else if (s == 2 && l == 2) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.2)*1.5, r2 * 1.5);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed);
                }
                else if (s == 2 && l == 3) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.2)*3, r2 * 3);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.6, hitSpeed);
                }
                // Range 3
                else if (s == 3 && l == 1) {
                    hitDamage = hitDamage * random.nextDouble(r1 * 1.6, r2 * 1.6);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.4, hitSpeed);
                }
                else if (s == 3 && l == 2) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.6)*1.5, r2 * 2.5);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.4, hitSpeed);
                }
                else if (s == 3 && l == 3) {
                    hitDamage = hitDamage * random.nextDouble((r1 * 1.6)*3, r2 * 5);
                    hitSpeed = hitSpeed * random.nextDouble(hitSpeed*0.4, hitSpeed);
                }
                // Error-Message
                else {
                    System.out.println("ERROR 1824: Weapon level and/other range not detected. Please " +
                            "report this to our development team: ");
                }
            }
        }
    }
}

