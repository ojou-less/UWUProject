package com.PROG2.Model.Database;

import com.PROG2.Model.Cards.EffectCard;
import com.PROG2.Model.Cards.SummonedWarriorCard;
import com.PROG2.Model.PlayerAttachment.*;

import java.io.*;
import java.util.Scanner;


public class InputClass {
    private static InputStreamReader abilities;
    private static InputStreamReader armors;
    private static InputStreamReader artifacts;
    private static InputStreamReader classTypes;
    private static InputStreamReader effectCards;
    private static InputStreamReader startDecks;
    private static InputStreamReader warriorCards;
    private static InputStreamReader weapons;

    public boolean inputFill(){
        boolean res = false;
        try{
            abilities();
            armors();
            artifacts();
            classTypes();
            effectCards();
            warriorCards();
            startDecks();
            weapons();
            res = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return res;
    }

    public static void abilities() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Ability.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] activeLine = line.split("-");
            Abilities.addEffect(new Ability(
                    Integer.getInteger(activeLine[0]),
                    Integer.getInteger(activeLine[1]),
                    activeLine[2],
                    activeLine[3],
                    Double.valueOf(activeLine[4]),
                    Double.valueOf(activeLine[5]),
                    Double.valueOf(activeLine[6]),
                    Double.valueOf(activeLine[7]),
                    Integer.getInteger(activeLine[8])));
        }
    }

    public static void armors() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] activeLine = line.split("-");
            Armors.add(new Armor(
                    Integer.getInteger(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Double.valueOf(activeLine[3])
            ));//(int ID, String objName, String iconPath, double health, double addHealth)
        }

    }

    public static void artifacts() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Artifacts.add(new Artifact(
                    Integer.getInteger(activeLine[0]),
                    activeLine[2],
                    activeLine[3],
                    Double.valueOf(activeLine[4]),
                    Double.valueOf(activeLine[5]),
                    Double.valueOf(activeLine[6]),
                    Double.valueOf(activeLine[7]),
                    Integer.getInteger(activeLine[8])
            ));
        }

    }

    public static void classTypes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            ClassTypes.add(new ClassType(
                    activeLine[0],
                    activeLine[1],
                    Abilities.get(Integer.valueOf(activeLine[3])%100-1)
            ));
        }

    }

    public static void effectCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            EffectCards.add(new EffectCard(
                    Integer.getInteger(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Abilities.get(Integer.valueOf(activeLine[3])%100-1),
                    Integer.valueOf(activeLine[4]),
                    Integer.valueOf(activeLine[5])
            ));//EffectCard(int ID, String objName, String iconPath, Ability cardAbility, int buyCost, int summonCost)

        }


    }

    public static void startDecks() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Deck activeDeck = new Deck();
            for (String obj:
                 activeLine) {

                int id = Integer.valueOf(obj);
                if (id>=0 && id<=99){
                    activeDeck.add(WarriorCards.get(id));
                }else{
                    activeDeck.add(EffectCards.get((id % 100)-1));
                }
            }
            StartDecks.add(activeDeck);
        }
    }

    public static void warriorCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            WarriorCards.add(new SummonedWarriorCard(
                    Integer.getInteger(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Double.valueOf(activeLine[3]),
                    Double.valueOf(activeLine[4]),
                    Double.valueOf(activeLine[5]),
                    Integer.getInteger(activeLine[6]),
                    Integer.getInteger(activeLine[7]),
                    Boolean.valueOf(activeLine[8]),
                    Integer.getInteger(activeLine[9])
            ));//SummonedWarriorCard(int ID, String objName, String iconPath, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon, int buyCost)

        }
    }

    public static void weapons() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("filename"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Weapons.add(new Weapon(
                    Integer.getInteger(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Integer.getInteger(activeLine[3]),
                    Double.valueOf(activeLine[4]),
                    Integer.getInteger(activeLine[5]),
                    Integer.getInteger(activeLine[6])
            ));
        }
    }
    //Weapon(int ID, String objName, String iconPath, int level, double hit, int range, int cost)
}
