package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private int petCleanliness;
	private boolean petAlive;

	public Pet(String petName, String petType, int petCleanliness, boolean petAlive) {

		this.petName = petName;
		this.petType = petType;
		this.petCleanliness = petCleanliness;
		this.petAlive = true;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getPetCleanliness() {
		return petCleanliness;
	}
	
	public boolean getPetAlive() {
		return petAlive;
	}

	public void incrementStatus() {
		petCleanliness -= 5;
		return;

	}

	public void cleanPet() {
		petCleanliness += 50;
		return;
	}

	public void playPet() {
		petCleanliness -= 10;
		return;

	}

	public void sleepPet() {
		System.out.println("You pet slept for 2 hours");
		return;

	}
	
	public void feedPet() {
		return;
	}
	
	public void die() {
		return;
	}
			
}

