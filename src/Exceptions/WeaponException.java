package Exceptions;

@SuppressWarnings("serial")
public class WeaponException extends Exception{
	private String name;
	public WeaponException(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return name+": I refuse to fight with my bare hands.";
	}
}
