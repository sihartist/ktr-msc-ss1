
public abstract class Character {
	protected String name;
	final protected String RPGClass;
	protected int life = 50;
	protected int agility = 2;
	protected int strength = 2;
	protected int wit = 2;
	
	public Character(String name){
		this.name = name;
		RPGClass = "Character";
		life = 50;
		agility = 2;
		strength = 2;
		wit = 2;
	}
	
	public Character(String name, String RPGClass){
		this.name = name;
		this.RPGClass = RPGClass;
		life = 50;
		agility = 2;
		strength = 2;
		wit = 2;
	}
	
	public Character(String name, String RPGClass, int life, int agility, int strength, int wit){
		this.name = name;
		this.RPGClass = RPGClass;
		this.life = life;
		this.agility = agility;
		this.strength = strength;
		this.wit = wit;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected String getRPGClass() {
		return this.RPGClass;
	}
	
	protected int getLife() {
		return this.life;
	}
	
	protected int getAgility() {
		return this.agility;
	}
	
	protected int getStrength() {
		return this.strength;
	}
	
	protected int getWit() {
		return this.wit;
	}
	
	protected void attack(String weapon) {
		System.out.println(this.getName()+": Rrrrrrr....");
	}
}
