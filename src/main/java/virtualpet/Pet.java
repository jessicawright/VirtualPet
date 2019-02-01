package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private boolean petAlive;

	public Pet(String petName, String petType, boolean petAlive) {

		this.petName = petName;
		this.petType = petType;
		this.petAlive = true;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public void incrementStatus() {
		die();
		return;

	}

	public  boolean getPetAlive() {
		
		return petAlive;
	}
	
	public void die() {
		this.petAlive = false;
	}

}
