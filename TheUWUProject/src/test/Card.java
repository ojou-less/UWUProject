package test;

public abstract class Card {
	private int id;
	private boolean alive;
	private float hitDamage;
	private float defense;
	private Ability ability;
	private int hitRange;
	//summon type?.
	private int moveRange;
	
	public abstract boolean canSummon();
	public abstract boolean effectClear();
}
