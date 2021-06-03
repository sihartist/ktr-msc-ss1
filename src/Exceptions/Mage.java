package Exceptions;


public class Mage extends Character{
	
	public Mage(String name) {
		super(name, "Mage",70,3,10,10);
		System.out.println(this.getName()+": May the gods be with me.");
	}

	public void tryToAttack(String weapon) {
		try {
			this.attack(weapon);
			if(weapon.equalsIgnoreCase("magic") || weapon.equalsIgnoreCase("wand")) {
				System.out.println(this.getName()+": Rrrrrrrr....");
				System.out.println(this.getName() + ": Feel the power of my "+weapon+"!");}
			else 
				System.out.println(this.getName() + ": I don 't need this stupid "+weapon+"! Don 't misjudge my powers !");	
		} catch (WeaponException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void moveRight() {
		super.moveRight();
		System.out.println(" furtively.");
	}
	
	public void moveLeft() {
		super.moveLeft();
		System.out.println(" furtively.");
	}
	
	public void moveForward() {
		super.moveBack();
		System.out.println(" furtively.");
	}
	
	public void moveBack() {
		super.moveBack();
		System.out.println(" furtively.");
	}

}
