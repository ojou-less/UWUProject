package com.PROG2.Model.PlayerAttachment;

/**
 * @author Niclas Rieckers
 * Klasse Artifact, erbt von Superklasse Ability. Wird gebraucht, um Spiel-Objekte "Artifacts"
 * erzeugen zu können. Da Atrifact quasie wie Ability ist nur der Timer ist auf -1 um denn Effekt unendlich zu taetigen.
 */
public class Artifact extends Ability {

    public Artifact(int ID, String name, String iconPath, double increaseHealth, double increaseMana, double increaseDamage, double increaseArmor, int increaseDrawLimit) {
        super(ID,-1, name, iconPath, increaseHealth, increaseMana, increaseDamage, increaseArmor, increaseDrawLimit);
    }

}
