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
    public Deck getCards(){
        return cards;
    }
    public void setCards(Deck cards){
        this.cards = cards;
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
