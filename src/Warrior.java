
public class Warrior extends Character{
	public Warrior(String name) {
		super(name, "Warrior",100,10,8,3);
		System.out.println(this.getName()+": My name will go down in history!");
	}
	
	protected void attack(String weapon) {
		if(weapon.equalsIgnoreCase("hammer") || weapon.equalsIgnoreCase("sword")) {
			super.attack(weapon);
			System.out.println(this.getName() + ": Feel the power of my "+weapon+"!");
		}
		else{
			System.out.println(this.getName() + ": What are you doing? I don't have a "+weapon+"!");
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
