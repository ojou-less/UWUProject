package com.PROG2.Model.PlayerAttachment;


import com.PROG2.Model.Database.Usable;

import java.util.Random;

/**
 * Klasse für die Erzeugung eines Weapon Objektes. Erbt von Usable da Weapon zu den vom Spieler nutzbaren Items gehört.
 */


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

    /**
     * Die Konstruktor Weapon erzeugt alle Information von einzelnen Waffen zur Klasse Database.Weapons.
     * Darauf sind: Waffen-ID (Aus Klasse: Usable), Waffenname, Waffenart (Aus Enum-Klasse: WeaponType),
     * Angriffsschaden, Trefferchance und dem Kaufpreis in Spiel-Währung "Zen".
     */
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
     * Hier wird alle Hits von verschiedenen Waffen getrennt durch eine switch-case. Alle cases werden unterschiedliche
     * Hit-Methode aufgerufen.
     *
     * Jeder Waffe sollte ein bisschen stärker oder schwächer schlagen, manchen Waffen müssen bestimmte Angriffsgeschwindigkeit
     * erreichen, wenn sie treffen wollen (Die Waffen Axe und Schläger). Je langsamer ist die Angriffsgeschwindigkeit,
     * desto höhere Chance der Gegner hat, der Angriff auszuweichen. Die Angriffsschäden und Angriffsgeschwindigkeiten
     * sind Mithilfe von einer Random-Klasse erzeugt.
     *
     * Bogen und Lanzen werden mit einem Range (Reichweite) erzeugt, Bogen haben bis 3 Blöcke Reichweite,
     * Lanze bis 2 Blöcke. Je nähe der Gegner ist, desto der Angriff schwächer ist, aber hat höhere Chance zu treffen,
     * je weiter der Gegner ist, desto weniger Chance hat, zu treffen, aber der Angriff ist stärker.
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
     * Das Schwert benötigt keine Trefferchance, je höher der Level einer Waffe hat, desto
     * stärker die Angriffe sind.
     *
     * Die Angriffsschäden sind mit Random-Klasse erzeugt, sie versuchen bei jeder Angriff unterschiedlichen
     * Hit-Punkte, zu erzeugen, ohne die grundsätzliche Angriffsschaden zu hoch unterscheiden.
     * z.B: Iron Sword mit Waffen-Level 1 hat 10 Angriffsschaden,
     * jeder Runde greif der Spieler zwischen 10 Hit-Damage und 16 Hit-Damage.
     */
    public void swordHit(double hitDamage, int[] weaponLevel) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        /* weaponHit: Die Waffen werden zufällige Damage verursachen, je höher der Waffenlevel ist
         *  desto schädlicher die Waffen sind.
         */
        for (int i = 0; i <= weaponLevel.length; i++) {
            int r1 = 1;
            double r2 = r1 * 1.6;
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
     * haben. Je tiefer der Trefferchance ist, desto höhere Chance der Gegner hat, dieser Hit auszuweichen.
     * Sie haben aber stärkere Angriffsschaden als ein Schwert.
     *
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
            double r2 = r1 * 1.6;
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
     * Wie oben in weaponHit erklärt, Lanze hat eine Reichweite bis 2 Blöcke. Level wird hier wie andere
     * Waffen auch betrachtet.
     */

    public void spearHit(int range, double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;

        for(int s = 0; s <= range; s++) {
            for(int l = 0; l <= weaponLevel.length; l++) {
                int r1 = 1;
                double r2 = r1 * 1.6;
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

    /**
     * Bogen haben immer 3 Blöcke Reichweite, wie in weaponHit-Methode kommentiert.
     */
    public void bowHitSpeedRange(int range, double hitDamage, int[] weaponLevel, double hitSpeed) {
        this.hitDamage = hitDamage;
        this.weaponLevel = weaponLevel;
        this.hitSpeed = hitSpeed;

        for(int s = 0; s <= range; s++) {
            for(int l = 0; l <= weaponLevel.length; l++) {
                int r1 = 1;
                double r2 = r1 * 1.6;
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

