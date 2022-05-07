package test;

import java.util.List;

public abstract class Player {
	private double level;
	private int mana;
	private Weapon weapon;
	private List<Artifact> artifacts;
	private ClassType classType;
	private int drawLimit;
	private Deck cards;
	private Ability talentList;
}
