package Exceptions;

public class Warrior extends Character{
	public Warrior(String name) {
		super(name, "Warrior",100,10,8,3);
		System.out.println(this.getName()+": My name will go down in history!");
	}

	public void tryToAttack(String weapon) {
		try {
			this.attack(weapon);
			if(weapon.equalsIgnoreCase("hammer") || weapon.equalsIgnoreCase("sword")) {
				System.out.println(this.getName()+": Rrrrrrrr....");
				System.out.println(this.getName() + ": I'll crush you with my "+weapon);	
			}	
			else 
				System.out.println(this.getName() + ": A "+weapon+"?? What should I do with this?!");	
		}catch(WeaponException e) {
			System.out.println(e.getMessage());
		}
	}
		
	public void moveRight() {
		super.moveRight();
		System.out.println(" like a bad boy.");
	}
	
	public void moveLeft() {
		super.moveLeft();
		System.out.println(" like a bad boy.");
	}
	
	public void moveForward() {
		super.moveBack();
		System.out.println(" like a bad boy.");
	}
	
	public void moveBack() {
		super.moveBack();
		System.out.println(" like a bad boy.");
	}
}
