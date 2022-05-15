package com.PROG2.Model.PlayerAttachment;
/**
 * Klasse ClassType, wird gebraucht, um Spiel-Objekte "ClassTypes"
 * erzeugen zu können.
 */
public class ClassType {
    private String name;
    private String iconpath;
    private Deck cards;
    private Ability ability;

    public ClassType(String name, String iconpath, Ability ability) {
        this.name = name;
        this.iconpath = iconpath;
        this.ability = ability;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getIconpath(){
        return iconpath;
    }
    public void setIconpath(String iconpath){
        this.iconpath = iconpath;
    }
    public int getAbilityID(){
        return ability.getID();
    }
    public Ability getAbility(){
        return ability;
    }
    public void setAbility(Ability ability){
        this.ability = ability;
    }
}
