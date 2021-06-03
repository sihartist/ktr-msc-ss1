
public class Mage extends Character{
	
	public Mage(String name) {
		super(name, "Mage",70,3,10,10);
		System.out.println(this.getName()+": May the gods be with me.");
	}
	
	protected void attack(String weapon) {
		if(weapon.equalsIgnoreCase("magic") || weapon.equalsIgnoreCase("wand")) {
			super.attack(weapon);
			System.out.println(this.getName() + ": I'll crush you with my "+weapon+"!");
		}
		else{
			System.out.println(this.getName() + ": What are you doing? I don't have a "+weapon+"!");
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
